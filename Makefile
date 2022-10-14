OPENAPI_GENERATOR_RELEASE	?= 5.1.0
BGE2SWAGGER_RELEASE			?= 1.1.1
CMD_BASE_URL				?= https://rmdb.workspace.witcom.de

all: deploy clean

clean:
	rm -f ./specs/command-oas-oauth.json && rm -f ./specs/command-oas.json && rm -f ./specs/command-openapi.yml

tools/bge2swagger.jar:
	@echo "Installing bge2swagger"
	wget http://nexus.dev.witcom.services/repository/maven-releases/de/witcom/bge2swagger/$(BGE2SWAGGER_RELEASE)/bge2swagger-$(BGE2SWAGGER_RELEASE).jar -O ./tools/bge2swagger.jar

tools/openapi-generator-cli.jar:
	@echo "Installing openapi-generator-cli"
	wget https://repo1.maven.org/maven2/org/openapitools/openapi-generator-cli/$(OPENAPI_GENERATOR_RELEASE)/openapi-generator-cli-$(OPENAPI_GENERATOR_RELEASE).jar -O ./tools/openapi-generator-cli.jar

specs/command-oas-oauth.json: tools/bge2swagger.jar
	@echo "Generate basic specs from $(CMD_BASE_URL)"
	CMD_BASE_URL="$(CMD_BASE_URL)" GENERATOR_OUTPUT="./specs/command-oas.json" java -jar tools/bge2swagger.jar
	cat ./specs/command-oas.json | jq '. + {"securityDefinitions": {"rmdb_auth": {"type": "oauth2","tokenUrl": "https://petstore.swagger.io/oauth/authorize","flow": "clientCredentials","scopes": {}}}}' > ./specs/command-oas-oauth.json

specs/command-openapi.yml: tools/openapi-generator-cli.jar specs/command-oas-oauth.json
	@echo "Convert specs to OAS 3"
	java -jar ./tools/openapi-generator-cli.jar generate -g openapi-yaml -o /tmp/out -i ./specs/command-oas-oauth.json
	mv /tmp/out/openapi/openapi.yaml ./specs/command-openapi.yml

build: specs/command-openapi.yml
	mvn package

deploy: specs/command-openapi.yml
	mvn deploy
