@issue:40
@author:Vindhyana

Feature: Verify missing required field error message should be displayed

  Scenario Outline: Verify missing required field error message
    Given launch browser
    Then user enters "<Username>" and "<Password>"
    And clicks on login button
    Then user is on HomePage
    And user clicks on quotes module
    Then Click on Create Quotes option
    And Click on Save
    And user verify "Missing required field: Title" error message after save
    And close Browser

    Examples:
      |Username|Password|
      |will    |will    |