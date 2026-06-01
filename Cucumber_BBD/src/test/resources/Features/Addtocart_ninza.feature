Feature: verify Add to cart working or not
Scenario: verify is user able to add to cart
Given login page open in default browser
When click on Account field and click on login section
And then enter valid email and password
And now click on login button
And Search any product and click button
And Search the product and add to cart
And Remove the product from cart
And logout
Then user logout successfully
