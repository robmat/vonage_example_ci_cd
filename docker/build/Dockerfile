FROM maven:3.3-jdk-8 AS builder

ENV projectname_env vonage_default_projectname
WORKDIR /var/vonage-build
CMD sh /usr/bin/mvn clean package && \
  cd target && \
  tar -cvzf ${projectname_env}.tar.gz *.jar