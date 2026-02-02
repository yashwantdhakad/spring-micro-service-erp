ARG MODULE

FROM maven:3.9.6-eclipse-temurin-21 AS build
ARG MODULE
WORKDIR /workspace

COPY . .
RUN mvn -pl ${MODULE} -am -DskipTests package

FROM eclipse-temurin:21-jre
ARG MODULE
WORKDIR /app

COPY --from=build /workspace/${MODULE}/target/*.jar /app/app.jar

ENTRYPOINT ["java", "-jar", "/app/app.jar"]
