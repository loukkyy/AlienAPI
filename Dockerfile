FROM openjdk:8-jdk-alpine

LABEL maintainer="servan.fichet@gmail.com"

ARG JAR_FILE=target/*.jar
COPY ${JAR_FILE} app.jar

EXPOSE 7878

ENTRYPOINT ["java","-jar","/app.jar"]