
FROM openjdk:21-oracle

ENV SPRING_PROFILES_ACTIVE cloud

COPY target/Shippingservice-1.0-SNAPSHOT.jar flipkart-shippingservice.jar

EXPOSE 8096

ENTRYPOINT ["java", "-Dspring.profiles.active=${SPRING_PROFILES_ACTIVE}","-jar","flipkart-shippingservice.jar"]

#java -dspring.profiles.ative jar <jar name>

