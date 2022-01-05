$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("BirthDate.feature");
formatter.feature({
  "comments": [
    {
      "line": 1,
      "value": "#Author: your.email@your.domain.com"
    },
    {
      "line": 2,
      "value": "#Keywords Summary :"
    }
  ],
  "line": 4,
  "name": "Setting Birth Date",
  "description": "",
  "id": "setting-birth-date",
  "keyword": "Feature"
});
formatter.scenario({
  "line": 8,
  "name": "Birth Date",
  "description": "",
  "id": "setting-birth-date;birth-date",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 6,
      "name": "@Smoke"
    }
  ]
});
formatter.step({
  "line": 9,
  "name": "User Opens the HomePage",
  "keyword": "Given "
});
formatter.step({
  "line": 11,
  "name": "User Sets Birth Month to \"Jan\"",
  "keyword": "When "
});
formatter.step({
  "line": 12,
  "name": "User Sets Birth Day to \"20\"",
  "keyword": "When "
});
formatter.step({
  "line": 13,
  "name": "User Sets Birth Year to \"2000\"",
  "keyword": "When "
});
formatter.step({
  "line": 14,
  "name": "User Closes the HomePage",
  "keyword": "Then "
});
formatter.match({
  "location": "BirthDateSteps.user_Opens_the_HomePage()"
});
formatter.result({
  "duration": 9366779900,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Jan",
      "offset": 26
    }
  ],
  "location": "BirthDateSteps.user_Sets_Birth_Month_to(String)"
});
formatter.result({
  "duration": 3053523300,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "20",
      "offset": 24
    }
  ],
  "location": "BirthDateSteps.user_Sets_Birth_Day_to(String)"
});
formatter.result({
  "duration": 6156185300,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "2000",
      "offset": 25
    }
  ],
  "location": "BirthDateSteps.user_Sets_Birth_Year_to(String)"
});
formatter.result({
  "duration": 2963462200,
  "status": "passed"
});
formatter.match({
  "location": "BirthDateSteps.user_Closes_the_HomePage()"
});
formatter.result({
  "duration": 4170698700,
  "status": "passed"
});
formatter.uri("CreatingAccount.feature");
formatter.feature({
  "comments": [
    {
      "line": 1,
      "value": "#Author: your.email@your.domain.com"
    },
    {
      "line": 2,
      "value": "#Keywords Summary :"
    }
  ],
  "line": 5,
  "name": "Sign Up",
  "description": "",
  "id": "sign-up",
  "keyword": "Feature",
  "tags": [
    {
      "line": 4,
      "name": "@Smoke"
    }
  ]
});
formatter.scenario({
  "line": 9,
  "name": "Creating Account",
  "description": "",
  "id": "sign-up;creating-account",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 8,
      "name": "@Smoke1"
    }
  ]
});
formatter.step({
  "line": 10,
  "name": "User is in the HomePage",
  "keyword": "Given "
});
formatter.step({
  "line": 11,
  "name": "User Enters FirstName in The text box",
  "keyword": "When "
});
formatter.step({
  "line": 12,
  "name": "User Enters LastName in The text box",
  "keyword": "And "
});
formatter.step({
  "line": 13,
  "name": "User Enters MobileorEmail in The text box",
  "keyword": "When "
});
formatter.step({
  "line": 14,
  "name": "User Reenters Email in the text box",
  "keyword": "When "
});
formatter.step({
  "line": 15,
  "name": "User Enters Newpassword in The text box",
  "keyword": "And "
});
formatter.step({
  "line": 16,
  "name": "User Close the HomePage",
  "keyword": "Then "
});
formatter.match({
  "location": "CreatingAccountSteps.user_is_in_the_HomePage()"
});
formatter.result({
  "duration": 7162458300,
  "status": "passed"
});
formatter.match({
  "location": "CreatingAccountSteps.user_Enters_FirstName_in_The_text_box()"
});
formatter.result({
  "duration": 186749900,
  "status": "passed"
});
formatter.match({
  "location": "CreatingAccountSteps.user_Enters_LastName_in_The_text_box()"
});
formatter.result({
  "duration": 128365900,
  "status": "passed"
});
formatter.match({
  "location": "CreatingAccountSteps.user_Enters_MobileorEmail_in_The_text_box()"
});
formatter.result({
  "duration": 142801000,
  "status": "passed"
});
formatter.match({
  "location": "CreatingAccountSteps.user_Reenters_Email_in_the_text_box()"
});
formatter.result({
  "duration": 127975800,
  "status": "passed"
});
formatter.match({
  "location": "CreatingAccountSteps.user_Enters_Newpassword_in_The_text_box()"
});
formatter.result({
  "duration": 131128400,
  "status": "passed"
});
formatter.match({
  "location": "CreatingAccountSteps.user_Close_the_HomePage()"
});
formatter.result({
  "duration": 4182491300,
  "status": "passed"
});
formatter.scenarioOutline({
  "line": 20,
  "name": "Creating Account",
  "description": "",
  "id": "sign-up;creating-account",
  "type": "scenario_outline",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "line": 19,
      "name": "@Smoke2"
    }
  ]
});
formatter.step({
  "line": 21,
  "name": "User is in the HomePage",
  "keyword": "Given "
});
formatter.step({
  "line": 22,
  "name": "User Enters \"\u003cFirstName\u003e\" in firstname text box",
  "keyword": "When "
});
formatter.step({
  "line": 23,
  "name": "User Enters \"\u003cLastName\u003e\"  in lastname text box",
  "keyword": "And "
});
formatter.step({
  "line": 24,
  "name": "User Enters \"\u003cMobileorEmail\u003e\" in email text box",
  "keyword": "When "
});
formatter.step({
  "line": 25,
  "name": "User Reenters \"\u003cEmail\u003e\" in Reenter Email text box",
  "keyword": "When "
});
formatter.step({
  "line": 26,
  "name": "User Enters \"\u003cNewpassword\u003e\" in newpassword text box",
  "keyword": "And "
});
formatter.step({
  "line": 27,
  "name": "User Close the HomePage",
  "keyword": "Then "
});
formatter.examples({
  "line": 30,
  "name": "",
  "description": "",
  "id": "sign-up;creating-account;",
  "rows": [
    {
      "cells": [
        "FirstName",
        "LastName",
        "MobileorEmail",
        "Email",
        "NewPassword"
      ],
      "line": 31,
      "id": "sign-up;creating-account;;1"
    },
    {
      "cells": [
        "Aqdas",
        "Jan",
        "Aqdas@yahoo.com",
        "Aqdas@yahoo.com",
        "Lorton15288 Grist"
      ],
      "line": 32,
      "id": "sign-up;creating-account;;2"
    },
    {
      "cells": [
        "Bakee",
        "Jan",
        "Bakee@gmail.com",
        "Bakee@gmail.com",
        "22709United State"
      ],
      "line": 33,
      "id": "sign-up;creating-account;;3"
    },
    {
      "cells": [
        "Zaheen",
        "Jan",
        "Zaheen@gmail.com",
        "Zaheen@gmail.com",
        "Virginia@)079"
      ],
      "line": 34,
      "id": "sign-up;creating-account;;4"
    }
  ],
  "keyword": "Examples"
});
formatter.scenario({
  "line": 32,
  "name": "Creating Account",
  "description": "",
  "id": "sign-up;creating-account;;2",
  "type": "scenario",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "line": 4,
      "name": "@Smoke"
    },
    {
      "line": 19,
      "name": "@Smoke2"
    }
  ]
});
formatter.step({
  "line": 21,
  "name": "User is in the HomePage",
  "keyword": "Given "
});
formatter.step({
  "line": 22,
  "name": "User Enters \"Aqdas\" in firstname text box",
  "matchedColumns": [
    0
  ],
  "keyword": "When "
});
formatter.step({
  "line": 23,
  "name": "User Enters \"Jan\"  in lastname text box",
  "matchedColumns": [
    1
  ],
  "keyword": "And "
});
formatter.step({
  "line": 24,
  "name": "User Enters \"Aqdas@yahoo.com\" in email text box",
  "matchedColumns": [
    2
  ],
  "keyword": "When "
});
formatter.step({
  "line": 25,
  "name": "User Reenters \"Aqdas@yahoo.com\" in Reenter Email text box",
  "matchedColumns": [
    3
  ],
  "keyword": "When "
});
formatter.step({
  "line": 26,
  "name": "User Enters \"\u003cNewpassword\u003e\" in newpassword text box",
  "keyword": "And "
});
formatter.step({
  "line": 27,
  "name": "User Close the HomePage",
  "keyword": "Then "
});
formatter.match({
  "location": "CreatingAccountSteps.user_is_in_the_HomePage()"
});
formatter.result({
  "duration": 7462309600,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Aqdas",
      "offset": 13
    }
  ],
  "location": "CreatingAccountSteps.user_Enters_in_firstname_text_box(String)"
});
formatter.result({
  "duration": 242948800,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Jan",
      "offset": 13
    }
  ],
  "location": "CreatingAccountSteps.user_Enters_in_lastname_text_box(String)"
});
formatter.result({
  "duration": 107566600,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Aqdas@yahoo.com",
      "offset": 13
    }
  ],
  "location": "CreatingAccountSteps.user_Enters_in_email_text_box(String)"
});
formatter.result({
  "duration": 157727100,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Aqdas@yahoo.com",
      "offset": 15
    }
  ],
  "location": "CreatingAccountSteps.user_Reenters_in_Reenter_Email_text_box(String)"
});
formatter.result({
  "duration": 147871000,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "\u003cNewpassword\u003e",
      "offset": 13
    }
  ],
  "location": "CreatingAccountSteps.user_Enters_in_newpassword_text_box(String)"
});
formatter.result({
  "duration": 142917900,
  "status": "passed"
});
formatter.match({
  "location": "CreatingAccountSteps.user_Close_the_HomePage()"
});
formatter.result({
  "duration": 4158449900,
  "status": "passed"
});
formatter.scenario({
  "line": 33,
  "name": "Creating Account",
  "description": "",
  "id": "sign-up;creating-account;;3",
  "type": "scenario",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "line": 4,
      "name": "@Smoke"
    },
    {
      "line": 19,
      "name": "@Smoke2"
    }
  ]
});
formatter.step({
  "line": 21,
  "name": "User is in the HomePage",
  "keyword": "Given "
});
formatter.step({
  "line": 22,
  "name": "User Enters \"Bakee\" in firstname text box",
  "matchedColumns": [
    0
  ],
  "keyword": "When "
});
formatter.step({
  "line": 23,
  "name": "User Enters \"Jan\"  in lastname text box",
  "matchedColumns": [
    1
  ],
  "keyword": "And "
});
formatter.step({
  "line": 24,
  "name": "User Enters \"Bakee@gmail.com\" in email text box",
  "matchedColumns": [
    2
  ],
  "keyword": "When "
});
formatter.step({
  "line": 25,
  "name": "User Reenters \"Bakee@gmail.com\" in Reenter Email text box",
  "matchedColumns": [
    3
  ],
  "keyword": "When "
});
formatter.step({
  "line": 26,
  "name": "User Enters \"\u003cNewpassword\u003e\" in newpassword text box",
  "keyword": "And "
});
formatter.step({
  "line": 27,
  "name": "User Close the HomePage",
  "keyword": "Then "
});
formatter.match({
  "location": "CreatingAccountSteps.user_is_in_the_HomePage()"
});
formatter.result({
  "duration": 8152027900,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Bakee",
      "offset": 13
    }
  ],
  "location": "CreatingAccountSteps.user_Enters_in_firstname_text_box(String)"
});
formatter.result({
  "duration": 162890700,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Jan",
      "offset": 13
    }
  ],
  "location": "CreatingAccountSteps.user_Enters_in_lastname_text_box(String)"
});
formatter.result({
  "duration": 112412000,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Bakee@gmail.com",
      "offset": 13
    }
  ],
  "location": "CreatingAccountSteps.user_Enters_in_email_text_box(String)"
});
formatter.result({
  "duration": 158829000,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Bakee@gmail.com",
      "offset": 15
    }
  ],
  "location": "CreatingAccountSteps.user_Reenters_in_Reenter_Email_text_box(String)"
});
formatter.result({
  "duration": 140227000,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "\u003cNewpassword\u003e",
      "offset": 13
    }
  ],
  "location": "CreatingAccountSteps.user_Enters_in_newpassword_text_box(String)"
});
formatter.result({
  "duration": 156360300,
  "status": "passed"
});
formatter.match({
  "location": "CreatingAccountSteps.user_Close_the_HomePage()"
});
formatter.result({
  "duration": 4142437600,
  "status": "passed"
});
formatter.scenario({
  "line": 34,
  "name": "Creating Account",
  "description": "",
  "id": "sign-up;creating-account;;4",
  "type": "scenario",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "line": 4,
      "name": "@Smoke"
    },
    {
      "line": 19,
      "name": "@Smoke2"
    }
  ]
});
formatter.step({
  "line": 21,
  "name": "User is in the HomePage",
  "keyword": "Given "
});
formatter.step({
  "line": 22,
  "name": "User Enters \"Zaheen\" in firstname text box",
  "matchedColumns": [
    0
  ],
  "keyword": "When "
});
formatter.step({
  "line": 23,
  "name": "User Enters \"Jan\"  in lastname text box",
  "matchedColumns": [
    1
  ],
  "keyword": "And "
});
formatter.step({
  "line": 24,
  "name": "User Enters \"Zaheen@gmail.com\" in email text box",
  "matchedColumns": [
    2
  ],
  "keyword": "When "
});
formatter.step({
  "line": 25,
  "name": "User Reenters \"Zaheen@gmail.com\" in Reenter Email text box",
  "matchedColumns": [
    3
  ],
  "keyword": "When "
});
formatter.step({
  "line": 26,
  "name": "User Enters \"\u003cNewpassword\u003e\" in newpassword text box",
  "keyword": "And "
});
formatter.step({
  "line": 27,
  "name": "User Close the HomePage",
  "keyword": "Then "
});
formatter.match({
  "location": "CreatingAccountSteps.user_is_in_the_HomePage()"
});
formatter.result({
  "duration": 6994077100,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Zaheen",
      "offset": 13
    }
  ],
  "location": "CreatingAccountSteps.user_Enters_in_firstname_text_box(String)"
});
formatter.result({
  "duration": 209919500,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Jan",
      "offset": 13
    }
  ],
  "location": "CreatingAccountSteps.user_Enters_in_lastname_text_box(String)"
});
formatter.result({
  "duration": 161388700,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Zaheen@gmail.com",
      "offset": 13
    }
  ],
  "location": "CreatingAccountSteps.user_Enters_in_email_text_box(String)"
});
formatter.result({
  "duration": 170488300,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Zaheen@gmail.com",
      "offset": 15
    }
  ],
  "location": "CreatingAccountSteps.user_Reenters_in_Reenter_Email_text_box(String)"
});
formatter.result({
  "duration": 122328300,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "\u003cNewpassword\u003e",
      "offset": 13
    }
  ],
  "location": "CreatingAccountSteps.user_Enters_in_newpassword_text_box(String)"
});
formatter.result({
  "duration": 140438500,
  "status": "passed"
});
formatter.match({
  "location": "CreatingAccountSteps.user_Close_the_HomePage()"
});
formatter.result({
  "duration": 4146475000,
  "status": "passed"
});
formatter.uri("GenderRadioButton.feature");
formatter.feature({
  "comments": [
    {
      "line": 1,
      "value": "#Author: your.email@your.domain.com"
    },
    {
      "line": 2,
      "value": "#Keywords Summary :"
    }
  ],
  "line": 7,
  "name": "Selecting Gender for Creating a new account",
  "description": "",
  "id": "selecting-gender-for-creating-a-new-account",
  "keyword": "Feature"
});
formatter.scenario({
  "line": 12,
  "name": "Selecting Gender Female Male Custom",
  "description": "",
  "id": "selecting-gender-for-creating-a-new-account;selecting-gender-female-male-custom",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 11,
      "name": "@Smoke"
    }
  ]
});
formatter.step({
  "line": 14,
  "name": "User is in gender MainPage",
  "keyword": "Given "
});
formatter.step({
  "line": 15,
  "name": "User is Selecting her/his Gender",
  "keyword": "When "
});
formatter.step({
  "line": 16,
  "name": "Use is Closing gender MainPage",
  "keyword": "Then "
});
formatter.match({
  "location": "GenderRadioButtonSteps.user_is_in_gender_MainPage()"
});
formatter.result({
  "duration": 7726914800,
  "status": "passed"
});
formatter.match({
  "location": "GenderRadioButtonSteps.user_is_Selecting_her_his_Gender()"
});
formatter.result({
  "duration": 4483739100,
  "status": "passed"
});
formatter.match({
  "location": "GenderRadioButtonSteps.use_is_Closing_gender_MainPage()"
});
formatter.result({
  "duration": 147886200,
  "status": "passed"
});
formatter.scenario({
  "line": 20,
  "name": "Selecting Custom Gender",
  "description": "",
  "id": "selecting-gender-for-creating-a-new-account;selecting-custom-gender",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 19,
      "name": "@Smoke"
    }
  ]
});
formatter.step({
  "line": 21,
  "name": "User is in gender MainPage",
  "keyword": "Given "
});
formatter.step({
  "line": 22,
  "name": "user is selecting Custom",
  "keyword": "When "
});
formatter.step({
  "line": 23,
  "name": "user is selecting she in box of \"Select Your Pronoun\"",
  "keyword": "When "
});
formatter.step({
  "line": 24,
  "name": "user is entering Male in Gender Optional in the textbox",
  "keyword": "And "
});
formatter.step({
  "line": 25,
  "name": "user is entering Female in Gender Optional in the textbox",
  "keyword": "And "
});
formatter.step({
  "line": 26,
  "name": "Use is Closing gender MainPage",
  "keyword": "Then "
});
formatter.match({
  "location": "GenderRadioButtonSteps.user_is_in_gender_MainPage()"
});
formatter.result({
  "duration": 7585380100,
  "status": "passed"
});
formatter.match({
  "location": "GenderRadioButtonSteps.user_is_selecting_Custom()"
});
formatter.result({
  "duration": 99529300,
  "error_message": "org.openqa.selenium.NoSuchElementException: no such element: Unable to locate element: {\"method\":\"css selector\",\"selector\":\"#u_0_8\"}\n  (Session info: chrome\u003d88.0.4324.150)\nFor documentation on this error, please visit: http://seleniumhq.org/exceptions/no_such_element.html\nBuild info: version: \u00273.7.1\u0027, revision: \u00278a0099a\u0027, time: \u00272017-11-06T21:01:39.354Z\u0027\nSystem info: host: \u0027DESKTOP-2QPEL12\u0027, ip: \u0027192.168.1.202\u0027, os.name: \u0027Windows 10\u0027, os.arch: \u0027amd64\u0027, os.version: \u002710.0\u0027, java.version: \u00271.8.0_241\u0027\nDriver info: org.openqa.selenium.chrome.ChromeDriver\nCapabilities {acceptInsecureCerts: false, browserName: chrome, browserVersion: 88.0.4324.150, chrome: {chromedriverVersion: 88.0.4324.96 (68dba2d8a0b14..., userDataDir: C:\\Users\\Aqdas\\AppData\\Loca...}, goog:chromeOptions: {debuggerAddress: localhost:52030}, javascriptEnabled: true, networkConnectionEnabled: false, pageLoadStrategy: normal, platform: WINDOWS, platformName: WINDOWS, proxy: Proxy(), setWindowRect: true, strictFileInteractability: false, timeouts: {implicit: 0, pageLoad: 300000, script: 30000}, unhandledPromptBehavior: dismiss and notify, webauthn:extension:largeBlob: true, webauthn:virtualAuthenticators: true}\nSession ID: d60bfc1e7fe86d0b371505bd163b073d\n*** Element info: {Using\u003did, value\u003du_0_8}\r\n\tat sun.reflect.NativeConstructorAccessorImpl.newInstance0(Native Method)\r\n\tat sun.reflect.NativeConstructorAccessorImpl.newInstance(NativeConstructorAccessorImpl.java:62)\r\n\tat sun.reflect.DelegatingConstructorAccessorImpl.newInstance(DelegatingConstructorAccessorImpl.java:45)\r\n\tat java.lang.reflect.Constructor.newInstance(Constructor.java:423)\r\n\tat org.openqa.selenium.remote.http.W3CHttpResponseCodec.createException(W3CHttpResponseCodec.java:187)\r\n\tat org.openqa.selenium.remote.http.W3CHttpResponseCodec.decode(W3CHttpResponseCodec.java:122)\r\n\tat org.openqa.selenium.remote.http.W3CHttpResponseCodec.decode(W3CHttpResponseCodec.java:49)\r\n\tat org.openqa.selenium.remote.HttpCommandExecutor.execute(HttpCommandExecutor.java:164)\r\n\tat org.openqa.selenium.remote.service.DriverCommandExecutor.execute(DriverCommandExecutor.java:83)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.execute(RemoteWebDriver.java:600)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.findElement(RemoteWebDriver.java:370)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.findElementById(RemoteWebDriver.java:416)\r\n\tat org.openqa.selenium.By$ById.findElement(By.java:218)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.findElement(RemoteWebDriver.java:362)\r\n\tat StepDefs.GenderRadioButtonSteps.user_is_selecting_Custom(GenderRadioButtonSteps.java:53)\r\n\tat ✽.When user is selecting Custom(GenderRadioButton.feature:22)\r\n",
  "status": "failed"
});
formatter.match({
  "arguments": [
    {
      "val": "Select Your Pronoun",
      "offset": 33
    }
  ],
  "location": "GenderRadioButtonSteps.user_is_selecting_she_in_box_of(String)"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "GenderRadioButtonSteps.user_is_entering_Male_in_Gender_Optional_in_the_textbox()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "GenderRadioButtonSteps.user_is_entering_Female_in_Gender_Optional_in_the_textbox()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "GenderRadioButtonSteps.use_is_Closing_gender_MainPage()"
});
formatter.result({
  "status": "skipped"
});
formatter.uri("LogIn.feature");
formatter.feature({
  "comments": [
    {
      "line": 1,
      "value": "#Author: your.email@your.domain.com"
    },
    {
      "line": 2,
      "value": "#Keywords Summary :"
    }
  ],
  "line": 6,
  "name": "Log In in to account",
  "description": "",
  "id": "log-in-in-to-account",
  "keyword": "Feature",
  "tags": [
    {
      "line": 5,
      "name": "@Smoke"
    }
  ]
});
formatter.scenario({
  "line": 9,
  "name": "Log in",
  "description": "",
  "id": "log-in-in-to-account;log-in",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 10,
  "name": "User is in the Home Page",
  "keyword": "Given "
});
formatter.step({
  "line": 11,
  "name": "User Clicks on log Into Existing Account",
  "keyword": "When "
});
formatter.step({
  "line": 12,
  "name": "User Enters Email in text box",
  "keyword": "When "
});
formatter.step({
  "line": 13,
  "name": "User Enters Password in text box",
  "keyword": "And "
});
formatter.step({
  "line": 14,
  "name": "User Close the Home Page",
  "keyword": "Then "
});
formatter.match({
  "location": "LogInSteps.user_is_in_the_Home_Page()"
});
formatter.result({
  "duration": 8163504200,
  "status": "passed"
});
formatter.match({
  "location": "LogInSteps.user_Clicks_on_log_Into_Existing_Account()"
});
formatter.result({
  "duration": 144912200,
  "status": "passed"
});
formatter.match({
  "location": "LogInSteps.user_Enters_Email_in_text_box()"
});
formatter.result({
  "duration": 35955700,
  "error_message": "org.openqa.selenium.NoSuchElementException: no such element: Unable to locate element: {\"method\":\"css selector\",\"selector\":\"*[name\u003d\u0027email\u0027]\"}\n  (Session info: chrome\u003d88.0.4324.150)\nFor documentation on this error, please visit: http://seleniumhq.org/exceptions/no_such_element.html\nBuild info: version: \u00273.7.1\u0027, revision: \u00278a0099a\u0027, time: \u00272017-11-06T21:01:39.354Z\u0027\nSystem info: host: \u0027DESKTOP-2QPEL12\u0027, ip: \u0027192.168.1.202\u0027, os.name: \u0027Windows 10\u0027, os.arch: \u0027amd64\u0027, os.version: \u002710.0\u0027, java.version: \u00271.8.0_241\u0027\nDriver info: org.openqa.selenium.chrome.ChromeDriver\nCapabilities {acceptInsecureCerts: false, browserName: chrome, browserVersion: 88.0.4324.150, chrome: {chromedriverVersion: 88.0.4324.96 (68dba2d8a0b14..., userDataDir: C:\\Users\\Aqdas\\AppData\\Loca...}, goog:chromeOptions: {debuggerAddress: localhost:52061}, javascriptEnabled: true, networkConnectionEnabled: false, pageLoadStrategy: normal, platform: WINDOWS, platformName: WINDOWS, proxy: Proxy(), setWindowRect: true, strictFileInteractability: false, timeouts: {implicit: 0, pageLoad: 300000, script: 30000}, unhandledPromptBehavior: dismiss and notify, webauthn:extension:largeBlob: true, webauthn:virtualAuthenticators: true}\nSession ID: 0840b592cfd4d23c358b82dec63d21e7\n*** Element info: {Using\u003dname, value\u003demail}\r\n\tat sun.reflect.NativeConstructorAccessorImpl.newInstance0(Native Method)\r\n\tat sun.reflect.NativeConstructorAccessorImpl.newInstance(NativeConstructorAccessorImpl.java:62)\r\n\tat sun.reflect.DelegatingConstructorAccessorImpl.newInstance(DelegatingConstructorAccessorImpl.java:45)\r\n\tat java.lang.reflect.Constructor.newInstance(Constructor.java:423)\r\n\tat org.openqa.selenium.remote.http.W3CHttpResponseCodec.createException(W3CHttpResponseCodec.java:187)\r\n\tat org.openqa.selenium.remote.http.W3CHttpResponseCodec.decode(W3CHttpResponseCodec.java:122)\r\n\tat org.openqa.selenium.remote.http.W3CHttpResponseCodec.decode(W3CHttpResponseCodec.java:49)\r\n\tat org.openqa.selenium.remote.HttpCommandExecutor.execute(HttpCommandExecutor.java:164)\r\n\tat org.openqa.selenium.remote.service.DriverCommandExecutor.execute(DriverCommandExecutor.java:83)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.execute(RemoteWebDriver.java:600)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.findElement(RemoteWebDriver.java:370)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.findElementByName(RemoteWebDriver.java:448)\r\n\tat org.openqa.selenium.By$ByName.findElement(By.java:303)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.findElement(RemoteWebDriver.java:362)\r\n\tat StepDefs.LogInSteps.user_Enters_Email_in_text_box(LogInSteps.java:38)\r\n\tat ✽.When User Enters Email in text box(LogIn.feature:12)\r\n",
  "status": "failed"
});
formatter.match({
  "location": "LogInSteps.user_Enters_Password_in_text_box()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "LogInSteps.user_Close_the_Home_Page()"
});
formatter.result({
  "status": "skipped"
});
formatter.scenarioOutline({
  "line": 18,
  "name": "Log in",
  "description": "",
  "id": "log-in-in-to-account;log-in",
  "type": "scenario_outline",
  "keyword": "Scenario Outline"
});
formatter.step({
  "line": 19,
  "name": "User is in the Home Page",
  "keyword": "Given "
});
formatter.step({
  "line": 20,
  "name": "User Clicks on log Into Existing Account",
  "keyword": "When "
});
formatter.step({
  "line": 21,
  "name": "User Enters \"\u003cEmail\u003e\" in Email text box",
  "keyword": "When "
});
formatter.step({
  "line": 22,
  "name": "User Enters \"\u003cPassword\u003e\"  in Passwod text box",
  "keyword": "And "
});
formatter.step({
  "line": 23,
  "name": "User Close the Home Page",
  "keyword": "Then "
});
formatter.examples({
  "line": 26,
  "name": "",
  "description": "",
  "id": "log-in-in-to-account;log-in;",
  "rows": [
    {
      "cells": [
        "Email",
        "Password"
      ],
      "line": 27,
      "id": "log-in-in-to-account;log-in;;1"
    },
    {
      "cells": [
        "Aqdas@gmail.com",
        "Lorton15288 Grist"
      ],
      "line": 28,
      "id": "log-in-in-to-account;log-in;;2"
    },
    {
      "cells": [
        "Bakee@gmail.com",
        "22709United State"
      ],
      "line": 29,
      "id": "log-in-in-to-account;log-in;;3"
    },
    {
      "cells": [
        "Zaheen@gmail.com",
        "Virginia@)079"
      ],
      "line": 30,
      "id": "log-in-in-to-account;log-in;;4"
    }
  ],
  "keyword": "Examples"
});
formatter.scenario({
  "line": 28,
  "name": "Log in",
  "description": "",
  "id": "log-in-in-to-account;log-in;;2",
  "type": "scenario",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "line": 5,
      "name": "@Smoke"
    }
  ]
});
formatter.step({
  "line": 19,
  "name": "User is in the Home Page",
  "keyword": "Given "
});
formatter.step({
  "line": 20,
  "name": "User Clicks on log Into Existing Account",
  "keyword": "When "
});
formatter.step({
  "line": 21,
  "name": "User Enters \"Aqdas@gmail.com\" in Email text box",
  "matchedColumns": [
    0
  ],
  "keyword": "When "
});
formatter.step({
  "line": 22,
  "name": "User Enters \"Lorton15288 Grist\"  in Passwod text box",
  "matchedColumns": [
    1
  ],
  "keyword": "And "
});
formatter.step({
  "line": 23,
  "name": "User Close the Home Page",
  "keyword": "Then "
});
formatter.match({
  "location": "LogInSteps.user_is_in_the_Home_Page()"
});
formatter.result({
  "duration": 7791930900,
  "status": "passed"
});
formatter.match({
  "location": "LogInSteps.user_Clicks_on_log_Into_Existing_Account()"
});
formatter.result({
  "duration": 160705800,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Aqdas@gmail.com",
      "offset": 13
    }
  ],
  "location": "LogInSteps.user_Enters_in_Email_text_box(String)"
});
formatter.result({
  "duration": 24065200,
  "error_message": "org.openqa.selenium.NoSuchElementException: no such element: Unable to locate element: {\"method\":\"css selector\",\"selector\":\"*[name\u003d\u0027email\u0027]\"}\n  (Session info: chrome\u003d88.0.4324.150)\nFor documentation on this error, please visit: http://seleniumhq.org/exceptions/no_such_element.html\nBuild info: version: \u00273.7.1\u0027, revision: \u00278a0099a\u0027, time: \u00272017-11-06T21:01:39.354Z\u0027\nSystem info: host: \u0027DESKTOP-2QPEL12\u0027, ip: \u0027192.168.1.202\u0027, os.name: \u0027Windows 10\u0027, os.arch: \u0027amd64\u0027, os.version: \u002710.0\u0027, java.version: \u00271.8.0_241\u0027\nDriver info: org.openqa.selenium.chrome.ChromeDriver\nCapabilities {acceptInsecureCerts: false, browserName: chrome, browserVersion: 88.0.4324.150, chrome: {chromedriverVersion: 88.0.4324.96 (68dba2d8a0b14..., userDataDir: C:\\Users\\Aqdas\\AppData\\Loca...}, goog:chromeOptions: {debuggerAddress: localhost:52096}, javascriptEnabled: true, networkConnectionEnabled: false, pageLoadStrategy: normal, platform: WINDOWS, platformName: WINDOWS, proxy: Proxy(), setWindowRect: true, strictFileInteractability: false, timeouts: {implicit: 0, pageLoad: 300000, script: 30000}, unhandledPromptBehavior: dismiss and notify, webauthn:extension:largeBlob: true, webauthn:virtualAuthenticators: true}\nSession ID: fdac75b5b66e00ab180313155eadd476\n*** Element info: {Using\u003dname, value\u003demail}\r\n\tat sun.reflect.NativeConstructorAccessorImpl.newInstance0(Native Method)\r\n\tat sun.reflect.NativeConstructorAccessorImpl.newInstance(NativeConstructorAccessorImpl.java:62)\r\n\tat sun.reflect.DelegatingConstructorAccessorImpl.newInstance(DelegatingConstructorAccessorImpl.java:45)\r\n\tat java.lang.reflect.Constructor.newInstance(Constructor.java:423)\r\n\tat org.openqa.selenium.remote.http.W3CHttpResponseCodec.createException(W3CHttpResponseCodec.java:187)\r\n\tat org.openqa.selenium.remote.http.W3CHttpResponseCodec.decode(W3CHttpResponseCodec.java:122)\r\n\tat org.openqa.selenium.remote.http.W3CHttpResponseCodec.decode(W3CHttpResponseCodec.java:49)\r\n\tat org.openqa.selenium.remote.HttpCommandExecutor.execute(HttpCommandExecutor.java:164)\r\n\tat org.openqa.selenium.remote.service.DriverCommandExecutor.execute(DriverCommandExecutor.java:83)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.execute(RemoteWebDriver.java:600)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.findElement(RemoteWebDriver.java:370)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.findElementByName(RemoteWebDriver.java:448)\r\n\tat org.openqa.selenium.By$ByName.findElement(By.java:303)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.findElement(RemoteWebDriver.java:362)\r\n\tat StepDefs.LogInSteps.user_Enters_in_Email_text_box(LogInSteps.java:59)\r\n\tat ✽.When User Enters \"Aqdas@gmail.com\" in Email text box(LogIn.feature:21)\r\n",
  "status": "failed"
});
formatter.match({
  "arguments": [
    {
      "val": "Lorton15288 Grist",
      "offset": 13
    }
  ],
  "location": "LogInSteps.user_Enters_in_Passwod_text_box(String)"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "LogInSteps.user_Close_the_Home_Page()"
});
formatter.result({
  "status": "skipped"
});
formatter.scenario({
  "line": 29,
  "name": "Log in",
  "description": "",
  "id": "log-in-in-to-account;log-in;;3",
  "type": "scenario",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "line": 5,
      "name": "@Smoke"
    }
  ]
});
formatter.step({
  "line": 19,
  "name": "User is in the Home Page",
  "keyword": "Given "
});
formatter.step({
  "line": 20,
  "name": "User Clicks on log Into Existing Account",
  "keyword": "When "
});
formatter.step({
  "line": 21,
  "name": "User Enters \"Bakee@gmail.com\" in Email text box",
  "matchedColumns": [
    0
  ],
  "keyword": "When "
});
formatter.step({
  "line": 22,
  "name": "User Enters \"22709United State\"  in Passwod text box",
  "matchedColumns": [
    1
  ],
  "keyword": "And "
});
formatter.step({
  "line": 23,
  "name": "User Close the Home Page",
  "keyword": "Then "
});
formatter.match({
  "location": "LogInSteps.user_is_in_the_Home_Page()"
});
formatter.result({
  "duration": 8265871200,
  "status": "passed"
});
formatter.match({
  "location": "LogInSteps.user_Clicks_on_log_Into_Existing_Account()"
});
formatter.result({
  "duration": 141248700,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Bakee@gmail.com",
      "offset": 13
    }
  ],
  "location": "LogInSteps.user_Enters_in_Email_text_box(String)"
});
formatter.result({
  "duration": 151282600,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "22709United State",
      "offset": 13
    }
  ],
  "location": "LogInSteps.user_Enters_in_Passwod_text_box(String)"
});
formatter.result({
  "duration": 172295000,
  "status": "passed"
});
formatter.match({
  "location": "LogInSteps.user_Close_the_Home_Page()"
});
formatter.result({
  "duration": 4180416800,
  "status": "passed"
});
formatter.scenario({
  "line": 30,
  "name": "Log in",
  "description": "",
  "id": "log-in-in-to-account;log-in;;4",
  "type": "scenario",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "line": 5,
      "name": "@Smoke"
    }
  ]
});
formatter.step({
  "line": 19,
  "name": "User is in the Home Page",
  "keyword": "Given "
});
formatter.step({
  "line": 20,
  "name": "User Clicks on log Into Existing Account",
  "keyword": "When "
});
formatter.step({
  "line": 21,
  "name": "User Enters \"Zaheen@gmail.com\" in Email text box",
  "matchedColumns": [
    0
  ],
  "keyword": "When "
});
formatter.step({
  "line": 22,
  "name": "User Enters \"Virginia@)079\"  in Passwod text box",
  "matchedColumns": [
    1
  ],
  "keyword": "And "
});
formatter.step({
  "line": 23,
  "name": "User Close the Home Page",
  "keyword": "Then "
});
formatter.match({
  "location": "LogInSteps.user_is_in_the_Home_Page()"
});
formatter.result({
  "duration": 8773566300,
  "status": "passed"
});
formatter.match({
  "location": "LogInSteps.user_Clicks_on_log_Into_Existing_Account()"
});
formatter.result({
  "duration": 135601600,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Zaheen@gmail.com",
      "offset": 13
    }
  ],
  "location": "LogInSteps.user_Enters_in_Email_text_box(String)"
});
formatter.result({
  "duration": 216480500,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Virginia@)079",
      "offset": 13
    }
  ],
  "location": "LogInSteps.user_Enters_in_Passwod_text_box(String)"
});
formatter.result({
  "duration": 139292600,
  "status": "passed"
});
formatter.match({
  "location": "LogInSteps.user_Close_the_Home_Page()"
});
formatter.result({
  "duration": 172178000,
  "status": "passed"
});
formatter.uri("RadioButton.feature");
formatter.feature({
  "comments": [
    {
      "line": 1,
      "value": "#Author: your.email@your.domain.com"
    },
    {
      "line": 2,
      "value": "#Keywords Summary :"
    },
    {
      "line": 3,
      "value": "#Feature: List of scenarios."
    }
  ],
  "line": 7,
  "name": "Selecting Gender",
  "description": "",
  "id": "selecting-gender",
  "keyword": "Feature"
});
formatter.scenario({
  "line": 12,
  "name": "Selecting Gender female male custom",
  "description": "",
  "id": "selecting-gender;selecting-gender-female-male-custom",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 11,
      "name": "@Smoke"
    }
  ]
});
formatter.step({
  "line": 14,
  "name": "User is in gender MainPage",
  "keyword": "Given "
});
formatter.step({
  "line": 15,
  "name": "User is Selecting her/his Gender",
  "keyword": "When "
});
formatter.step({
  "line": 16,
  "name": "user is selecting she in box of \"Select Your Pronoun\"",
  "keyword": "When "
});
formatter.step({
  "line": 17,
  "name": "user is entering Male in Gender Optional in the textbox",
  "keyword": "And "
});
formatter.step({
  "line": 18,
  "name": "user is entering Female in Gender Optional in the textbox",
  "keyword": "And "
});
formatter.step({
  "line": 19,
  "name": "Use is Closing gender MainPage",
  "keyword": "Then "
});
formatter.match({
  "location": "GenderRadioButtonSteps.user_is_in_gender_MainPage()"
});
formatter.result({
  "duration": 8379854300,
  "status": "passed"
});
formatter.match({
  "location": "GenderRadioButtonSteps.user_is_Selecting_her_his_Gender()"
});
formatter.result({
  "duration": 2236580400,
  "error_message": "org.openqa.selenium.NoSuchElementException: no such element: Unable to locate element: {\"method\":\"css selector\",\"selector\":\"#u_0_7\"}\n  (Session info: chrome\u003d88.0.4324.150)\nFor documentation on this error, please visit: http://seleniumhq.org/exceptions/no_such_element.html\nBuild info: version: \u00273.7.1\u0027, revision: \u00278a0099a\u0027, time: \u00272017-11-06T21:01:39.354Z\u0027\nSystem info: host: \u0027DESKTOP-2QPEL12\u0027, ip: \u0027192.168.1.202\u0027, os.name: \u0027Windows 10\u0027, os.arch: \u0027amd64\u0027, os.version: \u002710.0\u0027, java.version: \u00271.8.0_241\u0027\nDriver info: org.openqa.selenium.chrome.ChromeDriver\nCapabilities {acceptInsecureCerts: false, browserName: chrome, browserVersion: 88.0.4324.150, chrome: {chromedriverVersion: 88.0.4324.96 (68dba2d8a0b14..., userDataDir: C:\\Users\\Aqdas\\AppData\\Loca...}, goog:chromeOptions: {debuggerAddress: localhost:52218}, javascriptEnabled: true, networkConnectionEnabled: false, pageLoadStrategy: normal, platform: WINDOWS, platformName: WINDOWS, proxy: Proxy(), setWindowRect: true, strictFileInteractability: false, timeouts: {implicit: 0, pageLoad: 300000, script: 30000}, unhandledPromptBehavior: dismiss and notify, webauthn:extension:largeBlob: true, webauthn:virtualAuthenticators: true}\nSession ID: 54e620ed2ef004da8853204e5aef1d39\n*** Element info: {Using\u003did, value\u003du_0_7}\r\n\tat sun.reflect.NativeConstructorAccessorImpl.newInstance0(Native Method)\r\n\tat sun.reflect.NativeConstructorAccessorImpl.newInstance(NativeConstructorAccessorImpl.java:62)\r\n\tat sun.reflect.DelegatingConstructorAccessorImpl.newInstance(DelegatingConstructorAccessorImpl.java:45)\r\n\tat java.lang.reflect.Constructor.newInstance(Constructor.java:423)\r\n\tat org.openqa.selenium.remote.http.W3CHttpResponseCodec.createException(W3CHttpResponseCodec.java:187)\r\n\tat org.openqa.selenium.remote.http.W3CHttpResponseCodec.decode(W3CHttpResponseCodec.java:122)\r\n\tat org.openqa.selenium.remote.http.W3CHttpResponseCodec.decode(W3CHttpResponseCodec.java:49)\r\n\tat org.openqa.selenium.remote.HttpCommandExecutor.execute(HttpCommandExecutor.java:164)\r\n\tat org.openqa.selenium.remote.service.DriverCommandExecutor.execute(DriverCommandExecutor.java:83)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.execute(RemoteWebDriver.java:600)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.findElement(RemoteWebDriver.java:370)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.findElementById(RemoteWebDriver.java:416)\r\n\tat org.openqa.selenium.By$ById.findElement(By.java:218)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.findElement(RemoteWebDriver.java:362)\r\n\tat StepDefs.GenderRadioButtonSteps.user_is_Selecting_her_his_Gender(GenderRadioButtonSteps.java:34)\r\n\tat ✽.When User is Selecting her/his Gender(RadioButton.feature:15)\r\n",
  "status": "failed"
});
formatter.match({
  "arguments": [
    {
      "val": "Select Your Pronoun",
      "offset": 33
    }
  ],
  "location": "GenderRadioButtonSteps.user_is_selecting_she_in_box_of(String)"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "GenderRadioButtonSteps.user_is_entering_Male_in_Gender_Optional_in_the_textbox()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "GenderRadioButtonSteps.user_is_entering_Female_in_Gender_Optional_in_the_textbox()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "GenderRadioButtonSteps.use_is_Closing_gender_MainPage()"
});
formatter.result({
  "status": "skipped"
});
});