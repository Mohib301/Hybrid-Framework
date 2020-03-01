Feature: Customer want to go to a product page and add the product to the cart
   

 @Regression_001
Scenario: Customer should be able to see this product added to cart on shopping cart page
Given Customer should mouse over to the product
When  Customer should click on favorite product
Then  Customer should click on QuickLook favorite item
Then  Customer should see Product page shows Add to cart button
When  Customer Click on Add to cart button, add to cart overlay appears
Then  Customer should see Checkout button is on the add to cart overlay
When  Customer Click on Checkout button then shopping cart page is shown
Then  Customer can see The product you added to cart should be on shopping cart page



