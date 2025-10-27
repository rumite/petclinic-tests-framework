FROM openjdk:17-oracle
VOLUME /tmp
COPY  build/libs/petclinic-tests-framework-0.0.1-SNAPSHOT.jar petclinic-tests-framework-0.0.1-SNAPSHOT.jar
ENTRYPOINT ["java","-jar","/petclinic-tests-framework-0.0.1-SNAPSHOT.jar"]
