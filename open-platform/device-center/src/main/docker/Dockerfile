FROM java:8
MAINTAINER huyong 

RUN echo "Asia/shanghai" > /etc/timezone;

VOLUME /tmp
ADD device-center.jar device.jar
RUN sh -c 'touch /device.jar'
ENV JAVA_OPTS=""
ENTRYPOINT [ "sh", "-c", "java $JAVA_OPTS -Djava.security.egd=file:/dev/./urandom -jar /device.jar" ]