#Author: your.email@your.domain.com
#Keywords Summary :


   @Smoke
   Feature: Log In in to account
   
   
   Scenario: Log in
    Given User is in the Home Page
    When User Clicks on log Into Existing Account
    When User Enters Email in text box
    And User Enters Password in text box
    Then User Close the Home Page
    
    
    
    Scenario Outline: Log in
    Given User is in the Home Page
    When User Clicks on log Into Existing Account
    When User Enters "<Email>" in Email text box
    And User Enters "<Password>"  in Passwod text box
    Then User Close the Home Page
    
    
     Examples: 
      |       Email        |       Password    |
      | Aqdas@gmail.com    | Lorton15288 Grist | 
      | Bakee@gmail.com    | 22709United State |
      | Zaheen@gmail.com   | Virginia@)079     |