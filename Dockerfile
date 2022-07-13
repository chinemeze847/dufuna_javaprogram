FROM openjdk:17-alpine
VOLUME /tmp
EXPOSE 8090
ADD target/address-0.0.1-SNAPSHOT.jar address-0.0.1-SNAPSHOT.jar
ENTRYPOINT ["java","-jar","/address-0.0.1-SNAPSHOT.jar"]