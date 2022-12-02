@TC_043
@issue:TC_043
@author:Vindhyana
@author:Naman
Feature: Verify user is able to create a new opportunity under opportunities module
  @log11
  Scenario Outline: Verify user is able to create a new opportunity under opportunities module
    Given launch browser
    Then user enters "<Username>" and "<Password>"
    And clicks on login button
    Then user is on HomePage
    And clicks on create opportunity under opportunities dropdown
    #Then enter mandatory fields like opportunity name "Ab Drivers Limited" sales stage "Prospecting"
    And Close Browser
    Then enter mandatory fields like opportunity name "Ab Drivers Limited" sales stage "Prospecting" and amount "5000" date "2022-11-28" Account name "AB Drivers Limited"
    And Close Browser


    Examples:
      |Username|Password|
      |will    |will    |

