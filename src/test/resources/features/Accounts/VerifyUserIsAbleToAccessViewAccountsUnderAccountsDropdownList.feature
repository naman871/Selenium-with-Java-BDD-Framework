@TC_007
@author:Sunitha

Feature:Verify user is able to access view Accounts

  Scenario Outline: Verify user is able to access view Accounts
    Given launch browser
    Then user enters "<Username>" and "<Password>"
    And  clicks on login button
    When click on Account dropdown
    And  click on view account
    Then validate view account page
    And  Close Browser

    Examples:
      | Username | Password |
      | will     | will     |
