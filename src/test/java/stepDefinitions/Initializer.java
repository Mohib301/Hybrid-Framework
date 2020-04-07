package stepDefinitions;

import java.util.concurrent.TimeUnit;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import core.BaseClass;
import cucumber.api.java.After;
import cucumber.api.java.Before;
import io.github.bonigarcia.wdm.WebDriverManager;


public class Initializer extends BaseClass {
	// This method will run before each scenario
	@Before
	public void beforeHooks() {

		if (BaseClass.browserName().equals("chrome")) {
			WebDriverManager.chromedriver().setup();
			driver = new ChromeDriver();
		} else if (BaseClass.browserName().equals("FF")) {
			WebDriverManager.firefoxdriver().setup();
			driver = new FirefoxDriver();

		} else if (BaseClass.browserName().equals("IE")) {
			WebDriverManager.iedriver().setup();
			driver = new InternetExplorerDriver();
		}

		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().pageLoadTimeout(getPageLoadTimeOut(), TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(getImplicitlyWait(), TimeUnit.SECONDS);
		driver.get(getURL());
	}

	// This method will run after each scenario
	@After
	public void afterHooks() {
		
		// If I want to close the browser then using by .close().
		// IF  I want to close all opened browser using by .quite() it all happening after Hooks mehthod.
		
//		driver.close();
//		driver.quit();

	}
   
   }

