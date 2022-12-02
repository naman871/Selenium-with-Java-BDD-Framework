@issue:
@author-Sukanya
Feature: Quotes Module

  Scenario Outline:Verify user is able to create quote under Quotes module
    Given launch browser
    When user enters "<Username>" and "<Password>"
    And clicks on login button
    Then user is on HomePage
    And click on Quotes module
    Then Click on Create Quotes option
    And Enter all the required fields
    And Click on Save

    Examples:
      | Username | Password |
      | will     | will     |