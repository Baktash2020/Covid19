package StepDefs;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import PageObjects.TermsPageObjects;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class TermsDataCookieSteps {
	
	WebDriver driver;
	
	TermsPageObjects TPO;
	
	@Given("^I am in Main Page$")
	public void i_am_in_Main_Page() throws Throwable {

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Aqdas\\Desktop\\ChromDriver\\chromedriver.exe");
		driver= new ChromeDriver();
		TPO = new TermsPageObjects (driver);
		Thread.sleep(2000);
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.navigate().to("");
		Thread.sleep(2000);	
	}

	@When("^I click on Terms$")
	public void i_click_on_Terms() throws Throwable {
		TPO.getTerms().click();	
		Thread.sleep(2000);
	}

	@When("^I click on Data Policy$")
	public void i_click_on_Data_Policy() throws Throwable {
    TPO.getDataPolicy().click();
    Thread.sleep(2000);
	}

	@When("^I click on Cookies Policy$")
	public void i_click_on_Cookies_Policy() throws Throwable {
     TPO.getCookiePolicy().click();
    Thread.sleep(3000);
		
	}

	@Then("^I close the Main Page$")
	public void i_close_the_Main_Page() throws Throwable {
    driver.quit();

		
		
	}


	
	
	
	

}
