@issue:TC_016
@author-Ramya

Feature: Verify User Is Able To Access Contact module

  Scenario Outline:Verify User Is Able To Access Contact module
    Given launch browser
    Then user enters "<Username>" and "<Password>"
    And clicks on login button
    Then user is on HomePage
    Then clicks on Contacts
    And  Close Browser

    Examples:
      | Username | Password |
      | will     | will     |