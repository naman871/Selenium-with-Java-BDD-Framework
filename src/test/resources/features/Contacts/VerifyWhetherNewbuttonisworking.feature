@TC_022
@author:Sunitha

Feature:Verify whether "New" button is working.

  Scenario Outline:Verify whether "New" button is working
    Given launch browser
    Then user enters "<Username>" and "<Password>"
    And  clicks on login button
    When click on Contacts dropdown
    And  click on create contacts
    Then enter required details on create contacts page
    Then enter required details:Firstname as "Mithin" and Lastname as "Sam" on create contacts page
    And  click save
    Then delete the account
    And  click on New Button
    Then Validate create page
    And  close Browser

    Examples:
      | Username | Password |
      | will     | will     |
