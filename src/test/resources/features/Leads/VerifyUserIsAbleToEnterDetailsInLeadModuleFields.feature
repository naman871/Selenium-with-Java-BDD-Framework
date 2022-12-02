@issue:TC_027
@author:Madhuri

Feature: Verify user is able to enter details in lead module fields

  Scenario Outline:
    Given launch browser
    Then user enters "<Username>" and "<Password>"
    And clicks on login button
    When click on Leads dropdown
    And  click on create lead
    Then Enter required details
    And  Close Browser
    Examples:
      | Username | Password |
      | will     | will     |