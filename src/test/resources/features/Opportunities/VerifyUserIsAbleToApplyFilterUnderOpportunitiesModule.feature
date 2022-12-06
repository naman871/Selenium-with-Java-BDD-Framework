@issue:TC_048
@author:Naman

Feature:Verify user is able to apply filter under Opportunities module
@log60
  Scenario Outline:Verify user is able to apply filter under Opportunities module
    Given launch browser
    Then user enters "<Username>" and "<Password>"
    And clicks on login button
    Then user is on HomePage
    And click on view opportunities
    And click on filter
    Then enter filter criteria as opportunity name "AB drivers limited"
    And  Close Browser


    Examples:
      | Username | Password |
      | will     | will     |