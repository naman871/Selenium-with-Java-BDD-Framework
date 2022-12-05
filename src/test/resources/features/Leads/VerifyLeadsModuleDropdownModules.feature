@TC_025
@author:Madhuri

Feature:Leads Module

  Scenario Outline: Verify Leads module dropdown
    Given launch browser
    Then user enters "<Username>" and "<Password>"
    And clicks on login button
    When click on Leads dropdown
    Then verify Leads dropdown option
    And  Close Browser

    Examples:
      | Username | Password |
      | will     | will     |