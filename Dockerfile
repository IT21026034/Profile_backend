FROM openjdk:11
ADD target/profile-service-MS.jar profile-service-MS.jar
EXPOSE 8093
ENTRYPOINT ["java","-jar","profile-service-MS.jar"]