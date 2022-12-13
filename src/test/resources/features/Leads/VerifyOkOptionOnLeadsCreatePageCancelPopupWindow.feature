@issue:TC_032
@author-Sukanya

Feature: Verify Ok option on LEADS Create Page Cancel Popupwindow

  Scenario Outline:Verify Ok option on LEADS Create Page Cancel Popupwindow
    Given launch browser
    When user enters "<Username>" and "<Password>"
    And clicks on login button
    Then user is on HomePage
    And clicks on Leads
    And clicks on Create Leads Sub Module
    Then enter mandatory fields like lead name "Suite"  and mobile number "9956829045"  account name "SuiteCRM"
    And click on Cancel Button
    And click on Ok Button on cancel popup window
    Then user should be navigated to LEADS Create Page
    And close Browser
  Examples:
  | Username | Password |
  | will     | will     |
