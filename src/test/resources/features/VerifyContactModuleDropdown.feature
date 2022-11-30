@issue:
@author-Ramya
Feature: Verify Contact module dropdown

  @log1
  Scenario Outline:Verify Contact module dropdown
    Given launch browser
    Then user enters "<Username>" and "<Password>"
    And clicks on login button
    Then User is on HomePage
    Then clicks on Contacts


    Examples:
      | Username | Password |
      | will     | will     |