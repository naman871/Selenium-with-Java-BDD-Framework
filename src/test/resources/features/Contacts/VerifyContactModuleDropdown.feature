@issue:TC_015
@author-Ramya
Feature: Verify Contact module dropdown


  Scenario Outline:Verify Contact module dropdown
    Given launch browser
    Then user enters "<Username>" and "<Password>"
    And clicks on login button
    Then user is on HomePage
    Then clicks on Contacts


    Examples:
      | Username | Password |
      | will     | will     |