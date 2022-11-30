Feature: Account
  @TC_009Minal
  Scenario Outline:Verify user is able to create an account without filling required fields.
    Given launch browser
    Then user enters "<Username>" and "<Password>"
    And clicks on login button
    Then user is on HomePage
    And Navigate to Account module
    And click on Create Account option from the dropdown list
    Then required fields are empty and click on Save Button
    And Error message "There are validations error, unable to perform actions" should be displayed.

    Examples:
      | Username | Password |
      | will     | will     |


@TC_010Minal
  Scenario Outline:Verify the user is able to edit the created account.
  Given launch browser
    Then user enters "<Username>" and "<Password>"
    And clicks on login button
    Then user is on HomePage
    And Navigate to Account module
    And click on Create Account option from the dropdown list
    Then Fill all the required data
    And Click on save button
    And Click on Edit button
    #Then After completion of editing click on save button

  Examples:
    | Username | Password |
    | will     | will     |

  @TC_011Minal
  Scenario Outline:Verify whether user is able to cancel/clear the data while creating account

    Given launch browser
    Then user enters "<Username>" and "<Password>"
    And clicks on login button
    Then user is on HomePage
    And Navigate to Account module
    And click on Create Account option from the dropdown list
    And Fill all the required data
    And click on cancel button
    And click on ok button on popup message
    Then account page should be displayed

    Examples:
      | Username | Password |
      | will     | will     |

  @TC_012Minal
  Scenario Outline:Verify whether "New" button is working

    Given launch browser
    Then user enters "<Username>" and "<Password>"
    And clicks on login button
    Then user is on HomePage
    And Navigate to Account module
    And click on Create Account option from the dropdown list
    And Fill all the required data
    And Click on save button
    And Click on "New" button
    Then create page should be displayed

    Examples:
      | Username | Password |
      | will     | will     |

  @TC_013Minal
  Scenario Outline:Verify User is able to access "Actions" dropdown list
    Given launch browser
    Then user enters "<Username>" and "<Password>"
    And clicks on login button
    Then user is on HomePage
    And Navigate to Account module
    And click on Create Account option from the dropdown list
    And Fill all the required data
    And Click on save button
    And Click on "Actions" dropdown list
    Then Action dropdown list should be displayed


    Examples:
      | Username | Password |
      | will     | will     |

  @TC_014Minal
  Scenario Outline:Verify User is able to access "Actions" dropdown list
    Given launch browser
    Then user enters "<Username>" and "<Password>"
    And clicks on login button
    Then user is on HomePage
    And Navigate to Account module
    And click on Create Account option from the dropdown list
    And Fill all the required data
    And Click on save button
    And Click on "Actions" dropdown list
    Then click on delete button from action dropdown
    And click on proceed button when popup message displayed and record deleted successfully

    Examples:
      | Username | Password |
      | will     | will     |


