FROM openjdk:11-slim

COPY build/libs/configmap-0.0.1-SNAPSHOT.jar app.jar

CMD java -jar app.jar