

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
      | lars@lars.com  | Lasse666 | Larsipan1! |
      
   Scenario Outline: Creating a account again
      Given I want navigate to https://login.mailchimp.com/signup/
    When I register my <email>
    And I create a <username>
    And I Create a <password> and press sign up
   Then I validate that i is re-directed to the confirmation page

    Examples: 
      |     email      | username |  password  |
      | lars@lars.com  | Lasse666 | Larsipan2! |
      
      
      Scenario Outline: Creating a account without email
     Given I want navigate to https://login.mailchimp.com/signup/
     When I register my <email>
     And I create a <username>
     And I Create a <password> and press sign up
     Then I validate that i is re-directed to the confirmation page

    Examples: 
      |  username  |  password  |
      | LasseHasse | Larsipan3! |
      
       Scenario Outline: Creating a account with long email
    Given I want navigate to https://login.mailchimp.com/signup/
    When I register my <email>
    And I create a <username>
    And I Create a <password> and press sign up
    Then I validate that i is re-directed to the confirmation page

    Examples: 
      |  username  |  password  |
      | LasseLasse | Larsipan4! |
     
      
   
