Feature: test orange HRM functionality

  Scenario: test login functionality
    Given user is on login page
    When user enter valid username and valid password
      | Admin | admin123 |
    Then user is on home page
