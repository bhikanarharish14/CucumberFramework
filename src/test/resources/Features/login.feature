Feature: Login Functionality

  Scenario: Valid Login
    Given use should be on login
    When user enter valid credentials
    And click on login button
    Then user should be navigated to home page
    And user can see the logout link

  Scenario: Invalid Login
    Given use should be on login
    When user enter invalid credentials
    And click on login button
    Then user should be navigated to login page
    And user can see the error message