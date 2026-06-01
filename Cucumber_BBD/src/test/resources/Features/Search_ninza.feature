Feature: verify search
Scenario: verify user is able to search product
Given login page open in default browser
When click on Account field and click on login section
And then enter valid email and password
And now click on login button
And Search any product and click button
Then Search product will appear