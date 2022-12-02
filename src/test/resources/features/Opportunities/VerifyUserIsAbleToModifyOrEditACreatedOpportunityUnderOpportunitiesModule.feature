@TC_044
@author:Naman

Feature:Verify user is able to modify /edit a created opportunity under Opportunities module
@log12
  Scenario Outline:Verify user is able to modify /edit a created opportunity under Opportunities module
    Given launch browser
    Then user enters "<Username>" and "<Password>"
    And clicks on login button
    Then user is on HomePage
    And clicks on recently viewed items under opportunities dropdown

    Examples:
      | Username | Password |
      | will     | will     |