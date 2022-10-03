docker run --rm \
    --name tomcat \
    -p 8080:8080 \
    --network demo_network \
    -v "/Users/vityacasf/IDEA_Projects/demo-servlet/target/demo-servlet-1.0-SNAPSHOT.war:/usr/local/tomcat/webapps/servlet.war" \
    tomcat:9.0.67-jdk17-temurin-focal


docker run --rm \
    --name custom-tomcat \
    -p 8080:8080 \
    demo-servlet:latest
