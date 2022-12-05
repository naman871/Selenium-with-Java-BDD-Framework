@issue:
@author-Sukanya
Feature: Verify lead modules
  @log
  Scenario Outline:Verify Lead module
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


  Scenario Outline:Verify Cancel option on LEADS Create Page Cancel Popupwindow
    Given launch browser
    When user enters "<Username>" and "<Password>"
    And clicks on login button
    Then user is on HomePage
    And clicks on Leads
    And clicks on Create Leads Sub Module
    Then Enter all the mandatory Fields
    And click on Cancel Button
    And Click on Cancel Button on cancel popup window
    Examples:
      | Username | Password |
      | will     | will     |

  Scenario Outline:Verify Cancel option on LEADS Create Page Ok Popupwindow
    Given launch browser
    When user enters "<Username>" and "<Password>"
    And clicks on login button
    Then user is on HomePage
    And clicks on Leads
    And clicks on Create Leads Sub Module
    Then Enter all the mandatory Fields
    And click on Cancel Button
    And Click on Cancel Button on Ok popup window
    Examples:
      | Username | Password |
      | will     | will     |


  Scenario Outline:Verify the tabs "Overview", "More Information", "Other" in Create Leads window
    Given launch browser
    When user enters "<Username>" and "<Password>"
    And clicks on login button
    Then user is on HomePage
    And clicks on Leads
    And clicks on Create Leads Sub Module
    And User should be able to view tabs "Overview","More Information","Other" in Create Leads window
    Examples:
      | Username | Password |
      | will     | will     |


  Scenario Outline:Verify the Search section, in Create Lead window
    Given launch browser
    When user enters "<Username>" and "<Password>"
    And clicks on login button
    Then user is on HomePage
    And clicks on Leads
    And clicks on Create Leads Sub Module
    And User should be able to view Search section in Create Lead window
    Examples:
      | Username | Password |
      | will     | will     |


