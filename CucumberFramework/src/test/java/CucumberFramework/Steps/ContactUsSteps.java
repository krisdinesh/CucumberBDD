package CucumberFramework.Steps;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import cucumber.api.DataTable;

import java.io.IOException;

import CucumberFramework.Utils.DriverFactory;


public class ContactUsSteps extends DriverFactory {
	
	@Given("^User navigates to contact us form$")
	public void user_navigates_to_contact_us_form() throws IOException {
		contactUsPage.getContactUsPage();
	}

	@And("^User enter valid firstname$")
	public void user_enter_valid_firstname() throws Exception {
		contactUsPage.enterFirstName();
	    
	}

	@And("^User enter valid lastname$")
	public void user_enter_valid_lastname(DataTable dataTable) throws Exception {
	    contactUsPage.enterLastName(dataTable, 0, 2);
	}

	@And("^User enter email valid email address$")
	public void user_enter_email_valid_email_address() throws Exception {
		contactUsPage.enterEmailAddress("krisdines@gmail.com");
	}

	@And("^User enter valid comments$")
	public void user_enter_valid_comments(DataTable dataTable) throws Exception {
		contactUsPage.enterComment(dataTable, 0, 1);
	}

	@When("^User click on submit button$")
	public void User_click_on_submit_button() throws Exception {
		contactUsPage.clickSubmitButton();
	}

	@Then("^the information should successfully be submitted$")
	public void the_information_should_successfully_be_submitted() throws Exception {
		contactUsPage.confirmSubmit();
	   
	}
}
