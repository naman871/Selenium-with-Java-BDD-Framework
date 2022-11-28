@issue:TC_007
@author:Sunitha

Feature:Verify user is able to create an account.

  Scenario Outline: Verify user is able to create an account.
    Given launch browser
    Then user enters "<Username>" and "<Password>"
    And  clicks on login button
    When click on Account dropdown
    And  click on create account
    Then Enter required details
    And  click save
    And  Validate saved account
    Then Delete the account
    And  Close Browser

    Examples:
      | Username | Password |
      | will     | will     |
