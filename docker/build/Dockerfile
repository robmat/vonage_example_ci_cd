FROM maven:3.3-jdk-8 AS builder

WORKDIR /var/vonage-build
CMD sh /usr/bin/mvn clean package && \
  cp target/*.jar docker/run/ && \
  cd docker/run && \
  tar -cvzf vonage.tar.gz *.jar && \
  rm -v *.jar