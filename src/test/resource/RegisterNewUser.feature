Feature: Register User Test

  @RegisterNewUser
  Scenario: I want to be able to register as a new user successfully
    Given I am on the home page
    And I click on signup or login button
    When I clcik on Signup
    And I enter user email details
    And I enter user password
    And I enter user postcode
    Then I click on Lets fix the food chain button
    
