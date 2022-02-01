FROM adoptopenjdk/openjdk11
ADD target/java_hw1-1.0-SNAPSHOT.jar java_hw1.jar
EXPOSE 3000
ENTRYPOINT ["java"]
CMD ["-jar", "./java_hw1.jar"]