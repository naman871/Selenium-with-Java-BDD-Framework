@issue:TC_017
@author-Ramya

Feature: Verify user is able to select create contact

  Scenario Outline: Verify user is able to select create contact
    Given launch browser
    Then user enters "<Username>" and "<Password>"
    And clicks on login button
    Then user is on HomePage
    Then clicks on Contacts
    And  User is able to select create contact


    Examples:
      | Username | Password |
      | will     | will     |