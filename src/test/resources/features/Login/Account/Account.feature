Feature:Account Module
@TC005
Scenario Outline: Verify Account module dropdown
Given launch browser
Then user enters "<Username>" and "<Password>"
And clicks on login button
When click on Account dropdown
Then verify Account dropdown option
And  Close Browser

Examples:
|Username|Password|
|will    |will   |

@TC006
Scenario Outline: Verify user is able to access create Accounts
Given launch browser
Then user enters "<Username>" and "<Password>"
And  clicks on login button
When click on Account dropdown
And  click on create account
Then validate create account page
And  Close Browser

Examples:
|Username|Password|
|will    |will   |



@TC007
Scenario Outline: Verify user is able to access view Accounts
Given launch browser
Then user enters "<Username>" and "<Password>"
And  clicks on login button
When click on Account dropdown
And  click on view account
Then validate view account page
And  Close Browser

Examples:
|Username|Password|
|will    |will   |


@TC008
Scenario Outline: Verify user is able to create an account.
Given launch browser
Then user enters "<Username>" and "<Password>"
And  clicks on login button
When click on Account dropdown
And  click on create account
Then Enter required details
And  click save
And  Validate saved account
Then Delete the account
And  Close Browser

Examples:
|Username|Password|
|will    |will   |
