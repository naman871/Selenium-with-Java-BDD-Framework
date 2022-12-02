@TC_002
@author:Sunitha

Feature:Verify user is able to login with valid data

  Scenario Outline: Verify user is able to login with valid data
    Given launch browser
    Then user enters "<Username>" and "<Password>"
    And  clicks on login button
    Then Validate SuiteCRM DashBoard
    And  Close Browser

    Examples:
      | Username | Password |
      | will     | will     |