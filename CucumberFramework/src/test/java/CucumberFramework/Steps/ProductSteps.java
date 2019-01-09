package CucumberFramework.Steps;

import java.io.IOException;

import org.openqa.selenium.By;

import CucumberFramework.Utils.DriverFactory;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class ProductSteps extends DriverFactory {
	
	@Given("^User naviagates \"([^\"]*)\" website$")
	public void user_naviagates_website(String url) throws InterruptedException {
		getDriver().get(url);

	}

	@When("^User click on the product \"([^\"]*)\"$")
	public void user_click_on_the_products(String locator) throws InterruptedException {
        Thread.sleep(3000);
		System.out.println(locator);
		getDriver().findElement(By.cssSelector(locator)).click();
	}

	@Then("^User should be presented with a promo alert$")
	public void user_should_be_presented_with_a_promo_alert() throws InterruptedException, IOException {
		productsPage.printSpecialVoucherOfferCode();
		productsPage.clickProceedButton_Popup();
	}

}
