@issue:
@author:MinalTule

Feature:Verify Contact module dropdown

  Scenario Outline:Verify Contact module dropdown
    Given launch browser
    Then user enters "<Username>" and "<Password>"
    And clicks on login button
    Then user is on HomePage
    And navigate to contact module
    And contact Dropdown should display submodules

    Examples:
      | Username | Password |
      | will     | will     |
