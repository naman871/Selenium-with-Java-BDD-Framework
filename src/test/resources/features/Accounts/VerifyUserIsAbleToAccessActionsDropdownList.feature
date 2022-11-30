@issue:TC_013
@author:MinalTule

Feature:Verify User is able to access "Actions" dropdown list

  Scenario Outline:Verify User is able to access "Actions" dropdown list
    Given launch browser
    Then user enters "<Username>" and "<Password>"
    And clicks on login button
    Then user is on HomePage
    And Navigate to Account module
    And click on Create Account option from the dropdown list
    And Fill all the required data
    And Click on save button
    And Click on "Actions" dropdown list
    Then Action dropdown list should be displayed


    Examples:
      | Username | Password |
      | will     | will     |