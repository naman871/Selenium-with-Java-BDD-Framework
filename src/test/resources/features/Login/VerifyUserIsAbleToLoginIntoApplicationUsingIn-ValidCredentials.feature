@TC_003
@author:Sunitha

Feature:

  Scenario Outline: Login to Suite CRM Application using Invalid credentials
    Given launch browser
    Then user enters "<Username>" and "<Password>"
    And clicks on login button
    Then user validates invalid error message
    And  Close Browser

    Examples:
      | Username | Password |
      | Will     | will123  |