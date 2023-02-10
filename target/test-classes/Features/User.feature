Feature: Add User Feature

  Background: 
    Given user is on login page
    When user enters username
    And user enters password
    And user clicks on login button
    Then user should be logged in

  @Regression
  Scenario: Validate Add User Functionality
    When user is on Admin Page
    And user clicks on Add button
    And user enters the details
    And user clicks on Save button
    Then user should be added successfully
