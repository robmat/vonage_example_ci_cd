FROM openjdk:11 AS runner

WORKDIR /app
COPY vonage.tar.gz /app/vonage.tar.gz
RUN tar -xzvf vonage.tar.gz
RUN rm -v vonage.tar.gz
EXPOSE 8080
HEALTHCHECK --interval=5s --timeout=3s CMD curl --fail http://localhost:8080/health || exit 1
CMD ls | grep jar | xargs java -jar