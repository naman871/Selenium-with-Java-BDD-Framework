@TC_027
@author:Madhuri

Feature: Verify user is able to enter details in lead module fields

  Scenario Outline:
    Given launch browser
    When user enters "<Username>" and "<Password>"
    And clicks on login button
    Then user is on HomePage
    And clicks on Leads
    And clicks on Create Leads Sub Module
    Then Enter all the mandatory Fields
    And  Close Browser
    Examples:
      | Username | Password |
      | will     | will     |