$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("Features/SearchProduct.feature");
formatter.feature({
  "line": 1,
  "name": "Customer want to search for a product and open it\u0027s quick look overlay",
  "description": "",
  "id": "customer-want-to-search-for-a-product-and-open-it\u0027s-quick-look-overlay",
  "keyword": "Feature"
});
formatter.before({
  "duration": 27566268800,
  "status": "passed"
});
formatter.scenario({
  "line": 5,
  "name": "Customer should be able to see the exact same clicked product on the quick look overlay",
  "description": "",
  "id": "customer-want-to-search-for-a-product-and-open-it\u0027s-quick-look-overlay;customer-should-be-able-to-see-the-exact-same-clicked-product-on-the-quick-look-overlay",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 4,
      "name": "@Regression_002"
    }
  ]
});
formatter.step({
  "line": 7,
  "name": "Customer should Search field takes to the results page",
  "keyword": "Given "
});
formatter.step({
  "line": 8,
  "name": "Customer should see Below the product\u0027s image display the quick look link",
  "keyword": "Then "
});
formatter.step({
  "line": 9,
  "name": "Customer should Click the quick look link show the product overlay",
  "keyword": "When "
});
formatter.step({
  "line": 10,
  "name": "Customer should have the same name and price as the product in the overlay",
  "keyword": "Then "
});
formatter.match({
  "location": "SearchProductStepDefinitions.customer_should_Search_field_takes_to_the_results_page()"
});
formatter.result({
  "duration": 7218158000,
  "status": "passed"
});
formatter.match({
  "location": "SearchProductStepDefinitions.customer_should_see_Below_the_product_s_image_display_the_quick_look_link()"
});
formatter.result({
  "duration": 2909170000,
  "status": "passed"
});
formatter.match({
  "location": "SearchProductStepDefinitions.customer_should_Click_the_quick_look_link_show_the_product_overlay()"
});
formatter.result({
  "duration": 7344175300,
  "status": "passed"
});
formatter.match({
  "location": "SearchProductStepDefinitions.customer_should_have_the_same_name_and_price_as_the_product_in_the_overlay()"
});
formatter.result({
  "duration": 526894600,
  "status": "passed"
});
formatter.after({
  "duration": 30500,
  "status": "passed"
});
});