package stepDefinitions;

import java.io.IOException;
import core.BaseClass;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import pageObjects.ProductPageObjects;
import utilities.ScreenShotsUtility;

public class ProductStepDefinitions extends BaseClass {
	
	ProductPageObjects productPageShows = new ProductPageObjects();
	
	@Given("^Customer should mouse over to the product$")
	public void customer_should_mouse_over_to_the_product(){
		// Write code here that turns the phrase above into concrete actions
		productPageShows.ClickOnCloseIconPopUpMessage();
		try {
			ScreenShotsUtility.screenshot(driver);
			productPageShows.MouseOverOnCooksTools();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

	@When("^Customer should click on favorite product$")
	public void customer_should_click_on_favorite_product() {
	    // Write code here that turns the phrase above into concrete actions
	   
		productPageShows.ClickOnSubCategory();
	}

	@Then("^Customer should click on QuickLook favorite item$")
	public void customer_should_click_on_QuickLook_favorite_link() {
	    // Write code here that turns the phrase above into concrete actions
		productPageShows.ClickOnQuicklookFavoriteItem();
	}

	@Then("^Customer should see Product page shows Add to cart button$")
	public void customer_should_see_Product_page_shows_Add_to_cart_button() {
	    // Write code here that turns the phrase above into concrete actions
		
		try {
			ScreenShotsUtility.screenshot(driver);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}

	@When("^Customer Click on Add to cart button, add to cart overlay appears$")
	public void customer_Click_on_Add_to_cart_button_add_to_cart_overlay_appears() {
	    // Write code here that turns the phrase above into concrete actions
		
		productPageShows.AddToCartButton();
		
		try {
			ScreenShotsUtility.screenshot(driver);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

	@Then("^Customer should see Checkout button is on the add to cart overlay$")
	public void customer_should_see_Checkout_button_is_on_the_add_to_cart_overlay()  {
	    // Write code here that turns the phrase above into concrete actions
		
		
		try {
			ScreenShotsUtility.screenshot(driver);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

	@When("^Customer Click on Checkout button then shopping cart page is shown$")
	public void customer_Click_on_Checkout_button_then_shopping_cart_page_is_shown() {
	    // Write code here that turns the phrase above into concrete actions
		productPageShows.ClickOnCheckOutButton();
		
	}

	@Then("^Customer can see The product you added to cart should be on shopping cart page$")
	public void customer_can_see_The_product_you_added_to_cart_should_be_on_shopping_cart_page() {
	    // Write code here that turns the phrase above into concrete actions
	    
		try {
			ScreenShotsUtility.screenshot(driver);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	

}
