FROM java:8

MAINTAINER huyong 

RUN echo "Asia/shanghai" > /etc/timezone;

VOLUME /tmp
ADD auth-server.jar auth.jar
RUN sh -c 'touch /auth.jar'
ENV JAVA_OPTS=""
ENTRYPOINT [ "sh", "-c", "java $JAVA_OPTS -Djava.security.egd=file:/dev/./urandom -jar /auth.jar" ]