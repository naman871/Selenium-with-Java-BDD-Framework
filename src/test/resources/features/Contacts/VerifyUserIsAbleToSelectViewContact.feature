@issue:TC_018
@author-Ramya

Feature: Verify user is able to access view contact

  Scenario Outline: Verify user is able to access view contact
    Given launch browser
    Then user enters "<Username>" and "<Password>"
    And clicks on login button
    Then user is on HomePage
    Then clicks on Contacts
    And  User is able to select view contact
    And  Close Browser



    Examples:
      | Username | Password |
      | will     | will     |