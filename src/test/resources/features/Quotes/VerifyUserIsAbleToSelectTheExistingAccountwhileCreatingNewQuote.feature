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
    And Enter the required Fields title as "will westin"
    And In Address Information section click on cursor beside account field
    And Account with the entered name "Sea Region Inc" should be displayed in the list
    And Click on the account name
    And The existing account "Sea Region Inc" should be selected for the quote
    And close Browser

    Examples:
      | Username | Password |
      | will     | will     |