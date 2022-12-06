@issue:TC_028
@author:Ramya

Feature:Lead Module
  @TC_028
  Scenario Outline: Verify Save option by Enter all the required fields
    Given launch browser
    When user enters "<Username>" and "<Password>"
    Then clicks on login button
    And User Navigate to "Leads" Module
    And Click on Create Lead Dropdown
    Then Enter all the mandatory Fields
    And Click on save button
    Then User should be able to create new Lead and new Lead page will be displayed

    Examples:
      | Username | Password |
      | will     | will     |


