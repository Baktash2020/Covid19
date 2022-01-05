#Author: your.email@your.domain.com
#Keywords Summary :

   @Smoke
   Feature: Sign Up
   
   
  @Smoke1
  Scenario: Creating Account
    Given User is in the HomePage
    When User Enters FirstName in The text box
    And User Enters LastName in The text box
    When User Enters MobileorEmail in The text box
    When User Reenters Email in the text box
    And User Enters Newpassword in The text box
    Then User Close the HomePage
  
  
  @Smoke2
  Scenario Outline: Creating Account
    Given User is in the HomePage
    When User Enters "<FirstName>" in firstname text box
    And User Enters "<LastName>"  in lastname text box
    When User Enters "<MobileorEmail>" in email text box
    When User Reenters "<Email>" in Reenter Email text box
    And User Enters "<Newpassword>" in newpassword text box
    Then User Close the HomePage
  
  
  Examples: 
      | FirstName | LastName |   MobileorEmail       |      Email       |     NewPassword   |
      | Aqdas     |    Jan   |   Aqdas@yahoo.com     | Aqdas@yahoo.com  | Lorton15288 Grist | 
      | Bakee     |    Jan   |   Bakee@gmail.com     | Bakee@gmail.com  | 22709United State |
      | Zaheen    |    Jan   |   Zaheen@gmail.com    | Zaheen@gmail.com | Virginia@)079     |
      
  