FROM maven:3.9.4-eclipse-temurin-17-alpine

WORKDIR /app

COPY pom.xml .
RUN mvn dependency:go-offline

COPY src ./src
COPY config ./config
COPY data ./data

RUN mvn clean package -DskipTests

CMD ["mvn", "test"]
