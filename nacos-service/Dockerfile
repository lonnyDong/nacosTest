From 192.168.10.233:8803/oracle-jdk-8
#build with "mvn package spring-boot:repackage"
COPY target/billing-service.jar billing-service.jar
COPY src/main/resources/skywalking-agent skywalking-agent 
EXPOSE 8102
EXPOSE 28102
CMD java -jar -server -Xms256m -Xmx256m -XX:CompressedClassSpaceSize=128m -XX:MetaspaceSize=200m -XX:MaxMetaspaceSize=200m -javaagent:/skywalking-agent/skywalking-agent.jar billing-service.jar