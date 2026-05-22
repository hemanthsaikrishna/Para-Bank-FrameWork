Feature: Logout Functionality

Scenario: Verify user logout

Given user launches ParaBank application
When user enters valid username and password
And clicks login button
And user clicks logout link
Then user should logout successfully