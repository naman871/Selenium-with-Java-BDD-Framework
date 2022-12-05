@issue:TC_031
@author-Sukanya
Feature: Verify Cancel option on LEADS Create Page Cancel Popupwindow

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