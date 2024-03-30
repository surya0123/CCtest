Feature: Test the login functionality of OpenCart E-commerce Website

  As a user of the OpenCart website
  I want to be able to log in with my account
  So that I can access my account-related features and manage my orders


  Background:
    Given I am one the OpenCart login Page

    Scenario: Successful login with valid credentials
      Given I have entered a valid username and password
      When I click on the login button
      Then I should be logged in Successfully

      Scenario Outline: Unsuccessful login with Invalid or empty credentials
        Given I have entered invalid "<username>" and "<password>"
        When I click on the login button
        Then I should see an error message indicating "<error_message>"

        Examples:
          | username          |  | password        |  | error_message                                        |
          | invalid@gmail.com |  | invalidPassword |  | Warning: No match for E-mail address and/or Password |
          | abcccc            |  | validPassword   |  | Warning: No match for E-mail address and/or Password |
          | valid@gmail.com   |  | abcccc          |  | Warning: No match for E-mail address and/or Password |

        Scenario: Navigating to the forgotton password page
          When I click on the "Forgotten Password" link
          Then I should be restricted to the password reset page



