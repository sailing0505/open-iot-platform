FROM java:8

MAINTAINER huyong 

RUN echo "Asia/shanghai" > /etc/timezone;
VOLUME /tmp
ADD eureka-server.jar eureka.jar
RUN sh -c 'touch /eureka.jar'
ENV JAVA_OPTS=""
ENTRYPOINT [ "sh", "-c", "java $JAVA_OPTS -Djava.security.egd=file:/dev/./urandom -jar /eureka.jar" ]