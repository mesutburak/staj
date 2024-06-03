Feature: Login functionality

  Background:
    Given Navigate to the Website Campus


  Scenario: Login with valid username and password

    When Enter username and password and click on the login button
    Then User should be login successfully

  Scenario: Login with invalid username and password

    When Enter invalid username and password and click on the login button
    Then User should receive an error message