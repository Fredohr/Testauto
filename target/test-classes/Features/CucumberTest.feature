
Feature: Sign up at Mailchimp.com
  I am a email user who wants to create a account at mailchimp.com 
  in order to manage my email accounts.

  
  Scenario Outline: Creating a account
    Given I want navigate to https://login.mailchimp.com/signup/
    When I register my <email>
    And I create a <username>
    And I Create a <password> and press sign up
   Then I validate that i is re-directed to the confirmation page

    Examples: 
      |     email        | username  |  password  |
      | hars@lars.com    | Hasse686  | Larsipan1! |
      | lars23@larz.com  | Lasses879 | Larsipan2! |
      | lasz@lars.com    |           | Larsipan3! |
      |                  | Lasse365  | Larsipan4! |
      