Feature: Login

  # TCC.HR.001
  Scenario: Successful login with valid credentials
    Given I am on the login page
    When I enter a valid username and password
    And I click the login button
    Then I should be redirected to dashboard page

  # TCC.HR.002
  Scenario: Invalid login with invalid credentials
    Given I am logout
    When I enter a invalid username and password
    And I click the login button
    Then I see message invalid credentials
    And I was on the login page