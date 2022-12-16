@issue:TC_026
@author:Madhuri
@Leads
Feature: Verify user is able to navigate leads create page

  Scenario Outline: Verify user is able to navigate leads create page
    Given launch browser
    Then user enters "<Username>" and "<Password>"
    And clicks on login button
    And User Navigate to "Leads" Module
    And click on create lead dropdown
    Then validate create lead page
    And  close Browser
    Examples:
      | Username | Password |
      | will     | will     |