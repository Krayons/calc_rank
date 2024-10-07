# Use an official Scala image as a parent image
FROM hseeberger/scala-sbt:8u222_1.3.5_2.13.1

# Set the working directory in the container
WORKDIR /app

# Copy the current directory contents into the container at /app
COPY . /app

# Install any needed packages specified in build.sbt
RUN sbt update


# Run sbt run when the container launches
CMD ["sh", "/app/run_docker.sh"]