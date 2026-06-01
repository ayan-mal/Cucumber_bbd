Feature: verify tutorial ninza website
@Smoke
Scenario: Verify Register Login Wishlist Cart Remove and Logout
Given user open TutorialsNinja website
When user register new account
And user login with valid credentials
And user search product 
And user add product to add to cart
And user remove product from cart
And logout from the page
Then Tutorial ninza working properly