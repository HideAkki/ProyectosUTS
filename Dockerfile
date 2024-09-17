FROM openjdk:17
COPY "./target/app-0.0.2-SNAPSHOT.jar" "app.jar"
EXPOSE 8031
ENTRYPOINT [ "java", "-jar", "app.jar" ]