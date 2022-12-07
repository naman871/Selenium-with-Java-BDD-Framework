@TC_015
@author:MinalTule

Feature:Verify Contact module dropdown
@issue:TC_016
@author-Ramya

#  Scenario Outline:Verify Contact module dropdown


  Scenario Outline:Verify User Is Able To Access Contact module
    Given launch browser
    Then user enters "<Username>" and "<Password>"
    And clicks on login button
    Then user is on HomePage
    And Navigate to contact module
    And Contact Dropdown should display submodules
    Then close Browser


    Examples:
      | Username | Password |
      | will     | will     |
