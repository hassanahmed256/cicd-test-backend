# Use an official OpenJDK runtime as a parent image
FROM openjdk:11-jre-slim

# Set the working directory in the container
WORKDIR /app

# Copy the JAR file (generated from your Spring Boot project) into the container
COPY target/your-spring-boot-app.jar /app/app.jar

# Expose the port your application will run on (default Spring Boot port is 8080)
EXPOSE 8080

# Specify the command to run your application
CMD ["java", "-jar", "app.jar"]