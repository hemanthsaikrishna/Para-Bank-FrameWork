Feature: Registration Functionality

Scenario: Register new user with valid details

Given user launches ParaBank application
When user navigates to registration page
And user enters registration details
And clicks register button
Then user should register successfully