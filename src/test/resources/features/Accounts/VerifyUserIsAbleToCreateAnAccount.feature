@TC_008
@author:Sunitha

Feature:Verify user is able to create an account.

  Scenario Outline: Verify user is able to create an account.
    Given launch browser
    Then user enters "<Username>" and "<Password>"
    And  clicks on login button
    When click on Account dropdown
    And  click on create account
    Then Enter required details name as "Ganga"
    And  click save
    And  Validate saved account
    And  close Browser

    Examples:
      | Username | Password |
      | will     | will     |
