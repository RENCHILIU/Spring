[Spring Cloud Config Document](https://cloud.spring.io/spring-cloud-config/reference/html/)

# Service Discovery 

## Example
![image.png](https://github.com/RENCHILIU/Spring/blob/main/Spring%20Cloud/Finding%20Services%20Using%20Service%20Discovery_Eureka/image-4ca54ee12b9c4c9aa34872927ad5c1f1.png?raw=true)

## Challenges:
Instances config
Instances discovery
Instances fail


## Solutions from Service discovery:
A way for a service to register itself
A way for a service deregiter itself
A way for a client to find other services 
A way to check the health of service and remove unhealthy instances

## Related Spring Cloud project for service discovery
Spring Cloud Consul
Spring Cloud Zookeeper
Spring Cloud Netflix


# Spring Cloud Netflix 

## Project Structure
Eureka Server + Eureka Client + Other

## Components 
- Discovery Server / Eureka Server
- Service / Service Provider
- Client / Service Consumer 

![Screen Shot 20210330 at 12.30.32 PM.png](https://github.com/RENCHILIU/Spring/blob/main/Spring%20Cloud/Finding%20Services%20Using%20Service%20Discovery_Eureka/image-bb9cbd92c1b743dd8bce840c2ba8bb65.png?raw=true)

1. Service registers location
2. Client looks up service location
3. Discovery Server sends back location
4. Client requests service at location
5. Service sends response

## Eureka Configuration
- eureka.server
- eureka.client
- eureka.instance

## Healthy / heartbeat 



![Screen Shot 20210330 at 12.32.36 PM.png](https://github.com/RENCHILIU/Spring/blob/main/Spring%20Cloud/Finding%20Services%20Using%20Service%20Discovery_Eureka/Screen%20Shot%202021-03-30%20at%2012.30.32%20PM-45656bf387c54556a77e93aa5df330ec.png?raw=true)


## AWS Support
AmazonInfo.class

