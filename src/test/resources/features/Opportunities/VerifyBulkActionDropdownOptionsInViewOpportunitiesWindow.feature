@issue:TC_049
@author:Ramya
Feature:opportunities Module
  @TC_49
  Scenario Outline: Verify Bulk Action dropdown options in View opportunities window
    Given launch browser
    When user enters "<Username>" and "<Password>"
    Then clicks on login button
    And User Navigate to "Opportunities" Module
    And Click on  View Opportunities option
    Then Select checkbox beside Bulk Action dropdown
    And Click on bulk Action dropdown
    Then User able to view Delete,Export,Merge,Mass updates options
    And  close Browser

    Examples:
      | Username | Password |
      | will     | will     |