FROM sonarqube:6.1
MAINTAINER your_name Reza Mohammad Darojad rezamohammad.darojad@mitrais.com
USER root

RUN chmod +w /opt/sonarqube/conf/sonar.properties
COPY sonar.properties /opt/sonarqube/conf/sonar.properties
COPY sonar-java-plugin-4.2.1.6971.jar /opt/sonarqube/lib/bundled-plugins/
COPY sonar-java-plugin-4.2.1.6971.jar /opt/sonarqube/extensions/plugins/
COPY java-custom-rules-template-1.0-SNAPSHOT.jar /opt/sonarqube/lib/bundled-plugins/
COPY java-custom-rules-template-1.0-SNAPSHOT.jar /opt/sonarqube/extensions/plugins/

EXPOSE 9000 9092