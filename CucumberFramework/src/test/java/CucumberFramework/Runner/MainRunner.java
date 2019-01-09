package CucumberFramework.Runner;

import java.io.File;
import java.io.IOException;

import org.junit.runner.RunWith;
import org.testng.annotations.AfterClass;

import com.cucumber.listener.Reporter;

import CucumberFramework.pageObjects.BasePage;
import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import cucumber.api.testng.AbstractTestNGCucumberTests;

@RunWith(Cucumber.class)

@CucumberOptions (
	features = { "src/test/java/CucumberFramework/Features/" },
			glue = {"CucumberFramework.Steps"},
			monochrome = true,
			dryRun = false,
//			tags = {"@important, @staging"}, //example
			tags = {},
			plugin = { "pretty", "html:target/cucumber",
					"json:target/cucumber.json",
					"com.cucumber.listener.ExtentCucumberFormatter:target/report.html"
					}
)

public class MainRunner extends AbstractTestNGCucumberTests {
	@AfterClass
	public static void writeExtenReport() throws IOException {
		Reporter.loadXMLConfig(new File(System.getProperty("user.dir") + "/src/test/java/CucumberFramework/Utils/ReportsConfig.xml"));
		BasePage.copyLatestExtentReport();
	}
}

