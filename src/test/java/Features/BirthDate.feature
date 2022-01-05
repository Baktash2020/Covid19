#Author: your.email@your.domain.com
#Keywords Summary :

     Feature: Setting Birth Date
     
    @Smoke
    
    Scenario: Birth Date
    Given User Opens the HomePage
   
    When User Sets Birth Month to "Jan" 
    When User Sets Birth Day to "20"
    When User Sets Birth Year to "2000"
    Then User Closes the HomePage
  

  
