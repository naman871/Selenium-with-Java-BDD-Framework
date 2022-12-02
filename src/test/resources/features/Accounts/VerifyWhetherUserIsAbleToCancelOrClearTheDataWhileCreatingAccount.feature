@issue:TC_011
@author:MinalTule

Feature:Verify whether user is able to cancel/clear the data while creating account

  Scenario Outline:Verify whether user is able to cancel/clear the data while creating account

    Given launch browser
    Then user enters "<Username>" and "<Password>"
    And clicks on login button
    Then user is on HomePage
    And Navigate to Account module
    And click on Create Account option from the dropdown list
    And Fill all the required data
    And click on cancel button
    And click on ok button on popup message
    Then account page should be displayed
    And Close Browser

    Examples:
      | Username | Password |
      | will     | will     |