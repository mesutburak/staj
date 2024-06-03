Feature: Home Functionality

  Scenario: Click on the logo and navigate to Techno Study
    Given Navigate to the Website Campus
    Then Enter username and password and click on the login button
    When User should be login successfully
    Then Click on the logo on the left side on the top
    And Navigate to the Website Techno Study
