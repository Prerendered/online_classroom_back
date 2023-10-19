FROM eclipse-temurin:17-jdk-alpine
VOLUME /tmp
COPY target/*.jar app.jar
COPY src/main/resources/config.properties /config.properties
ENV MY_FEATURE_ENABLED=true
ENTRYPOINT ["java", "-jar", "/app.jar"]
EXPOSE 8080
