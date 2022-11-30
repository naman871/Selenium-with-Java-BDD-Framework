@issue:TC_001
@author:Sunitha

Feature: Verify user is able to view the labels displayed

  Scenario Outline: Verify user is able to view the labels displayed
    Given launch browser
    Then user enters "<Username>" and "<Password>"
    And  clicks on login button
    Then Validate Homepage DashBoard
    And  Close Browser
    Examples:
      | Username | Password |
      | will     | will     |