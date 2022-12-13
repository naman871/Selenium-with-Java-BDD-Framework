@TC_045
@author:Naman

Feature:Verify user is  able to create a duplicate of  the Opportunites
  @log121
  Scenario Outline:Verify user is  able to create a duplicate of  the Opportunites
    Given launch browser
    Then user enters "<Username>" and "<Password>"
    And clicks on login button
    Then user is on HomePage
    And click on view opportunities
    Then select opportunities from table
    And select duplicate from action dropdown
    Then enter a new account name " AB Drivers Limited " and amount "15000"
    And click on Save Button
    And click on view opportunities
    And click on filter
    Then enter filter criteria as opportunity name
    And close Browser

    #Todo add validation point




    Examples:
      | Username | Password |
      | will     | will     |