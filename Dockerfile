FROM openjdk:17-jdk-slim
MAINTAINER namei sankar aligi
COPY target/loans-app-0.0.1-SNAPSHOT.jar loans-app-0.0.1-SNAPSHOT.jar
ENTRYPOINT [ "java","-jar","loans-app-0.0.1-SNAPSHOT.jar" ]