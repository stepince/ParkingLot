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
  There are a few options for deployment. A relational database should be sufficient.
  You can archive old data. If there is a need to look at historical data in realtime
  then you can use a nosql solution. 
  
  ### AWS Web hosting/cloud.
    This solution is reliable, scalable
    
  ### OpenShift Web hosting/cloud.
    This solution is reliable, scalable
 
  ### Oracle Cloud.
    This solution is reliable, scalable

  ### IBM Cloud.
    This solution is reliable, scalable
    
  ### Azure Web hosting/cloud.
    This solution is reliable, scalable
 
  ### On-premise
    This approach is a lot more hands-on and not as reliable or scalable. Reliability and scalability
    can be achieved but at higher costs.
      
## Clients
   You can use a variety of different clients
   
   ### Mobile
   
   ### Desktop
   
   ### Embedded system
   