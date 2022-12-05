@author-Sukanya
@issue:TC_030

Feature: Verify Cancel option on LEADS Create Page

  Scenario Outline:Verify Cancel option on LEADS Create Page
    Given launch browser
    When user enters "<Username>" and "<Password>"
    And clicks on login button
    Then user is on HomePage
    And clicks on Leads
    And clicks on Create Leads Sub Module
    Then Enter all the mandatory Fields
    And click on Cancel Button
    And user should able to view the warning message

    Examples:
      | Username | Password |
      | will     | will     |