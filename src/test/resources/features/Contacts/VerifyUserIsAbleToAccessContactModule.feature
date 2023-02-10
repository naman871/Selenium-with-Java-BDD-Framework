@TC_015
@author:MinalTule
@minal
Feature:Verify Contact module dropdown

  Scenario Outline:Verify User Is Able To Access Contact module
    Given launch browser
    Then user enters "<Username>" and "<Password>"
    And clicks on login button
    Then user is on HomePage
    And navigate to contact module
    And contact Dropdown should display submodules
    Then clicks on Contacts
    And  close Browser

    Examples:
      | Username | Password |
      | will     | will     |