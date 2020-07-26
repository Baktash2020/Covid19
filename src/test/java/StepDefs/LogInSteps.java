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
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Aqdas\\Desktop\\Chromed\\chromedriver.exe");
		driver= new ChromeDriver();
		Thread.sleep(2000);
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.navigate().to("");
		Thread.sleep(2000);
	
	}

	@When("^User Enters Email in text box$")
	public void user_Enters_Email_in_text_box()  {
		driver.findElement(By.name("")).sendKeys("Taani");


	}

	@When("^User Enters Password in text box$")
	public void user_Enters_Password_in_text_box()      {
		driver.findElement(By.name("")).sendKeys("!235Raj");


		
		
	}

	@When("^User Clicks on Log in$")
	public void user_Clicks_on_Log_in()   {
    driver.findElement(By.id("")).click();

		
	}

	@Then("^User Close the Home Page$")
	public void user_Close_the_Home_Page()    {
     driver.close();

		
		
	}


	
	
	
	

}
