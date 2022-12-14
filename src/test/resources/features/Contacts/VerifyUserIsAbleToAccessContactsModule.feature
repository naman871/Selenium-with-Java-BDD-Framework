@issue:TC_016
@author-Ramyasri

Feature: Verify user is able to access Contacts Module

  Scenario Outline:Verify user is able to access Contacts Module.
    Given launch browser
    Then user enters "<Username>" and "<Password>"
    And  clicks on login button
    When click on Contacts dropdown
    And  click on create contacts
    And contact Dropdown should display submodules
    And close Browser



    Examples:
      | Username | Password |
      | will     | will     |