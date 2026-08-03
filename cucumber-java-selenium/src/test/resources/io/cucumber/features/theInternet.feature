Feature: The Internet
  This feature covers (some) Example pages on 'the-internet.herokuapp.com'

  @TEST_TI_0001
  Scenario: Homepage has a list of links to Expected examples
    Given the page under test is 'https://the-internet.herokuapp.com'
    And the user views the list of links
    Then the expected list should contain only the following:


#
#  @TEST_TI_0001
#  Scenario: Sortable Data Tables - Example 1 displays the expected 4 results
#    Given the page under test is 'Sortable Data Tables'
#    And add other steps