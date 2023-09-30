# application_properties

## Spring Boot application converts the command line properties into Spring Boot Enviroment properties
```shell
java -jar application_properties-0.0.1-SNAPSHOT.jar --server.port=9090 
```

## Externalized properties using -Dspring.config.location
```shell
java -jar -Dspring.config.location=~/.local/application.properties application_properties-0.0.1-SNAPSHOT.jar
```

# Spring active profile in application.properties
While running the JAR file, we need to specify the spring active profile based on each properties file. By default, Spring Boot application uses the application.properties file. the command to set the spring active profile is show below
```shell
java -jar application_properties-0.0.1-SNAPSHOT.jar --spring.profiles.active=dev
```

You can set the enviroment using a global variable. You have to set si property into application.properties
```shell
server.port=9090
spring.application.name=fosfofosfo
spring.profiles.active=${SPRING_ENV}
```

In the command line 
```shell
export SPRING_ENV=dev
```

And execute the command
```shell
gradle build bootRun
```