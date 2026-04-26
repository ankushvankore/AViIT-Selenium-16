Feature: Login functionality on Sauce Demo Application
  Background:
    Given Open Sauce Demo Application
  Scenario: To validate login functionality with valid data
    When Enter valid user name
    When Enter valid password
    And Click on Login button
    Then Home page should display

  Scenario: To validate login functionality with invalid data
    When Enter invalid user name and invalid password
    And User clicks on Login button
    Then Error message should display