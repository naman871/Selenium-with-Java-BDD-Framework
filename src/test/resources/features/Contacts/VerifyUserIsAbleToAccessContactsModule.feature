@issue:TC_016
@author-Ramyasri

Feature: Verify user is able to access Contacts Module

  Scenario Outline:Verify user is able to access Contacts Module.
    Given launch browser
    Then user enters "<Username>" and "<Password>"
    And clicks on login button
    Then user is on HomePage
    Then clicks on Contacts
    And Contact Dropdown should display submodules
    And Close Browser



    Examples:
      | Username | Password |
      | will     | will     |