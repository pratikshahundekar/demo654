Feature: test facebook register functionality

  Scenario: create a new fb account
    Given user is on register page
    When user enter first name and last name,
    And user enter password and select Dob
    Then account is sucessful created
