Feature: test orange hrm admin and pim page functionality

  Background: 
    Given user is on login page
    When user enter valid uname and password
    Then user is on home page of orange hrm

  @PIMPage
  Scenario: test pim page page functionality
    * user click on pim link and user is on pim page
    * user add new employee
    Then user enter more personal details and click on save button
    When user click on search button
    Then user delete newly created employee

  @AdminPage
  Scenario: test the admin page functionality
    When user click admin link then user will be on admin page
    Then add new user in admin page
    When search the newly created user in admin page
    Then delete the newly created user
		
