Feature: Transfer Funds Functionality

Scenario: Verify user can transfer funds

Given user launches ParaBank application
When user enters valid username and password
And clicks login button
And user navigates to transfer funds page
And user enters transfer amount
And clicks transfer button
Then funds should transfer successfully

Scenario: Verify bill payment

Given user launches ParaBank application
When user enters valid username and password
And clicks login button
And user navigates to bill payment page
And user enters bill payment details
And user clicks send payment button
Then bill payment should complete successfully