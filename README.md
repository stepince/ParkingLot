# ParkingLot

## Packages

### com.com.campaignmonitor.parkingLot.model
   This package contains the POJO classes
   
### com.com.campaignmonitor.parkingLot.service
   This package contains the service layer classes 
   The service implementations can use the following
   for database access and persistence. 
   1) Spring JDBC template
   2) JPA
   3) Hibernate
   
   
### com.com.campaignmonitor.parkingLot.controller
   This package contains MVC Controller classes.
   The can be Restful API microservices implementations.
   
      
## Testing

### The model package 
   These classes can be tested with a generic model bean tester.      
      
### The service layer
    These will contain unit test cases for your service layer classes.
    I have stubbed possible testcases in each class.
    
### The controller 
    The controllers can be tested using a BDD test framerwork (Cucumber).       
   
   
## Deployment
  
  ### Hosting
    AWS Web hosting/cloud.
    This solution is reliable, scalable
    
    OpenShift Web hosting/cloud.
    This solution is reliable, scalable
 
    Google Cloud Platform.
    This solution is reliable, scalable
     
    Oracle Cloud.
    This solution is reliable, scalable

    IBM Cloud.
    This solution is reliable, scalable
    
    Azure Web hosting/cloud.
    This solution is reliable, scalable
 
    On-premise
    This approach is a lot more hands-on and not as reliable or scalable. Reliability and scalability
    can be achieved but at higher costs.

  ### Database
    Oracle, Mysql, Postgres, Sqlserver
      
  ### Deployment tools
    Jenkins, Kebernetes, Docker, Nexus, Git, BitBucket
      
## Clients
   You can use a variety of different clients
   
   ### Mobile
   
   ### Desktop Browser
      
   ### IoT embedded devices
   
## Scaling

   ### Database
   You can use a traditional relational database as a MVP. 
   If the data becomes large, you consider partitioning data, and also a 
   nosql solution. 
     
   ### Messaging
   As a MVP I choose a simple Restful api. You can consider a Kafka solution.
   In a Kafka solution, the "space" embedded/IOT devices can be producers that 
   will publish to a "space" topic. You will then a Consumer app that will
   subscribe to a "space" topic. 
   
     
## Bottlenecks

   ### TPS
   
   ### Network traffic     
   
   