Feature: Recruitment Add Candidate

  # TCC.HR.041
  Scenario: Admin add new candidate
    Given I am on the login page
    And Admin go to menu Recruitment
    When Admin click button Add
    And Admin enter firstname
    And Admin enter lastname
    And Admin enter email
    And Admin upload file resume
    And Admin click button save
    Then Admin redirect to page Application Stage