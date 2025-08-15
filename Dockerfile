# Use an official lightweight JDK 21 image
FROM eclipse-temurin:21-jdk-jammy

# Copy the JAR with a fixed name
COPY target/*.jar app.jar

# Expose the application port
EXPOSE 8080

# Run the JAR file
ENTRYPOINT ["java", "-jar", "app.jar"]
