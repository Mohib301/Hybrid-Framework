package stepDefinitions;

import java.io.IOException;
import core.BaseClass;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import pageObjects.SearchProductPageObjects;
import utilities.ScreenShotsUtility;

public class SearchProductStepDefinitions extends BaseClass {

	
	SearchProductPageObjects searchProductPageObjects = new SearchProductPageObjects();
	
	@Given("^Customer should Search field takes to the results page$")
	public void customer_should_Search_field_takes_to_the_results_page() {
	    // Write code here that turns the phrase above into concrete actions
		searchProductPageObjects.SearchInputKey();
		
	}

	@Then("^Customer should see Below the product's image display the quick look link$")
	public void customer_should_see_Below_the_product_s_image_display_the_quick_look_link() {
	    // Write code here that turns the phrase above into concrete actions
		
		try {
			
			ScreenShotsUtility.screenshot(driver);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

	@When("^Customer should Click the quick look link show the product overlay$")
	public void customer_should_Click_the_quick_look_link_show_the_product_overlay() {
	    // Write code here that turns the phrase above into concrete actions
		try {
			ScreenShotsUtility.screenshot(driver);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		searchProductPageObjects.ClickOnQuicklookLink();
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

	@Then("^Customer should have the same name and price as the product in the overlay$")
	public void customer_should_have_the_same_name_and_price_as_the_product_in_the_overlay() {
	    // Write code here that turns the phrase above into concrete actions
		
	try {
		Thread.sleep(getImplicitlyWait());
	} catch (InterruptedException e1) {
		// TODO Auto-generated catch block
		e1.printStackTrace();
	}
		
		try {
			ScreenShotsUtility.screenshot(driver);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
}
