package CucumberFramework.pageObjects;

import java.io.IOException;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Products_Page extends BasePage {
	public @FindBy(css ="#container-special-offers") WebElement btn_SpecialOffers;
	public @FindBy(css ="#container-products2") WebElement btn_Laptops;
	public @FindBy(xpath =".//*[@id='myModal']//b[contains(text(), 'NEWCUSTOMER')]") WebElement voucherNumber;
	public @FindBy(xpath ="//button[text()='Proceed']") WebElement btn_Proceed_Popup;
	
	public Products_Page() throws IOException {
		super();
		
	}
	
	public Products_Page clickProceedButton_Popup() throws IOException, InterruptedException {
		waitAndClickElement(btn_Proceed_Popup);
		return new Products_Page();
	}
	
	public String printSpecialVoucherOfferCode() {
		WaitUntilWebElementIsVisible(voucherNumber);
		String voucherCode = voucherNumber.getText();
		System.out.println("Voucher Code:" + voucherCode);
		return voucherCode;
	}

}
