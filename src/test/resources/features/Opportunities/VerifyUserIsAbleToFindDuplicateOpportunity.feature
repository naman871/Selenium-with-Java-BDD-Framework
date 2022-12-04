@issue:TC_047
@author:Naman

Feature:Verify user is able to find duplicate opportunity
@log50
  Scenario Outline:Verify user is able to find duplicate opportunity
    Given launch browser
    Then user enters "<Username>" and "<Password>"
    And clicks on login button
    Then user is on HomePage
    And click on view opportunities
    Then select opportunities from table
    And select find duplicates from action dropdown
    And Close Browser

    #Todo--- not working because of Iframe issue constantly changing

    Examples:
      | Username | Password |
      | will     | will     |

