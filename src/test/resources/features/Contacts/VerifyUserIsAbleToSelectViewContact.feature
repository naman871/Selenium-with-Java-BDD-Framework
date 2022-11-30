@issue:
@author-Ramya
Feature: Verify Contact module dropdown

  @log3
  Scenario Outline:Verify Contact module dropdown
    Given launch browser
    Then user enters "<Username>" and "<Password>"
    And clicks on login button
    Then user is on HomePage
    Then clicks on Contacts
    And  User is able to select view contact


    Examples:
      | Username | Password |
      | will     | will     |