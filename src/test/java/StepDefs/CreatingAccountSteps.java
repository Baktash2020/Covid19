package StepDefs;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import PageObjects.SignUpPageObjects;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class CreatingAccountSteps {
	
WebDriver driver;
	
	SignUpPageObjects SUP;
	
	@Given("^User is in the HomePage$")
	public void user_is_in_the_HomePage() throws Throwable {

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Aqdas\\Desktop\\ChromeD\\chromedriver.exe");
		driver= new ChromeDriver();
		SUP = new SignUpPageObjects (driver);
		Thread.sleep(2000);
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.navigate().to("");
		Thread.sleep(2000);	
	}
	
	@When("^User Enters FirstName in The text box$")
	public void user_Enters_FirstName_in_The_text_box()           {
    SUP.getfirstname().sendKeys("Samia");
		
	}

	@When("^User Enters LastName in The text box$")
	public void user_Enters_LastName_in_The_text_box()             {
    SUP.getlastname().sendKeys("Raajesh");

		
	}

	@When("^User Enters MobileorEmail in The text box$")
	public void user_Enters_MobileorEmail_in_The_text_box()        {
    SUP.getMobile().sendKeys("Samia@hotmail.com");
		
	}

	@When("^User Enters Newpassword in The text box$")
	public void user_Enters_Newpassword_in_The_text_box()        {

    SUP.getnewpasswrod().sendKeys("7642qwoi");
	}


	@When("^User Reenters Email in the text box$")
	public void user_Reenters_Email_in_the_text_box()       {
    SUP.getreenterEmail().sendKeys("Samia@hotmail.com");

		
		
	}

	@Then("^User Close the HomePage$")
	public void user_Close_the_HomePage()      {
    driver.close();

		
	}
	
	@When("^User Enters \"([^\"]*)\" in firstname text box$")
	public void user_Enters_in_firstname_text_box(String FirstName)  {
	    SUP.getfirstname().sendKeys(FirstName);
	}

	@When("^User Enters \"([^\"]*)\"  in lastname text box$")
	public void user_Enters_in_lastname_text_box(String lastname)  {
	    SUP.getlastname().sendKeys(lastname);
	}
	
	@When("^User Enters \"([^\"]*)\" in email text box$")
	public void user_Enters_in_email_text_box(String email)     {
		
		SUP.getMobile().sendKeys(email);
	}

	@When("^User Reenters \"([^\"]*)\" in Reenter Email text box$")
	public void user_Reenters_in_Reenter_Email_text_box(String Email)  {
	    SUP.getreenterEmail().sendKeys(Email);
	}

	@When("^User Enters \"([^\"]*)\" in newpassword text box$")
	public void user_Enters_in_newpassword_text_box(String newpassword)  {
    SUP.getnewpasswrod().sendKeys(newpassword);

	}




	
	
	

}

	
	
	
	
	
	

