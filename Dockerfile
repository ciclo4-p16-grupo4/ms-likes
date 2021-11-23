FROM openjdk:11-jdk-slim
WORKDIR /likes-ms
COPY . .
RUN ["ls"]
RUN ./mvnw clean package
ENTRYPOINT ["java","-jar","./target/likes-ms-jar.jar"]
CMD gunicorn --bind 0.0.0.0:$PORT wsgi