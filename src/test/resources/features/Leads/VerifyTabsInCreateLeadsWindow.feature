@issue:TC_033
@author-Sukanya
@Leads
Feature:Verify the tabs "Overview", "More Information", "Other" in Create Leads window

  Scenario Outline:Verify the tabs "Overview", "More Information", "Other" in Create Leads window
    Given launch browser
    When user enters "<Username>" and "<Password>"
    And clicks on login button
    Then user is on HomePage
    And User Navigate to "Leads" Module
    And click on create lead dropdown
    #And clicks on Leads
    #Then clicks on Create Leads Sub Module
    And user should be able to view tabs Overview,More Information,Other in Create Leads window
    And close Browser


    Examples:
      | Username | Password |
      | will     | will     |