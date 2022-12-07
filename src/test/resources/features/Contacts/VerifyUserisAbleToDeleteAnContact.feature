@TC_024
@author:Sunitha
Feature:Delete Contact


  Scenario Outline:Verify User is able to Delete Contact
    Given launch browser
    Then user enters "<Username>" and "<Password>"
    And  clicks on login button
    When click on Contacts dropdown
    And  click on create contacts
    Then enter required details on create contacts page
    And  click save
    And  Click on "Actions" dropdown list
    Then Delete the contact
    And  close Browser


    Examples:
      | Username | Password |
      | will     | will     |