@issue:TC_023
@author:Madhuri

Feature: Verify user is able to access "actions" dropdown list in created contact

  Scenario Outline: Verify user is able to access "actions" dropdown list in created contact
    Given launch browser
    Then user enters "<Username>" and "<Password>"
    And clicks on login button
    When click on Contacts dropdown
    And  click on create contacts
    Then enter required details:Firstname as "Mithin" and Lastname as "Sam" on create contacts page
    And  click save
    And click on "Actions" dropdown list
    Then action dropdown list should be displayed in created contacts page
    And  close Browser

    Examples:
      | Username | Password |
      | will     | will     |