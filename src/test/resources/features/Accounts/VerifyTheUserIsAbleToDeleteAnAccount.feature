@TC_014
@author:MinalTule

Feature:Verify User is able to access "Actions" dropdown list

  Scenario Outline:Verify User is able to access "Actions" dropdown list
    Given launch browser
    Then user enters "<Username>" and "<Password>"
    And clicks on login button
    Then user is on HomePage
    And navigate to Account module
    And click on Create Account option from the dropdown list
    And enter mandatory field like name "Internet" and website "www.facebook.com" and billingAddress "Pune" and billingPostalCode "225678"
    And click on save button
    And click on "Actions" dropdown list
    Then close Browser

    Examples:
      | Username | Password |
      | will     | will     |