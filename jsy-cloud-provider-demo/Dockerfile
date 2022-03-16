FROM openjdk:11.0.14.1-jre

MAINTAINER 1241968281@qq.com

ENV TZ=Asia/Shanghai
ENV JAVA_OPTS="-Xms128m -Xmx256m -Djava.security.egd=file:/dev/./urandom"

RUN ln -sf /usr/share/zoneinf/$TZ /etc/localtime && echo $TZ > /etc/timezone

RUN mkdir -p /jsy-cloud-provider-demo

WORKDIR /jsy-cloud-provider-demo

ADD ./target/jsy-cloud-provider-demo.jar ./

CMD java $JAVA_OPTS -jar jsy-cloud-provider-demo.jar