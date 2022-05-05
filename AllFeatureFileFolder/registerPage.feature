Feature: test sys suite Application
  
  Rule: Scenario one

  Scenario Template: test register functionality
    Given user is on register page
    When user enter "<company_name>", "<email>","<password>"  and "<confirm_password>"
    Then user will be home page

    Scenarios: 
      | company_name | email             | password   | confirm_password |
      | amdocs       | amdocs@gmail.com  | amdocs123  | amdocs123        |
      | wipro        | wipro@gmail.com   | wipro123   | wipro123         |
      | infosys      | infosys@gmail.com | infosys123 | infosys123       |
      | Paytm        | paytm@gmail.com   | paytm123   | paytm123         |
      | google       | google@gmail.com  | google123  | google123        |

  Scenario: test the google functionality
    When user test google title
