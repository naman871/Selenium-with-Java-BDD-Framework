@issue:
@author:Vindhyana
Feature: Verify user is able to create a new opportunity under opportunities module
  @log11
  Scenario Outline: Verify user is able to create a new opportunity under opportunities module
    Given launch browser
    Then user enters "<Username>" and "<Password>"
    And clicks on login button
    Then user is on HomePage
    And clicks on create opportunity under opportunities dropdown
    Then enter mandatory fields like opportunity name "Ab Drivers Limited" sales stage "Prospecting"

    Examples:
      |Username|Password|
      |will    |will    |