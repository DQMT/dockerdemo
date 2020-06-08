FROM openjdk:8
VOLUME /tmp
ADD ./target/dockerdemo-1.0-SNAPSHOT.jar /app.jar
ADD ./target/class/application.properties application.properties
EXPOSE 8090
ENTRYPOINT ["java","-jar","/app.jar"]