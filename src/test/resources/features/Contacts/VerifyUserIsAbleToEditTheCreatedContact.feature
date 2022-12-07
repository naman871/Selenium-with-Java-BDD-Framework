@issue:TC_020
@author-Ramyasri

Feature: Verify User is able to access edit button

  Scenario Outline:Verify User is able to access edit button
    Given launch browser
    Then user enters "<Username>" and "<Password>"
    And  clicks on login button
    When click on Contacts dropdown
    And  click on create contacts
    Then Enter required details on create contacts page
    And  click save
    Then User Clicks on Edit Button
    And Close Browser

    Examples:
      | Username | Password |
      | will     | will     |