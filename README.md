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
   The can be RestAPI microservices implementations.
   
      
## Testing

### The model package 
   These classes can be tested with a generic model bean tester.      
      
### The service layer
    These will contain unit test cases for your service layer classes.
    I have stubbed possible testcases in each class.
    
### The controller 
    The controllers can be tested using a BDD test framerwork (Cucumber).       
   
   