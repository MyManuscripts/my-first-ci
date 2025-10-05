# Используем OpenJDK 11 как базовый образ
FROM openjdk:21-jre-slim

# Копируем JAR-файл (создастся после сборки Maven)
COPY target/java-ci-demo-1.0-SNAPSHOT.jar app.jar

# Указываем, что приложение будет слушать порт 8080
EXPOSE 8080

# Запускаем приложение
ENTRYPOINT ["java", "-jar", "app.jar"]