Feature: Student should be able to access the Finance

  Background:
    Given Navigate to the Website Campus
    When Enter username and password and click on the login button
    Then User should be login successfully

  Scenario:
    Given The finance section in the hamburger menu should be clicked.
    When The finance page should be displayed
    Then Student should be verified that the page is displayed.