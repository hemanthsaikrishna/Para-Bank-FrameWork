Feature: Login Functionality

Scenario: Login with valid credentials

Given user launches ParaBank application
When user enters valid username and password
And clicks login button
Then user should navigate to account overview page