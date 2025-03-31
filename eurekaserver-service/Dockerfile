FROM openjdk:21-oracle

ENV SPRING_PROFILES_ACTIVE cloud

COPY target/eurekaserver-service-1.0-SNAPSHOT.jar flipkart-eurekaserver.jar

EXPOSE 8761

ENTRYPOINT ["java", "-Dspring.profiles.active=${SPRING_PROFILES_ACTIVE}","-jar","flipkart-eurekaserver.jar"]

#java -dspring.profiles.ative jar <jar name>

