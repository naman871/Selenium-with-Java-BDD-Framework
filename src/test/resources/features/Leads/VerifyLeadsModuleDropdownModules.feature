@TC_025
@author:Madhuri
@Leads
Feature:Leads Module

  Scenario Outline: Verify Leads module dropdown
    Given launch browser
    Then user enters "<Username>" and "<Password>"
    And clicks on login button
    And User Navigate to "Leads" Module
    When click on Leads dropdown
    Then verify Leads dropdown option
    And  close Browser

    Examples:
      | Username | Password |
      | will     | will     |