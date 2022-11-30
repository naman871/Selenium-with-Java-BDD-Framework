@issue:
@author-Ramya
Feature: Verify Contact module dropdown

  @log2
  Scenario Outline:Verify Contact module dropdown
    Given launch browser
    Then user enters "<Username>" and "<Password>"
    And clicks on login button
    Then User is on HomePage
    Then clicks on Contacts
    And  User is able to select create contact


    Examples:
      | Username | Password |
      | will     | will     |