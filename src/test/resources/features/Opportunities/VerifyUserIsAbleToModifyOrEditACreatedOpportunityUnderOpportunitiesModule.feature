@issue:TC_044
@author:Naman

Feature:Verify user is able to modify or edit a created opportunity under Opportunities module
  @log12
  Scenario Outline:Verify user is able to modify or edit a created opportunity under Opportunities module
    Given launch browser
    Then user enters "<Username>" and "<Password>"
    And clicks on login button
    Then user is on HomePage
    And click on view opportunities
    Then select opportunities from table
    And click on Edit button
    Then enter a new opportunity name "Daltons VVC - II" and amount "15000"
    And click on Save Button
    And Close Browser



    Examples:
      | Username | Password |
      | will     | will     |