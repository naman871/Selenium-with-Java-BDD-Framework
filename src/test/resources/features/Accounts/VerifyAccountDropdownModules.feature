@TC_005
@author:Sunitha

Feature:Account Module

  Scenario Outline: Verify Account module dropdown
    Given launch browser
    Then user enters "<Username>" and "<Password>"
    And clicks on login button
    When click on Account dropdown
    Then verify Account dropdown option
    And  Close Browser

    Examples:
      | Username | Password |
      | will     | will     |