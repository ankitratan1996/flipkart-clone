
FROM openjdk:21-oracle

ENV SPRING_PROFILES_ACTIVE cloud

COPY target/userservice-1.0-SNAPSHOT.jar flipkart-userservice.jar

EXPOSE 8084

ENTRYPOINT ["java", "-Dspring.profiles.active=${SPRING_PROFILES_ACTIVE}","-jar","flipkart-userservice.jar"]

#java -dspring.profiles.ative jar <jar name>

