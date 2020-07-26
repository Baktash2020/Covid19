#Author: your.email@your.domain.com
#Keywords Summary :


   Feature: Sign Up and Log In Page
  
   Scenario: Log In
    Given user is in Sign Up Page
    When user enters Email or Phone in text box
    And user enters Password in text box
    When user clicks Log In 
    Then user close Sign Up Page 
    

   Scenario Outline: Signing Up 
    Given user is in Sign Up Page
    When user enters "<FirstName>" in text box
    And user enters "<LastName>" in text box
    When user enters "<MobileOrEmail>" in text box
    And user enters "<NewPassword>" in text box
   Then user close Sign Up Page 
    
    
    
    Examples: 
      | FirstName | LastName | MobileOrEmail   |     NewPassword   |
      | Aqdas     |    Jan   | 571 234 7889    | Lorton15288 Grist | 
      | Bakee     |    Jan   | Bakee@gmail.com | 22709United State |
      | Zaheen    |    Jan   | Zaheen@gmail.com| Virginia@)079     |
      
    
    
    