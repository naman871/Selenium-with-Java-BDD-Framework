@issue:
@author-Naman
Feature: Verify opportunity dropdown modules

  @log10
  Scenario Outline:Verify opportunity dropdown modules
    Given launch browser
    Then user enters "<Username>" and "<Password>"
    And clicks on login button
    Then User is on HomePage
    Then clicks on Opportunities


    Examples:
      | Username | Password |
      | will     | will     |






