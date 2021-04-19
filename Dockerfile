FROM maven:3.8.1-jdk-8

#coping src of your framework
COPY src /home/APITestFramework/src

#coping pom file of your framework
COPY pom.xml /home/APITestFramework

#coping testing.xml file of your framework
COPY testng.xml /home/APITestFramework

#running actual command
RUN mvn -f /home/APITestFramework/pom.xml clean install
