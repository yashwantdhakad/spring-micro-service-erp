ARG MODULE

FROM eclipse-temurin:17-jdk AS build
ARG MODULE
WORKDIR /workspace

COPY mvnw mvnw
COPY .mvn .mvn
RUN chmod +x mvnw

COPY . .
RUN ./mvnw -pl ${MODULE} -am -DskipTests package

FROM eclipse-temurin:17-jre
ARG MODULE
WORKDIR /app

COPY --from=build /workspace/${MODULE}/target/*.jar /app/app.jar

ENTRYPOINT ["java", "-jar", "/app/app.jar"]
