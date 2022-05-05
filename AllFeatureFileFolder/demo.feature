@AllScenario
Feature: test tags in cucumber

  @Google
  Scenario: test the google functionality
    When user test google title
    Then pqr

  @Facebook
  Scenario: test facebook functionality
    Then user test facebook title
    And abc

  @orangehrm
  Scenario: test orange functionality
    Then user test logo
    But xyz

 # Given When Then And But *