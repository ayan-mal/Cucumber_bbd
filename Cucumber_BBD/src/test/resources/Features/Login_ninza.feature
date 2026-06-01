Feature: verify Login is working or not
Scenario: verify user is able to login or not
Given login page open in default browser
When click on Account field and click on login section
And then enter valid email and password
And now click on login button
Then login successfully done