Feature: Login

Scenario: Successful login
    Given I am on the login page
    When I enter username as "myusername" and password as "mypassword"
    And I click the login button
    Then I should be logged in successfully