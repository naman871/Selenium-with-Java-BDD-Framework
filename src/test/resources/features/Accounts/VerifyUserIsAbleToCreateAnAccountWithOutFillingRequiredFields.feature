@TC_009
@author:MinalTule

Feature:Verify user is able to create an account without filling required fields.

  Scenario Outline:Verify user is able to create an account without filling required fields.
    Given launch browser
    Then user enters "<Username>" and "<Password>"
    And clicks on login button
    Then user is on HomePage
    And navigate to Account module
    And click on Create Account option from the dropdown list
    Then required fields are empty and click on Save Button
    And error message "There are validations error, unable to perform actions" should be displayed.


    Examples:
      | Username | Password |
      | will     | will     |