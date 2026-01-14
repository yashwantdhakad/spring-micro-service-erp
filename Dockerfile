ARG MODULE

FROM maven:3.9.6-eclipse-temurin-17 AS build
ARG MODULE
WORKDIR /workspace

<<<<<<< HEAD
RUN apt-get update \
    && apt-get install -y --no-install-recommends maven \
    && rm -rf /var/lib/apt/lists/*

=======
>>>>>>> 2bdf8b6 (Updated the docker file for maven.)
COPY . .
RUN mvn -pl ${MODULE} -am -DskipTests package

FROM eclipse-temurin:17-jre
ARG MODULE
WORKDIR /app

COPY --from=build /workspace/${MODULE}/target/*.jar /app/app.jar

ENTRYPOINT ["java", "-jar", "/app/app.jar"]
