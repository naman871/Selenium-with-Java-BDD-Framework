@issue:TC_022
@author:Sunitha

Feature:Verify whether "New" button is working.

  Scenario Outline:Verify whether "New" button is working
    Given launch browser
    Then user enters "<Username>" and "<Password>"
    And  clicks on login button
    When click on Contacts dropdown
    And  click on create contacts
    Then Enter required details on create contacts page
    And  click save
    Then Delete the account
    And  Click on New Button
    Then Validate create page
    And  Close Browser

    Examples:
      | Username | Password |
      | will     | will     |
