FROM eclipse-temurin:17.0.8.1_1-jdk-centos7

MAINTAINER bhoopendra.akgec

VOLUME /tmp

EXPOSE 8080

ARG JAR_FILE=build/libs/demo-kubernetes-0.0.1-SNAPSHOT.jar
ADD ${JAR_FILE} app.jar
ENTRYPOINT sh -c 'java -jar /app.jar com.smartrobo.kubernetes.DemoKubernetesApplication.class'