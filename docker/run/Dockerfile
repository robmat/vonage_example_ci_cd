FROM openjdk:11 AS runner

ARG PROJECTNAME_ARG
WORKDIR /app
COPY /target/$PROJECTNAME_ARG.tar.gz /app/$PROJECTNAME_ARG.tar.gz
RUN tar -xzvf $PROJECTNAME_ARG.tar.gz && rm -v $PROJECTNAME_ARG.tar.gz
EXPOSE 8080
HEALTHCHECK --interval=5s --timeout=3s CMD curl --fail http://localhost:8080/health || exit 1
CMD ls | grep jar | xargs java -jar