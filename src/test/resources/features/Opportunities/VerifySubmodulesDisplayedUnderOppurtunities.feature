@issue:
@author:Vindhyana
Feature: Verify opportunities module display submodules

  Scenario Outline: Verify submodules displayed under opportunities
    Given launch browser
    Then user enters "<Username>" and "<Password>"
    And clicks on login button
    Then user is on HomePage
    And user clicks on opportunities module
    Then user verify submodules are displayed under opportunities

    Examples:
      |Username|Password|
      |will    |will    |