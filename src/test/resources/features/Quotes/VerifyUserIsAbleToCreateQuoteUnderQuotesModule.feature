@issue:035
@author-Sukanya
Feature: Verify user is able to create quote under Quotes module

  Scenario Outline:Verify user is able to create quote under Quotes module
    Given launch browser
    When user enters "<Username>" and "<Password>"
    And clicks on login button
    Then user is on HomePage
    And click on Quotes module
    Then Click on Create Quotes option
    And Enter all the required fields
    And Click on Save
    And Quote with the given title name should be created and displayed in new page

    Examples:
      | Username | Password |
      | will     | will     |

#   Not working Iframe is constantly changing