@issue:001
@author:
Feature: Login to Suite CRM Application
@log10
  Scenario Outline: Login to Suite CRM Application using valid credentials
    Given launch browser
    Then user enters "<Username>" and "<Password>"
    And clicks on login button

    Examples:
    |Username|Password|
    |will    |will    |


