Feature: Home functionality

  Scenario: Check the top nav in the home functionality
    Given Navigate to the Website Campus
    When Enter username and password and click on the login button
    Then User should be login successfully
    And  Click on the elements in the top nav
      | coursesBtn    |
      | calendarBtn   |
      | attendanceBtn |
      | assignmentBtn |
      | gradingBtn    |

    Then Move to the elements und click on the elements
      | hamburgerMenuBtn   |
      | newMessageChatBtn  |
      | newMessageBtn      |
      | profileSettingsBtn |
