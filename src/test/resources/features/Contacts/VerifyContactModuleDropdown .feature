@issue:TC_015
@author:MinalTule

Feature:Verify Contact module dropdown

  Scenario Outline:Verify Contact module dropdown
    Given launch browser
    Then user enters "<Username>" and "<Password>"
    And clicks on login button
    Then user is on HomePage
    And Navigate to contact module
    And Contact Dropdown should display submodules

    Examples:
      | Username | Password |
      | will     | will     |
