@issue:036
@author-Sukanya
Feature: Verify user is able to select the existing account while creating new quote.

  Scenario Outline:Verify user is able to select the existing account while creating new quote.
    Given launch browser
    When user enters "<Username>" and "<Password>"
    And clicks on login button
    Then user is on HomePage
    And click on Quotes module
    Then Click on Create Quotes option
    And Enter all the required fields
    And In Address Information section click on cursor beside account field

    Examples:
      | Username | Password |
      | will     | will     |