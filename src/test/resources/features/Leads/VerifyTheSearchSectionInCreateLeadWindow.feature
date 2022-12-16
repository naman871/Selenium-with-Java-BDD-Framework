@issue:TC_034
@author-Sukanya
@Leads
Feature:Verify the Search section, in Create Lead window

Scenario Outline:Verify the Search section, in Create Lead window
  Given launch browser
  When user enters "<Username>" and "<Password>"
  And clicks on login button
 # When user is on HomePage
  And User Navigate to "Leads" Module
  And click on create lead dropdown
  #And clicks on Leads
  #Then clicks on Create Leads Sub Module
  And user should be able to view Search section in Create Lead window
  And close Browser
Examples:
| Username | Password |
| will     | will     |