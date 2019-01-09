package CucumberFramework.Steps;


import org.openqa.selenium.TakesScreenshot;

import CucumberFramework.Utils.DriverFactory;
import CucumberFramework.pageObjects.BasePage;
import cucumber.api.Scenario;
import cucumber.api.java.After;
import cucumber.api.java.Before;

public class MasterHooks extends DriverFactory {

	@Before
	public void setup() {
		driver = getDriver();
	}
	
	@After
	public void tearDownAndScreenshotOnFailure(Scenario scenario) {
		try {
			if (driver !=null && scenario.isFailed()) {
				scenario.embed(((TakesScreenshot) driver).getScreenshotAs(org.openqa.selenium.OutputType.BYTES), "image/png");
				BasePage.captureScreenshot();
				driver.manage().deleteAllCookies();
				driver.quit();
				driver = null;
			}
			
			if(driver != null) {
				driver.manage().deleteAllCookies();
				driver.quit();
				driver = null;
			}
		} catch (Exception e) {
			System.out.println("Methods failed: tearDownAndScreenshotOnFailure, Exception: " + e.getMessage());
		}
	}
}
