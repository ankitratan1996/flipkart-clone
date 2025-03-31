
FROM openjdk:21-oracle

ENV SPRING_PROFILES_ACTIVE cloud

COPY target/productservice-1.0-SNAPSHOT.jar flipkart-productservice.jar

EXPOSE 8089

ENTRYPOINT ["java", "-Dspring.profiles.active=${SPRING_PROFILES_ACTIVE}","-jar","flipkart-productservice.jar"]

#java -dspring.profiles.ative jar <jar name>

