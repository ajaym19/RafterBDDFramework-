Feature: Learning Parameters

  @Smoke
  Scenario Outline: Login with parameters
    Given user is on login page
    When user enters username as <username> and password as <password>
    And user clicks on login button
    Then user should be successfully logged in

    Examples: 
      | username | password |
      | admin    | admin123 |
      | hr       | hr123    |
