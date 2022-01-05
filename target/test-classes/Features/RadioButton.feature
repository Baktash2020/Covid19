#Author: your.email@your.domain.com
#Keywords Summary :
#Feature: List of scenarios.



       Feature: Selecting Gender
       
       
       
       @Smoke
       Scenario: Selecting Gender female male custom
       
       Given User is in gender MainPage
       When User is Selecting her/his Gender
       When user is selecting she in box of "Select Your Pronoun"
       And user is entering Male in Gender Optional in the textbox
       And user is entering Female in Gender Optional in the textbox
       Then Use is Closing gender MainPage
       