Feature: Verify functionality of Login

Scenario Outline: Verify login_page

Given login page should be open in default_browser
When click on username field and add valid_user <username1>
And click on password button and enter valid <password1>
And click on submit_button <Status>
Then login successful and redirect to home

Examples:
|username1|password1|Status|
|username|password|success|
|jefggf988765|password|fail|
|username|bs75|fail|
|bvfhjwge32|kj989674|fail|
