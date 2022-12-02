@issue:TC_010
@author:MinalTule

Feature:Verify the user is able to edit the created account.

  Scenario Outline:Verify the user is able to edit the created account.
    Given launch browser
    Then user enters "<Username>" and "<Password>"
    And clicks on login button
    Then user is on HomePage
    And Navigate to Account module
    And click on Create Account option from the dropdown list
    Then Fill all the required data
    And Click on save button
    And Click on Edit button
    Then Close Browser
    Then After completion of editing click on save button and data edited successfully

    Examples:
      | Username | Password |
      | will     | will     |
