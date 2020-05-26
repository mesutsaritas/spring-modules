# spring-modules
***Spring Modules Example***

**1)Demo Spring Boot App With Docker**

  The required docker codes to run are listed below;
```
  docker build -t docker-spring-boot . 
  docker run -d -p 8080:8080 -t docker-spring-boot
  ```
  
  **2)Implementing Circuit Breaker Pattern using Spring Cloud Hystrix**
  ```
  The stream is accessible at http://localhost:8080/actuator/hystrix.stream
```
  
  
