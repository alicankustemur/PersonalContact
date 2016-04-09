# Personel Contact

 This is a simple Spring MVC and MongoDB project.
 
 The goal of the project ; save person information to using basic database operations.
 
## Requirements

These ones must be installed on your os for run.
 - Maven 
 - MongoDB 
 - Tomcat 7
 
## Installation

Run command-line in the project path and call it on command-line.
```sh
mvn package
```

Copy personelcontact-1.0.0-BUILD-SNAPSHOT.war file in target folder to tomcat/wepapps folder.
Run tomcat and go to [localhost:8080/personalcontact-1.0.0-BUILD-SNAPSHOT](localhost:8080/personalcontact-1.0.0-BUILD-SNAPSHOT) for deploying.(if server port adress 8080 )

Call these commands for running test classes.

```sh

mvn -Dtest=TestCircle PersonServiceTest

mvn -Dtest=TestCircle PersonControllerTest
```

