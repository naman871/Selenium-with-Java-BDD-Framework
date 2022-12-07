@issue:
@author:Vindhyana

Feature: Verify missing required field error message should be displayed

  Scenario Outline: Verify missing required field error message
    Given launch browser
    Then user enters "<Username>" and "<Password>"
    And clicks on login button
    Then user is on HomePage
    And user clicks on quotes module
    And user click on create quotes modules
    And Click on Save
    And user verify "Missing required field: Title" error message after save

    Examples:
      |Username|Password|
      |will    |will    |