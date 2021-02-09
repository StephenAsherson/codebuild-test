FROM openjdk:11-jdk-slim AS test
COPY . /app/
WORKDIR /app
LABEL test_stage=true
RUN ./mvnw clean test

FROM openjdk:11-jdk-slim AS build
COPY . /app/
WORKDIR /app
RUN ./mvnw clean package -DskipTests