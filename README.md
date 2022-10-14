# command-feign-client
A feign-client for FNT Command generated from OpenAPI 2.0 Specs 
 
## Versioning 
If there was a change in the API-Defintion (BGE or new release of FNT command) a new version of command-feign-client has to be built

Versioning should happen according to https://devhints.io/semver, so

* Version changes of FNT-Command that break the API, are a major change
* Version changes of FNT that add funtionality (backward compatible ) are minor changes
* Changes to entities performed by WiTCOM usualy are minor changes.
* bug-fixes by FNT or WiTCOM (entity) -> patch version

Document changes in Changelog.md 

* Version changes of FNT command
* Changes in BGE/Entities

## Quick build

* Update version in pom.xml. See Versioning !!
* Access to http://nexus.dev.witcom.services is required to download bge2swagger
* will deploy the library to http://nexus.dev.witcom.services

```console
make all
```

## Command bge2swagger
This library relies on command-bge2swagger (https://github.com/witcom-gmbh/command-bge2swagger) to build OpenApi 2.0 specs from the current FNT Command BGE-Specs

If you have access to WiTCOM Nexus the Quick-build will work.

If not,

* you need to build command-bge2swagger from source and place the JAR-file in ./tools/bge2swagger.jar
* you cannot run make all, run `make build` instead which will not try to deploy the library to WiTCOM Nexus




