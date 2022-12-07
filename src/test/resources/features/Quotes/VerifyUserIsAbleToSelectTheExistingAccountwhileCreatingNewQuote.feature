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
    And Enter the required Fields title as "Quotes"
    And In Address Information section click on cursor beside account field
    And Get the account list in the Account search window
    And Click on the account name
    And The existing account should be selected for the quote
    Examples:
      | Username | Password |
      | will     | will     |