@issue:
@author:MinalTule
@TC_015Minal
Feature:Verify Contact module dropdown

  Scenario Outline:Verify Contact module dropdown
    Given launch browser
    Then user enters "<Username>" and "<Password>"
    And clicks on login button
    Then user is on HomePage
    And Navigate to contact module
    And Contact Dropdown should display submodules
    Then Close Browser

    Examples:
      | Username | Password |
      | will     | will     |
