FROM eclipse-temurin:21.0.2_13-jdk-alpine
WORKDIR /app
RUN chmod +x ./mvnw
RUN ./mvnw clean install package
COPY target/Agenda-0.0.1.jar Agenda-0.0.1.jar
EXPOSE 2027
CMD ["java", "-jar", "Agenda-0.0.1.jar"]
