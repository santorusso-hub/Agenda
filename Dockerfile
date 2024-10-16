FROM eclipse-temurin:21.0.2_13-jdk-alpine AS builder

WORKDIR /app

COPY . .

RUN chmod +x ./mvnw

RUN ./mvnw clean install package

FROM eclipse-temurin:21.0.2_13-jre-alpine

WORKDIR /app

COPY --from=builder /app/target/Agenda-0.0.1-SNAPSHOT.jar /app

EXPOSE 9094

CMD ["java", "-jar","/app/Agenda-0.0.1-SNAPSHOT.jar"]