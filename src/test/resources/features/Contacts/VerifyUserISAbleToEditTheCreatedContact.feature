@TC_020
@author-Ramya
Feature: Verify User is able to access edit button

  Scenario Outline:Verify User is able to access edit button
    Given launch browser
    Then user enters "<Username>" and "<Password>"
    And clicks on login button
    Then user is on HomePage
    #Then clicks on Contacts
    When click on Contacts dropdown
    And  click on create contacts
    Then Enter required details on create contacts page
    And  click save
    Then User Clicks on Edit Button
    And Close Browser

    Examples:
      | Username | Password |
      | will     | will     |