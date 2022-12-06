@issue:TC_046
@author:Naman

Feature:Verify user is able to delete the opportunity record
  @log30
  Scenario Outline:Verify user is able to delete the opportunity record
    Given launch browser
    Then user enters "<Username>" and "<Password>"
    And clicks on login button
    Then user is on HomePage
    And click on view opportunities
    Then select opportunities from table
    And select delete from action dropdown
    And Close Browser

    Examples:
      | Username | Password |
      | will     | will     |
