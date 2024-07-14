FROM amazoncorretto:17-alpine
LABEL authors="xiaohai"

# 指定工作目录
WORKDIR /app

# 将jar包拷贝到工作目录
ADD target/qingsong-user-1.0.0.jar /app/qingsong-user-0.0.1-SNAPSHOT.jar

EXPOSE 7892

# 启动
ENTRYPOINT ["java", "-jar", "/app/qingsong-user-1.0.0.jar", "--spring.profiles.active=prod"]