FROM openjdk:8
VOLUME /tmp
RUN mkdir /opt/app
WORKDIR /opt/app
ADD ./target/dockerdemo-1.0-SNAPSHOT.jar app.jar
ADD ./target/classes/application.properties application.properties
EXPOSE 8080
ENTRYPOINT ["java","-jar","app.jar"]