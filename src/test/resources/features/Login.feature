Feature: Login functionality
  User Story: User is able to login

  @smoke
  Scenario: Login with valid credentials
    Given the user on the login page
    Given the user is logged in with valid credentials
    Then the user should see the url "Files - Seamlessly -QA"

