package pageObjects;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import core.BaseClass;

public class SearchProductPageObjects extends BaseClass {
	
	public SearchProductPageObjects() {
		PageFactory.initElements(driver, this);
	}

	
	
	@FindBy(how = How.XPATH, using = "//input[@id='search-field']")
	private WebElement searchInputKey;
	
	
	@FindBy(how = How.XPATH, using = "//a[@href='https://www.williams-sonoma.com/products/"
			+ "le-creuset-signature-fry-pan/?pkey=s%7Cfry%20pan%7C333']/span")
	private WebElement clickOnQuicklookLink;
	
	
	
	public void SearchInputKey() {
		searchInputKey.sendKeys("fry pan");
		searchInputKey.sendKeys(Keys.ENTER);
	}
	
	public void ClickOnQuicklookLink() {
		clickOnQuicklookLink.click();
	}
	
    }






