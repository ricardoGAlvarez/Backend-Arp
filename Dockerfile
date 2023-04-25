FROM amazoncorretto:20-alpine-jdk

COPY target/porfolio-0.0.1-SNAPSHOT.jar porfolio.jar

ENTRYPOINT ["java","-jar","/porfolio.jar"]