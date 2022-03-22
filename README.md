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

## Following are the APIs provided
- GET /organization/1ae5241e-a51b-11ec-b909-0242ac120002
   ```js
    {
      "organization_name": "Full Stack",
      "organization_id": "1ae5241e-a51b-11ec-b909-0242ac120002"
    }
   ```
- GET /users
  ```js
   [{
     "username": "John",
     "email": "john@gmail.com",
     "user_id": "1e780ade-a524-11ec-b909-0242ac120002"
   },{
     "username": "Bob",
     "email": "bob@gmail.com",
     "user_id": "6ef005fc-a524-11ec-b909-0242ac120002"
   },{
     "username": "Alex",
     "email": "alex@gmail.com",
     "user_id": "7f093ecc-a524-11ec-b909-0242ac120002"
   }]
  ```
- POST /channel
  ```js
    {
      "channel_name": "slack",
      "organization_id": "1ae5241e-a51b-11ec-b909-0242ac120002",
      "description": "Slack channels",
      "is_private": true/false,
      "members":["1e780ade-a524-11ec-b909-0242ac120002","6ef005fc-a524-11ec-b909-0242ac120002","7f093ecc-a524-11ec-b909-0242ac120002"]
    }
   ```
- GET /channel
 ```js
    [{
      "channel_name": "general",
      "channel_id": "4f0300c2-a51b-11ec-b909-0242ac120002",
      "organization_id": "1ae5241e-a51b-11ec-b909-0242ac120002",
       "description": "General channels",
      "is_private": true,
       "members":[{
      "username": "John",
      "email": "john@gmail.com",
      "user_id": "1e780ade-a524-11ec-b909-0242ac120002"
    },{
      "username": "Bob",
      "email": "bob@gmail.com",
      "user_id": "6ef005fc-a524-11ec-b909-0242ac120002"
    },{
      "username": "Alex",
      "email": "alex@gmail.com",
      "user_id": "7f093ecc-a524-11ec-b909-0242ac120002"
    }]
    }]
   ```

- GET /messages/4f0300c2-a51b-11ec-b909-0242ac120002/1ae5241e-a51b-11ec-b909-0242ac120002
  /messages/<channel_id>/<organization_id>
 ```js
    [{
      messages:[{
           "from": {
               "username": "John",
               "email": "john@gmail.com",
               "user_id": "1e780ade-a524-11ec-b909-0242ac120002"
             },
           "message":"This is test message",
           "datetime":"1647433741"
      }]
    }]