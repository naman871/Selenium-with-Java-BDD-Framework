@issue:TC_026
@author:Madhuri

Feature: Verify user is able to navigate leads create page

  Scenario Outline: Verify user is able to navigate leads create page
    Given launch browser
    Then user enters "<Username>" and "<Password>"
    And clicks on login button
    When click on Leads dropdown
    And clicks on Create Leads Sub Module
    #And clicks on create lead under leads dropdown
    Then validate create lead page
    And  Close Browser
    Examples:
      | Username | Password |
      | will     | will     |