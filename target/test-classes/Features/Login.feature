Feature: OrangeHRM Login Feature

  Scenario: Validate Login Feature with valid credentials
    Given user is on login page
    When user enters username
    And user enters password
    And user clicks on login button
    Then user should be successfully logged in

  Scenario: Validate Login Page Title
    Given user is on login page
    Then the tile of the page should be OrangeHRM

  Scenario: Validate multiple actions
    Given user has logged in
    When user selects a product and add to cart
      | Admin1 |
      | Admin123 |
      | Admin1234  |
    When user checkouts
    Then Order should be placed successfully
