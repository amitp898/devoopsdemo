Feature: user is login to automationexercise application successfully.

  Background:
  Given user is on application login page

    Scenario: user will login the application with valid credential.
      Given i have provided the valid username and password
      When i have click on login button
      Then i should successfully login to application