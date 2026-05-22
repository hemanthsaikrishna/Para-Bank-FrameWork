Feature: Account Overview Functionality

Scenario: Verify account overview page

Given user launches ParaBank application
When user enters valid username and password
And clicks login button
Then account details should be displayed