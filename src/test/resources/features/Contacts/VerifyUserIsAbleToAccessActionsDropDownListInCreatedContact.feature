@issue:TC_023
@author:Madhuri

Feature: Verify user is able to access "actions" dropdown list in created contact

  Scenario Outline: Verify user is able to access "actions" dropdown list in created contact
    Given launch browser
    Then user enters "<Username>" and "<Password>"
    And clicks on login button
    When click on Contacts dropdown
    And  click on create contacts
    Then Enter required details on create contacts page
    And  click save
    And Click on "Actions" dropdown list
    Then Action dropdown list should be displayed
    And  Close Browser
    Examples:
      | Username | Password |
      | will     | will     |