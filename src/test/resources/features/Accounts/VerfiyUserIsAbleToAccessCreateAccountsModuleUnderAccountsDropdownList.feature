@TC_006
@author:Sunitha

Feature:Verify user is able to access create Accounts

  Scenario Outline: Verify user is able to access create Accounts
    Given launch browser
    Then user enters "<Username>" and "<Password>"
    And  clicks on login button
    When click on Account dropdown
    And  click on create account
    Then validate create account page
    And  Close Browser

    Examples:
      | Username | Password |
      | will     | will     |
