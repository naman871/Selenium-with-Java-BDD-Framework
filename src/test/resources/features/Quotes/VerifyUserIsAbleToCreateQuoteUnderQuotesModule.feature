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
    And Enter the required Fields title as "will westin"
    And Click on Save
    And Quote with the given title name "will westin" should be created and displayed in new page
    And close Browser

    Examples:
      | Username | Password |
      | will     | will     |

#   Not working Iframe is constantly changing