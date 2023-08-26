Feature: Login #Test scenario #Gerkin Language

  Background: # Repeatation of step so reduced it
    Given I enter the login url "https://www.saucedemo.com"
@Regression @Sanity
  Scenario Outline: 
    When I enter username "<username>" and password "<password>"
    When I click on login button
    Then I verify user land on homepage

    Examples: # pipeline
      | username                | password     |
      | standard_user           | secret_sauce |
      | locked_out_user         | secret_sauce |
      | problem_user            | secret_sauce |
      | performance_glitch_user | secret_sauce |
 @Regression
  Scenario: Login with wrong credentils  # Negative test cases
    When I enter username "standard_use" and password "secret_sauce"
    When I click on login button
    Then I verify user land on homepage
    But I should receive message its wrong credentils
