FROM maven:3.8.6-amazoncorretto-17 AS builder

ADD ./pom.xml pom.xml
RUN mvn dependency:resolve

ADD ./src src/
RUN mvn clean package

FROM tomcat:9.0.67-jdk17-temurin-focal
COPY --from=builder target/demo-servlet-1.0-SNAPSHOT.war /usr/local/tomcat/webapps/servlet.war

EXPOSE 8080
