OPENAPI_GENERATOR_RELEASE	?= 7.2.0
BGE2SWAGGER_RELEASE			?= 2.0.0
API_VERSION					?= $(shell date '+%Y%m%d%H%M%S')
all: clean deploy

clean:
	rm -f ./specs/command-openapi.json

tools/bge2swagger.jar:
	@echo "Installing bge2swagger"
	wget https://reposilite.witcom.services/maven-releases/de/witcom/bge2swagger/$(BGE2SWAGGER_RELEASE)/bge2swagger-$(BGE2SWAGGER_RELEASE).jar -O ./tools/bge2swagger.jar

tools/openapi-generator-cli.jar:
	@echo "Installing openapi-generator-cli"
	wget https://repo1.maven.org/maven2/org/openapitools/openapi-generator-cli/$(OPENAPI_GENERATOR_RELEASE)/openapi-generator-cli-$(OPENAPI_GENERATOR_RELEASE).jar -O ./tools/openapi-generator-cli.jar

specs/command-openapi.json: tools/bge2swagger.jar tools/openapi-generator-cli.jar
	@echo "Generate basic specs from ${CMD_BASE_URL}"
	GENERATOR_OUTPUT="/tmp/command-swagger.json" java -jar tools/bge2swagger.jar
	java -jar ./tools/openapi-generator-cli.jar generate -g openapi -o /tmp/out -i /tmp/command-swagger.json
	cat /tmp/out/openapi.json | jq '.info.version = "$(API_VERSION)"' > ./specs/command-openapi.json

build: specs/command-openapi.json
	mvn -Pgenerate-client package

deploy: specs/command-openapi.json
	mvn -Pgenerate-client deploy
