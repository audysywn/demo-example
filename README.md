### Overview
Building REST service with spring boot and mongodb.
For mongodb configuration please refer /resources/application.config

### REST API
Mapping to the REST API

#### GET -> /products/
Get all products list

#### GET -> /products/byProductCode/{productCode}
Get product document based on product code

#### GET -> /products/orderByRating
List products by rating

#### POST -> /products/save
Save a product document. For updating, document object id is required

#### DELETE -> /products/delete/{productCode}
Delete a product document

### Reference Documentation
For further reference, please consider the following sections:

* [Official Apache Maven documentation](https://maven.apache.org/guides/index.html)
* [Spring Boot Maven Plugin Reference Guide](https://docs.spring.io/spring-boot/docs/2.5.3/maven-plugin/reference/html/)
* [Create an OCI image](https://docs.spring.io/spring-boot/docs/2.5.3/maven-plugin/reference/html/#build-image)
* [Spring Data MongoDB](https://docs.spring.io/spring-boot/docs/2.5.3/reference/htmlsingle/#boot-features-mongodb)
* [Spring Web](https://docs.spring.io/spring-boot/docs/2.5.3/reference/htmlsingle/#boot-features-developing-web-applications)

### Guides
The following guides illustrate how to use some features concretely:

* [Accessing Data with MongoDB](https://spring.io/guides/gs/accessing-data-mongodb/)
* [Building a RESTful Web Service](https://spring.io/guides/gs/rest-service/)
* [Serving Web Content with Spring MVC](https://spring.io/guides/gs/serving-web-content/)
* [Building REST services with Spring](https://spring.io/guides/tutorials/bookmarks/)
