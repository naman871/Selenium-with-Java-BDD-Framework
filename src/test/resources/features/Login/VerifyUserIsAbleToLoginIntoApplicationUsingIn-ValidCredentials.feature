@TC_003
@author:Sunitha

Feature:Login Page

  Scenario Outline: Login to Suite CRM Application using Invalid credentials
    Given launch browser
    Then user enters "<Username>" and "<Password>"
    And clicks on login button
    Then user validates invalid error message
    And  close Browser

    Examples:
      | Username | Password |
      | Will     | will123  |