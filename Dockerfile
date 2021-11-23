FROM openjdk:11-jdk-slim
WORKDIR /likes-ms
COPY . .
ENTRYPOINT ["java","-jar","./package/likes-ms-jar.jar"]
CMD gunicorn --bind 0.0.0.0:$PORT wsgi