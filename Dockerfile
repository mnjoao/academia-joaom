FROM openjdk:11.0.11-9-jdk

ADD target/academia.war app.war

ENTRYPOINT ["java", "-jar", "/app.war"]

EXPOSE 8080
