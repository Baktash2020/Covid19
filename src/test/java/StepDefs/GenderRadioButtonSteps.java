package StepDefs;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class GenderRadioButtonSteps {
	
	
	WebDriver driver;
	
	@Given("^User is in gender MainPage$")
	public void user_is_in_gender_MainPage() throws Throwable {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Aqdas\\Desktop\\ChromDriver\\chromedriver.exe");
		driver= new ChromeDriver();
		Thread.sleep(2000);
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.navigate().to("");
		Thread.sleep(2000);
	}

	@When("^User is Selecting her/his Gender$")
	public void user_is_Selecting_her_his_Gender() throws Throwable {
		
		driver.findElement(By.id("u_0_6")).click();
		Thread.sleep(2000);
		driver.findElement(By.id("u_0_7")).click();
		
		Thread.sleep(2000);
		driver.findElement(By.id("u_0_8")).click();
			
	}

	@Then("^Use is Closing gender MainPage$")
	public void use_is_Closing_gender_MainPage() throws Throwable {
    driver.close();

	}

	//@When("^user is selecting \"([^\"]*)\"$")
	//public void user_is_selecting(String Custom) throws Throwable {
	
	@When("^user is selecting Custom$")
	public void user_is_selecting_Custom() throws Throwable {
		
		driver.findElement(By.id("u_0_8")).click();
			
	}

	@When("^user is selecting she in box of \"([^\"]*)\"$")
	public void user_is_selecting_she_in_box_of(String SelecttingPronoun) throws Throwable {
    
		Select Pronoun = new Select(driver.findElement(By.name("preferred_pronoun")));
		Pronoun.selectByIndex(0);
	     Thread.sleep(3000);
	     Pronoun.selectByIndex(1);
	     Thread.sleep(3000);
	     Pronoun.selectByIndex(2);
	     Thread.sleep(3000);
	     Pronoun.selectByIndex(3);

		
		
	}

	@When("^user is entering Male in Gender Optional in the textbox$")
	public void user_is_entering_Male_in_Gender_Optional_in_the_textbox() throws Throwable {
		driver.findElement(By.id("u_0_12")).sendKeys("Male");
		Thread.sleep(3000);
		//driver.findElement(By.id("u_0_12")).clear();
		
		
	}
		
	@When("^user is entering Female in Gender Optional in the textbox$")
	public void user_is_entering_Female_in_Gender_Optional_in_the_textbox() throws Throwable {
		driver.findElement(By.id("u_0_12")).sendKeys("Female");
		Thread.sleep(3000);

	}


	
	
	
	
	
	
	

}
