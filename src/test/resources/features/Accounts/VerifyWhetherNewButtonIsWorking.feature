@TC_012
@author:MinalTule

Feature:Verify whether "New" button is working

  Scenario Outline:Verify whether "New" button is working

    Given launch browser
    Then user enters "<Username>" and "<Password>"
    And clicks on login button
    Then user is on HomePage
    And Navigate to Account module
    And click on Create Account option from the dropdown list
    And Fill all the required data
    And Click on save button
    And Click on "New" button
    Then create page should be displayed
    And close Browser

    Examples:
      | Username | Password |
      | will     | will     |

