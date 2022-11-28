@issue:001
@author:
Feature: Login to Suite CRM Application

  @log15
  Scenario Outline: Login to Suite CRM Application using valid credentials
    Given launch browser
    Then user enters "<Username>" and "<Password>"
    And clicks on login button

    Examples:
      | Username | Password |
      | will     | will     |

  @author:Sunitha
  @TC001
  Scenario Outline: Verify user is able to view the labels displayed
    Given launch browser
    Then user enters "<Username>" and "<Password>"
    And  clicks on login button
    Then Validate Homepage DashBoard
    And  Close Browser
    Examples:
      | Username | Password |
      | will     | will     |

  @TC002
  Scenario Outline: Verify user is able to login with valid data
    Given launch browser
    Then user enters "<Username>" and "<Password>"
    And  clicks on login button
    Then Validate SuiteCRM DashBoard
    And  Close Browser

    Examples:
      | Username | Password |
      | will     | will     |


  @TC003
  Scenario Outline: Login to Suite CRM Application using Invalid credentials
    Given launch browser
    Then user enters "<Username>" and "<Password>"
    And clicks on login button
    Then user validates invalid error message
    And  Close Browser

    Examples:
      | Username | Password |
      | Will     | will123  |

  @TC004
  Scenario Outline: Login to Suite CRM Application without any credentials
    Given launch browser
    Then user enters "<Username>" and "<Password>"
    And clicks on login button
    Then Validate Missing Message
    And  Close Browser

    Examples:
      | Username | Password |
      |          |          |




