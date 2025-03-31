FROM openjdk:21-oracle

ENV SPRING_PROFILES_ACTIVE cloud

COPY target/favouriteservice-1.0-SNAPSHOT.jar flipkart-favouriteservice.jar

EXPOSE 8093

ENTRYPOINT ["java", "-Dspring.profiles.active=${SPRING_PROFILES_ACTIVE}","-jar","flipkart-favouriteservice.jar"]

#java -dspring.profiles.ative jar <jar name>

