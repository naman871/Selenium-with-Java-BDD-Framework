@TC_014
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
    Then click on delete button from action dropdown
    And click on proceed button when popup message displayed and record deleted successfully
    Then Close Browser

    Examples:
      | Username | Password |
      | will     | will     |