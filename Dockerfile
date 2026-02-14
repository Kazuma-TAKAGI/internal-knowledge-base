FROM amazoncorretto:25

WORKDIR /app

# 最低限のツール
RUN yum install -y findutils && yum clean all

# Gradle Wrapper 実行権限
COPY gradlew .
COPY gradle gradle
RUN chmod +x gradlew

EXPOSE 8080 5005
