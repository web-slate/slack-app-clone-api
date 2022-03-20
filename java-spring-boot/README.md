# Slack App Clone API in Java Spring Boot

## Requirements

For building and running the application you need:

- [JDK 11](https://www.oracle.com/be/java/technologies/javase/jdk11-archive-downloads.html)
- [Maven 3](https://maven.apache.org)

## Running the application locally

There are several ways to run a Spring Boot application on your local machine.
One way is to execute the `main` method in the `com.slack.slackcloneapi.SlackcloneapiApplication` class from your IDE.

Alternatively you can use the [Spring Boot Maven plugin](https://docs.spring.io/spring-boot/docs/current/reference/html/build-tool-plugins-maven-plugin.html) like so:

```shell
mvn spring-boot:run

# linkedin-clone-api
Linkedin clone api in Spring Boot

Clone this project from GIT

# Execution:
Step 1: Open Terminal - mvn clean install

Step 2: Open Terminal - mvn spring-boot:run

Step 3: Accessing the application with below url.  
http://localhost:8080/organization/1ae5241e-a51b-11ec-b909-0242ac120002

Step 4: Curl Command for Get Organization
1. curl --location --request GET 'http://localhost:8080/organization/1ae5241e-a51b-11ec-b909-0242ac120002'
Curl Command for Get Users
2. curl --location --request GET 'http://localhost:8080/users'
