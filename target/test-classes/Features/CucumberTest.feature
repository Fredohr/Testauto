
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
      |     email      | username |  password  |
      | hars@lars.com  | Hasse666 | Larsipan1! |
      | larz@lars.com  | Lasse999 | Larsipan2! |
      | lazz@lars.com  |          | Larsipan3! |
      |                | Lasse656 | Larsipan4! |
      