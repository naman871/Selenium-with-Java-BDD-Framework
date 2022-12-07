@issue:TC_019
@author-Ramyasri

Feature: Verify User is able to access save button

  Scenario Outline:Verify User is able to access save button
    Given launch browser
    Then user enters "<Username>" and "<Password>"
    And clicks on login button
    Then user is on HomePage
    When click on Contacts dropdown
    And  click on create contacts
    Then enter required details:Firstname as "Mithin" and Lastname as "Sam" on create contacts page
    And  click save
    And close Browser


    Examples:
      | Username | Password |
      | will     | will     |