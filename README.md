# application_properties

## Spring Boot application converts the command line properties into Spring Boot Enviroment properties
```shell
java -jar application_properties-0.0.1-SNAPSHOT.jar --server.port=9090 
```

## Externalized properties using -Dspring.config.location
```shell
java -jar -Dspring.config.location=~/.local/application.properties application_properties-0.0.1-SNAPSHOT.jar
```