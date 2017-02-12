Feature: Log In Test

  @LogIn
  Scenario: As a customer I want to be able to log in successfully
    Given I am on the home page
    And I click on signup or login button
    And I enter my email address
    And I enter my Password
    When I click on Login button
    Then I should be logged In
