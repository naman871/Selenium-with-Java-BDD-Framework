@issue:TC_018
@author-Ramyasri

Feature: Verify user is able to access view contact

  Scenario Outline: Verify user is able to access view contact
    Given launch browser
    Then user enters "<Username>" and "<Password>"
    And  clicks on login button
    When click on Contacts dropdown
    And  user is able to select view contact
    And  close Browser



    Examples:
      | Username | Password |
      | will     | will     |