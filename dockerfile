FROM openjdk:8

RUN mkdir /category

WORKDIR /category

COPY . ./category
ADD . /category

EXPOSE 8084

CMD ["java", "-jar", "target/category-service-2.5.0-SNAPSHOT.jar"]