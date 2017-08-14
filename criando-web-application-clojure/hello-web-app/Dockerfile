FROM java:8-alpine
MAINTAINER Your Name <you@example.com>

ADD target/uberjar/hello-web-app.jar /hello-web-app/app.jar

EXPOSE 3000

CMD ["java", "-jar", "/hello-web-app/app.jar"]
