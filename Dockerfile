# Use an official OpenJDK image as the base image
FROM openjdk:17

# Set the working directory inside the container
WORKDIR /app

# Copy the Java source code into the container
COPY /src/Main.java .

# Compile the Java file
RUN javac Main.java

# Set the command to run the Java application
CMD ["java", "Main"]
