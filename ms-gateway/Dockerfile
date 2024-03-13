FROM maven:3.8.5-openjdk-17-slim AS builder
WORKDIR /usr/src/financial-system
COPY . .
RUN mvn clean
RUN mvn install -Dmaven.test.skip -Dorg.slf4j.simpleLogger.log.org.apache.maven.cli.transfer.Slf4jMavenTransferListener=warn --batch-mode

# Stage 2: Создание образа для запуска приложения
FROM openjdk:17-oracle AS runner
WORKDIR /app
COPY --from=builder /usr/src/financial-system/target/ms-gateway*.jar /app/ms-gateway.jar
CMD ["java", "-jar", "ms-config.jar"]