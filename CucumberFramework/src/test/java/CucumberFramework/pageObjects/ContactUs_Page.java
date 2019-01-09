package CucumberFramework.pageObjects;

import java.io.IOException;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.junit.*;

import cucumber.api.DataTable;

public class ContactUs_Page extends BasePage {
	public @FindBy(xpath ="//input[@name='first_name']") WebElement txt_FirstName;
	public @FindBy(xpath ="//input[@name='last_name']") WebElement txt_LastName;
	public @FindBy(xpath ="//input[@name='email']") WebElement txt_EmailAddress;
	public @FindBy(xpath ="//textarea[@name='message']") WebElement txt_Comment;
	public @FindBy(xpath ="//input[@value='SUBMIT']") WebElement btn_Submit;

	public ContactUs_Page() throws IOException {
		super();
		
	}
	
	public ContactUs_Page getContactUsPage( ) throws IOException {
		getDriver().get("http://www.webdriveruniversity.com/Contact-Us/contactus.html");
		return new ContactUs_Page();
	}
	
	public ContactUs_Page enterFirstName( ) throws Exception {
		sendKeysToWebElement(txt_FirstName, "Tom");
		return new ContactUs_Page();
	}
	
	public ContactUs_Page enterLastName(DataTable dataTable, int row, int column ) throws Exception {
		List<List<String>> data = dataTable.raw();
		sendKeysToWebElement(txt_LastName, data.get(row).get(column));
		return new ContactUs_Page();
	}
	
	public ContactUs_Page enterEmailAddress(String email ) throws Exception {
		sendKeysToWebElement(txt_EmailAddress, email);
		return new ContactUs_Page();
	}
	
	public ContactUs_Page enterComment(DataTable dataTable, int row, int column ) throws Exception {
		List<List<String>> data = dataTable.raw();
		sendKeysToWebElement(txt_Comment, data.get(row).get(column));
		return new ContactUs_Page();
	}
	
	public ContactUs_Page clickSubmitButton() throws Exception {
		waitAndClickElement(btn_Submit);
		return new ContactUs_Page();
	}
	
	public ContactUs_Page confirmSubmit() throws IOException {
		WebElement thanksMessage = getDriver().findElement(By.xpath(".//*[@id='contact_reply']/h1"));
		WaitUntilWebElementIsVisible(thanksMessage);
		Assert.assertEquals("thankyouforyourmessage!2", thanksMessage.getText().toLowerCase().replaceAll("[ ()0-9]",""));
		return new ContactUs_Page();
	}

}
