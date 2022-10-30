# Dockerfile
FROM openjdk:17-ea-11-jdk-slim

# 컨테이너 생성 후 가상의 볼륨 마운트를 생성
# 호스트의 볼륨 마운트와 연결되는 것이 아니기 때문에 임시 디렉터리라 생각
VOLUME /tmp

COPY target/user-service-1.0.jar user-service.jar

ENTRYPOINT ["java", "-jar", "user-service.jar"]