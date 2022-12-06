@issue:TC_021
@author-Ramya

Feature: Verify User is able to access cancel button

  Scenario Outline:Verify User is able to access cancel button
    Given launch browser
    Then user enters "<Username>" and "<Password>"
    And  clicks on login button
    When click on Contacts dropdown
    And  click on create contacts
    Then user clicks on cancel button
    And  Close Browser


    Examples:
      | Username | Password |
      | will     | will     |