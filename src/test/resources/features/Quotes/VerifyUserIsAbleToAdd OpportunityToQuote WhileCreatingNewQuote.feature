@issue:41
@author:Vindhyana

Feature: Verify user is able to add opportunity to the quote while creating new quote

  Scenario Outline: Verify user is able to add opportunity to the quote while creating new quote
    Given launch browser
    Then user enters "<Username>" and "<Password>"
    And clicks on login button
    When user is on HomePage
    And user clicks on quotes module
    Then Click on Create Quotes option
    And Enter the required Fields title as "will westin"
    And In Overview section click on cursor beside opportunity field
    And Click on the opportunity for the opportunity list in Opportunity search window
    And Click on the opportunity name
    And Selected opportunity "Sea Region Inc - 1000 units" should be displayed for the quote.

    Examples:
      | Username | Password |
      | will     | will     |