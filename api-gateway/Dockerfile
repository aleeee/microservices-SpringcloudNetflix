FROM openjdk
LABEL authors="Alemu T. <alemutadesse8@gmail.com>"

ADD target/api-gateway.jar api-gateway.jar
ENTRYPOINT ["java", "-jar", "/api-gateway.jar"]
EXPOSE 2121