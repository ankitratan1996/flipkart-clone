FROM openjdk:21-oracle

ENV SPRING_PROFILES_ACTIVE cloud

COPY target/apigatewayservice-1.0-SNAPSHOT.jar flipkart-apigatewayservice.jar

EXPOSE 8092

ENTRYPOINT ["java", "-Dspring.profiles.active=${SPRING_PROFILES_ACTIVE}","-jar","flipkart-apigatewayservice.jar"]

#java -dspring.profiles.ative jar <jar name>

