@TC_027
@author:Madhuri
@Leads
Feature: Verify user is able to enter details in lead module fields

  Scenario Outline:
    Given launch browser
    When user enters "<Username>" and "<Password>"
    And clicks on login button
    And User Navigate to "Leads" Module
    And click on create lead dropdown
    Then enter mandatory fields like lead name "Suite"  and mobile number "9956829045"  account name "SuiteCRM"
    And  close Browser
    Examples:
      | Username | Password |
      | will     | will     |