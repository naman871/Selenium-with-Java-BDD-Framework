@issue:39
@author:Vindhyana

Feature: Verify Copy address from left checkbox is working in Address information section.

  Scenario Outline: Verify missing required field error message
    Given launch browser
    Then user enters "<Username>" and "<Password>"
    And clicks on login button
    Then user is on HomePage
    And user clicks on quotes module
    Then Click on Create Quotes option
    And Enter the required Fields title as "will westin"
    And In Address Information section click on cursor beside account field
    And Account with the entered name "Sea Region Inc" should be displayed in the list
    And Click on the account name
    And Click on  Copy address from left checkbox in Address Information section is enabled
    And close Browser

    Examples:
      |Username|Password|
      |will    |will    |