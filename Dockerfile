FROM adoptopenjdk:14-jre-hotspot

RUN mkdir /app

WORKDIR /app

ADD ./api/target/api-1.0.0-SNAPSHOT.jar /app

EXPOSE 8081

ENTRYPOINT ["java", "-jar", "api-1.0.0-SNAPSHOT.jar"]

#docker build -t porocila-img
#docker run --name porocila-container -p 8081:8081 porocila-img
#docker login
#docker tag porocila-img gj1421/porocila-img:latest
#docker push gj1421/porocila-img:latest
