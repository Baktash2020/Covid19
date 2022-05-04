#Author: your.email@your.domain.com
#Keywords Summary :




       Feature: Selecting Gender for Creating a new account
       
       
       Scenario: Selecting Gender Female Male Custom
       
       Given User is in gender MainPage
       When User is Selecting her/his Gender
       Then Use is Closing gender MainPage
       
       
       
       
       
       Scenario: Selecting Custom Gender
       Given User is in gender MainPage
       When user is selecting Custom
       When user is selecting she in box of "Select Your Pronoun"
       And user is entering Male in Gender Optional in the textbox
       And user is entering Female in Gender Optional in the textbox
       Then Use is Closing gender MainPage
       