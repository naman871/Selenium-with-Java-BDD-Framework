@TC_012
@author:MinalTule

Feature:Verify whether "New" button is working

  Scenario Outline:Verify whether "New" button is working

    Given launch browser
    Then user enters "<Username>" and "<Password>"
    And clicks on login button
    Then user is on HomePage
    And navigate to Account module
    And click on Create Account option from the dropdown list
    And enter mandatory field like name "Internet" and website "www.facebook.com" and billingAddress "Pune" and billingPostalCode "225678"
    And click on save button
    And click on "New" button
    Then create page should be displayed
    And close Browser
    Then enter mandatory fields like opportunity name "Ab Drivers Limited" sales stage "Prospecting" and amount "5000" date "2022-11-28" Account name "AB Drivers Limited"

    Examples:
      | Username | Password |
      | will     | will     |

