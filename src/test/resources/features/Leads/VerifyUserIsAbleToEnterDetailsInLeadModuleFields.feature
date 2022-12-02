@issue:TC_027
@author:Madhuri

Feature: Verify user is able to enter details in lead module fields

  Scenario Outline:
    Given launch browser
    Then user enters "<Username>" and "<Password>"
    And clicks on login button
    And clicks on create lead under leads dropdown
    Then Enter required details
    Then enter mandatory fields like lead name "Suite"  and mobile number "9956829045"  Account name "SuiteCRM"
    And  Close Browser
    Examples:
      | Username | Password |
      | will     | will     |