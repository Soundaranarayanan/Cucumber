
Feature: login feature
  i want to use this feature to test the login functionality for the swaglabs application
Background:
Given I am in the Login Page

  @ValidCredentials, @regression
  Scenario: to test login feature using valid credentials
    
    When user provides a valid user id
    And user provides a valid password
    And user clicks the login button
    Then I should see the homepage

  @InvalidUsername, @regression
  Scenario: to test login feature using an invalid username

    When user provides an invalid user id as blank space
    And user provides a valid password
    And user clicks the login button
    Then I should see the error message

  @InvalidPassword
  Scenario: to test login feature using an invalid password
    
    When user provides a valid user id
    And user provides an invalid password as blank space
    And user clicks the login button
    Then I should see the error message

  @InvalidCredentials
  Scenario: to test login feature using invalid credentials
 
    When user provides an invalid user id
    And user provides an invalid password
    And user clicks the login button
    Then I should see the error message
