ARG MODULE

FROM maven:3.9.6-eclipse-temurin-17 AS build
ARG MODULE
WORKDIR /workspace

RUN apt-get update \
    && apt-get install -y --no-install-recommends maven \
    && rm -rf /var/lib/apt/lists/*

COPY . .
RUN mvn -pl ${MODULE} -am -DskipTests package

FROM eclipse-temurin:17-jre
ARG MODULE
WORKDIR /app

COPY --from=build /workspace/${MODULE}/target/*.jar /app/app.jar

ENTRYPOINT ["java", "-jar", "/app/app.jar"]
