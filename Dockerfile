
FROM registry.access.redhat.com/ubi8/openjdk-17-runtime:1.15-1.1682053056
COPY target/demo-0.0.1-SNAPSHOT.jar  /deployments/export-run-artifact.jar
EXPOSE 8081
ENTRYPOINT ["/opt/jboss/container/java/run/run-java.sh", "--server.port=8081"]

