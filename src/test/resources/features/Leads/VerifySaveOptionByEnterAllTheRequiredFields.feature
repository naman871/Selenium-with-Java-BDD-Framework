@issue:TC_028
@author:Ramya

Feature:Lead Module
  @TC_028
  Scenario Outline: Verify Save option by Enter all the required fields
    Given launch browser
    When user enters "<Username>" and "<Password>"
    Then clicks on login button
    And User Navigate to "Leads" Module
    And click on create lead dropdown
    Then enter all the mandatory fields
    And click on save button
    Then user should be able to create new lead and new lead page will be displayed
    And close Browser

    Examples:
      | Username | Password |
      | will     | will     |


