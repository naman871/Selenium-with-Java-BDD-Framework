@issue:@TC_052
@author:MinalTule

Feature:Verify Contact module dropdown

  Scenario Outline:Verify Contact module dropdown
    Given launch browser
    Then user enters "<Username>" and "<Password>"
    And  clicks on login button
    When click on Contacts dropdown
    And contact Dropdown should display submodules

    Examples:
      | Username | Password |
      | will     | will     |
