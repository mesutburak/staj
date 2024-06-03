Feature: Hamburger menu messaging functionality

  Scenario: Check the elements in the hamburger menu of the messaging button
    Given Navigate to the Website Campus
    When Enter username and password and click on the login button
    Then User should be login successfully
    And Click on the elements in the hamburger menu of the messaging button
    |hamburgerMenuBtn|
    |messagingBtn|
    |newMessageBtn|
    |hamburgerMenuBtn|
    |messagingBtn|
    |inboxBtn|
    |hamburgerMenuBtn|
    |messagingBtn|
    |outboxBtn|
    |hamburgerMenuBtn|
    |messagingBtn|
    |trashBtn|