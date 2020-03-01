package pageObjects;


import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import core.BaseClass;

public class ProductPageObjects extends BaseClass {
	
	public ProductPageObjects() {
		PageFactory.initElements(driver, this);

	}

	// @FindBy this annotation is part of PageFactory class which helps us to initialize the element
	 
	@FindBy(how = How.XPATH, using = "//button[@id='closeIcon']")
	private WebElement clickOnCloseIconPopUpMessage;
	
	@FindBy(how = How.XPATH, using = "//a[@href='https://www.williams-sonoma.com/shop/cooks-tools/?cm_type=gnav']")
	private WebElement mouseOverOnCooksTools;

	@FindBy(how = How.XPATH, using = "//a[@href=\"https://www.williams-sonoma.com/shop/cooks-tools/slotted-spoons-sets/?cm_type=gnav\"]")
	private WebElement clickOnSubCategory;

	@FindBy(how = How.XPATH, using = "//a[@href=\"https://www.williams-sonoma.com/products/"
			+ "williams-sonoma-flex-core-spoonula-navy/?pkey=cslotted-spoons-sets&isx=0.0\"]"
			+ "/span[@class='quicklook-link']")
	private WebElement clickOnQuicklookFavoriteItem;
	@FindBy(how = How.ID, using = "//button[@id='primaryGroup_addToCart_0']")
	private WebElement addToCartButton;
	
	@FindBy(how = How.ID, using = "//a[@id='anchor-btn-checkout']")
	private WebElement clickOnCheckOutButton;

	
	public void ClickOnCloseIconPopUpMessage() {
		
		clickOnCloseIconPopUpMessage.click();
		driver.switchTo().alert().accept();
	}
	
	public void MouseOverOnCooksTools() {
		Actions action= new Actions(driver);

		action.moveToElement(mouseOverOnCooksTools).build().perform();
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	
	public void ClickOnSubCategory() {
		
		WebDriverWait wait = new WebDriverWait(driver, 20);
		wait.until(ExpectedConditions.visibilityOf(clickOnSubCategory)); 
		wait.until(ExpectedConditions.elementToBeClickable(clickOnSubCategory));
		clickOnSubCategory.click();
	}
	
	public void ClickOnQuicklookFavoriteItem() {
		clickOnQuicklookFavoriteItem.click();
	}
	
	public void AddToCartButton() {
		addToCartButton.click();
	}
	
	public void ClickOnCheckOutButton() {
		clickOnCheckOutButton.sendKeys(Keys.ENTER);;
	}
	
	
   }
