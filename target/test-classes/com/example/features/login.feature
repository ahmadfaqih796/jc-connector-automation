Feature: Login

Scenario: Successful login
    Given I am on the login page
    When I enter username as "admin@connector.com" and password as "admin@connector"
    And I click the login button
    Then I should be logged in successfully