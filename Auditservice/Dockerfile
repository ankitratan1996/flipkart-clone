FROM openjdk:21-oracle

ENV SPRING_PROFILES_ACTIVE cloud

COPY target/Auditservice-1.0-SNAPSHOT.jar flipkart-auditservice.jar

EXPOSE 8099

ENTRYPOINT ["java", "-Dspring.profiles.active=${SPRING_PROFILES_ACTIVE}","-jar","flipkart-auditservice.jar"]

#java -dspring.profiles.ative jar <jar name>

