@issue:37
@author:Vindhyana

Feature: Verify user is able to add account to the quote while creating new quote.

  Scenario Outline: Verify missing required field error message
    Given launch browser
    Then user enters "<Username>" and "<Password>"
    And clicks on login button
    Then user is on HomePage
    And user clicks on quotes module
    And user click on create quotes modules
    And Enter the required Fields title as "Quotes"
    And In Address Information section click on cursor beside account field
    And Account with the entered name should be displayed in the list
    And close Browser

    Examples:
      |Username|Password|
      |will    |will    |