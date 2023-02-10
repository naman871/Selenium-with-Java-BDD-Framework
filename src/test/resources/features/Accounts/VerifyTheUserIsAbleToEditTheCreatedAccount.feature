@TC_010
@author:MinalTule

Feature:Verify the user is able to edit the created account.

  Scenario Outline:Verify the user is able to edit the created account.
    Given launch browser
    Then user enters "<Username>" and "<Password>"
    And clicks on login button
    Then user is on HomePage
    And navigate to Account module
    And click on Create Account option from the dropdown list
    And enter mandatory field like name "Internet" and website "www.facebook.com" and billingAddress "Pune" and billingPostalCode "225678"
    And click on save button
    And click on Edit button
    Then after completion of editing click on save button and data edited successfully
    And  close Browser


    Examples:
      | Username | Password |
      | will     | will     |
