Feature: Basic Authentication
  This feature will check the navigation behaviour 'Basic Auth'.

  @TEST_TI_0002
  Scenario: Basic Auth allows validated access
    Given the page under test is 'https://the-internet.herokuapp.com'
    When the 'Basic Auth' example is clicked and opened
    And valid credentials are entered
    Then Congratulations text should be displayed
