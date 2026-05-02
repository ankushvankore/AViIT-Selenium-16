Feature: Data Driven Testing

  Scenario Outline: To validate login functionality on Sauce Demo
    Given Launch Sauce Demo
    When Enter user name as "<UserName>"
    When Enter password as "<Password>"
    And I Click on login button
    Then Inventroy page should display

    Examples:
    |UserName|Password|
    |standard_user|secret_sauce|
    |amit         |amit        |