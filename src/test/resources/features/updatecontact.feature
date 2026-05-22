Feature: Update Contact Information Functionality

  Scenario: Verify user can update contact information

    Given user launches ParaBank application
    When user enters valid username and password
    And clicks login button
    And user navigates to update contact page
    And user updates contact information
    And user clicks update profile button
    Then contact information should update successfully