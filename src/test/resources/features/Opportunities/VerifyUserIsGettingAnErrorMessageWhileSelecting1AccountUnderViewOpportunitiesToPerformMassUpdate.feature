@TC_050
@author:Ramya
Feature:opportunities Module
@TC_50
Scenario Outline: Verify User is getting an error message while selecting 1 account under View opportunities to perform Mass Update
Given launch browser
When user enters "<Username>" and "<Password>"
Then clicks on login button
And User Navigate to "Opportunities" Module
And Click on  View Opportunities option
Then Select one Checkbox (Record) under Opportunities Grid
And Click on bulk Action dropdown
Then Select Mass Update link
 And Close Browser

Examples:
| Username | Password |
| will     | will     |