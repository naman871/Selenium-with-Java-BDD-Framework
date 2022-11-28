Feature: Account
  @TC_009
  @minal
  Scenario Outline:Verify user is able to create an account without filling required fields.
    Given launch browser
    Then user enters "<Username>" and "<Password>"
    And clicks on login button
    Then User is on HomePage
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
    Then User is on HomePage
    And Navigate to Account module
    And click on Create Account option from the dropdown list
    Then Fill all the required data
    And Click on save button
    And Click on Edit button
    Then After completion of editing click on save button



  Examples:
    | Username | Password |
    | will     | will     |
