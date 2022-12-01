# Build stage
FROM maven:3.6.0-jdk-11-slim AS build
COPY src /home/app/src
COPY pom.xml /home/app
RUN mvn -f /home/app/pom.xml clean package

# Package stage
FROM openjdk:11-jre-slim
COPY --from=build /home/app/target/eureka-server.jar /usr/local/lib/eureka-server.jar
EXPOSE 8761
ENTRYPOINT ["java", "-Djava.security.egd=file:/dev/./urandom", "-jar", "/usr/local/lib/eureka-server.jar"]