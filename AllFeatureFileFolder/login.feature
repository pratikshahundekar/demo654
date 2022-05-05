Feature: Test Orange HRM Functionality

  Scenario: test Login functionality
    Given user is on login page
    When user enter valid username and valid password
    Then user is on home page
