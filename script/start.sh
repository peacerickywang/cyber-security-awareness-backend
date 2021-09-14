sudo cp -rf application.yml BOOT-INF/classes/application.yml
jar uf CyberSecurityAwareness-0.0.1-SNAPSHOT.jar BOOT-INF/classes/application.yml
nohup java -jar CyberSecurityAwareness-0.0.1-SNAPSHOT.jar > CyberSecurityAwareness.log  2>&1 &