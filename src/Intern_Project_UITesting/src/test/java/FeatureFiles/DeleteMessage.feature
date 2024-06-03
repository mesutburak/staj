Feature: Deleted Messages Management
As a Student, I should be able to restore or permanently delete messages that I have deleted (moved to the trash).

Background:
Given Navigate to the Website Campus
When Enter username and password and click on the login button
Then User should be login successfully

Scenario: There should be a trash button in the hamburger menu.
Given  the trash button is clicked, messages should be displayed.
When  the delete icon is clicked, a message deletion confirmation should appear, and the message should be deletable.


Scenario: The restore button should be visible.
Given The restore button should be clickable.
When A success message should be displayed.