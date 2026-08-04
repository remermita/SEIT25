Feature: Sortable Data Tables
  This feature will display the Example 1 table

  @TEST_TI_0003
  Scenario: Sortable Data Tables - Example 1 displays the expected 4 results
    Given the page under test is 'https://the-internet.herokuapp.com'
    When I click 'Sortable Data Tables'
    Then the table should display the expected results
      | Last Name    |  First Name    | Email                 | Due     | Web Site                  |
      | Smith        |  John          | jsmith@gmail.com      | $50.00  | http://www.jsmith.com     |
      | Bach         |  Frank         | fbach@yahoo.com       | $51.00  | http://www.frank.com      |
      | Doe          |  Jason         | jdoe@hotmail.com      | $100.00 | http://www.jdoe.com       |
      | Conway       |  Tim           | tconway@earthlink.net | $50.00  | http://www.timconway.com  |