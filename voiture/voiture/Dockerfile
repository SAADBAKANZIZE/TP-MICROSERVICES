FROM openjdk:17-jdk-slim

ARG JAR_FILE=target/Client2-0.0.1-SNAPSHOT.jar
COPY ${JAR_FILE} Client2-0.0.1-SNAPSHOT.jar

EXPOSE 8761

ENTRYPOINT ["java", "-jar", "/Client2-0.0.1-SNAPSHOT.jar"]