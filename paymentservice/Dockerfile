FROM openjdk:21-oracle

ENV SPRING_PROFILES_ACTIVE cloud

COPY target/paymentservice-1.0-SNAPSHOT.jar flipkart-paymentservice.jar

EXPOSE 7698

ENTRYPOINT ["java", "-Dspring.profiles.active=${SPRING_PROFILES_ACTIVE}","-jar","flipkart-paymentservice.jar"]

#java -dspring.profiles.ative jar <jar name>

