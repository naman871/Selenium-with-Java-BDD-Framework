@issue:TC_029
@author:Ramya

Feature:Lead Module

  @TC_029
  Scenario Outline: Verify Save option by missing all the required fields
    Given launch browser
    When user enters "<Username>" and "<Password>"
    Then clicks on login button
    And User Navigate to "Leads" Module
    And click on create lead dropdown
    And click on save button
    Then Validate Missing Required Fields Error Message
    And close Browser

    Examples:
      | Username | Password |
      | will     | will     |