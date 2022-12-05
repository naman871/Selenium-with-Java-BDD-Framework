@TC_004
@author:Sunitha

Feature:Login to Suite CRM Application without any credentials

  Scenario Outline: Login to Suite CRM Application without any credentials
    Given launch browser
    Then user enters "<Username>" and "<Password>"
    And clicks on login button
    Then Validate Missing Message
    And  Close Browser

    Examples:
      | Username | Password |
      |          |          |