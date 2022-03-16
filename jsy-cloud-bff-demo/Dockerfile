FROM openjdk:11.0.14.1-jre

MAINTAINER 1241968281@qq.com

ENV TZ=Asia/Shanghai
ENV JAVA_OPTS="-Xms128m -Xmx256m -Djava.security.egd=file:/dev/./urandom"

RUN ln -sf /usr/share/zoneinf/$TZ /etc/localtime && echo $TZ > /etc/timezone

RUN mkdir -p /jsy-cloud-bff-demo

WORKDIR /jsy-cloud-bff-demo

#EXPOSE 10001

ADD ./target/jsy-cloud-bff-demo.jar ./

CMD java $JAVA_OPTS -jar jsy-cloud-bff-demo.jar