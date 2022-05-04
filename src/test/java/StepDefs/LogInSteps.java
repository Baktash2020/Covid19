package StepDefs;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class LogInSteps {
	
	WebDriver driver;
	
	
	@Given("^User is in the Home Page$")
	public void user_is_in_the_Home_Page() throws InterruptedException  {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Nilla\\Desktop\\Driver\\chromedriver.exe");
		driver= new ChromeDriver();
		Thread.sleep(2000);
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.navigate().to("https://www.facebook.com/");
		Thread.sleep(2000);
	
	}
	
	@When("^User Clicks on log Into Existing Account$")
	public void user_Clicks_on_log_Into_Existing_Account()      {
        driver.findElement(By.linkText("Already have an account?")).click();

		
	}

	@When("^User Enters Email in text box$")
	public void user_Enters_Email_in_text_box()  {
		driver.findElement(By.name("email")).sendKeys("Taani");


	}

	@When("^User Enters Password in text box$")
	public void user_Enters_Password_in_text_box()      {
		driver.findElement(By.name("pass")).sendKeys("!235Raj");	
	}

	
	@Then("^User Close the Home Page$")
	public void user_Close_the_Home_Page()    {
     driver.close();

		
		
	}
	
	@When("^User Enters \"([^\"]*)\" in Email text box$")
	public void user_Enters_in_Email_text_box(String Email)     {
		driver.findElement(By.name("email")).sendKeys(Email);

	}

	@When("^User Enters \"([^\"]*)\"  in Passwod text box$")
	public void user_Enters_in_Passwod_text_box(String Password)     {
		driver.findElement(By.name("pass")).sendKeys(Password);


	}




	
	
	
	

}
