FROM eclipse-temurin:17-jdk-jammy

WORKDIR /app

COPY spring-app/target/rule-engine.jar app.jar

EXPOSE 8080

ENV JAVA_OPTS=""


ENTRYPOINT ["sh", "-c", "java $JAVA_OPTS -jar app.jar"]