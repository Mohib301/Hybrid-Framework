Feature: Customer want to search for a product and open it's quick look overlay


@Regression_002
Scenario: Customer should be able to see the exact same clicked product on the quick look overlay

Given Customer should Search field takes to the results page
Then  Customer should see Below the product's image display the quick look link
When  Customer should Click the quick look link show the product overlay
Then  Customer should have the same name and price as the product in the overlay
