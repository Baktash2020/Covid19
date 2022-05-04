package StepDefs;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class BirthDateSteps {

	WebDriver driver; 
	
	
	@Given("^User Opens the HomePage$")
	public void user_Opens_the_HomePage() throws Throwable {

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Nilla\\Desktop\\Driver\\chromedriver.exe");
		driver= new ChromeDriver();
		Thread.sleep(2000);
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.navigate().to("https://www.facebook.com/r.php?");
		Thread.sleep(2000);
	}
	
	
	
	
	@When("^User Sets Birth Month to \"([^\"]*)\"$")
	public void user_Sets_Birth_Month_to(String SettingMonth) throws Throwable {
	    
		Select Month = new Select (driver.findElement(By.id("month")));
		
		Month.selectByIndex(0);
		Month.selectByIndex(1);
		Month.selectByIndex(2);
		Month.selectByIndex(3);
		Month.selectByIndex(4);
		Month.selectByIndex(5);
		Month.selectByIndex(6);
		Month.selectByIndex(7);
		Month.selectByIndex(8);
		Month.selectByIndex(9);
		Month.selectByIndex(10);
		Month.selectByIndex(11);
		
		    
	}
	
	
	@When("^User Sets Birth Day to \"([^\"]*)\"$")
	public void user_Sets_Birth_Day_to(String SettingDay) throws Throwable {
		Select Day= new Select (driver.findElement(By.name("birthday_day")));
		Day.selectByIndex(0);
		Day.selectByIndex(1);
		Day.selectByIndex(2);
		Thread.sleep(1000);
		Day.selectByIndex(5);
		Day.selectByIndex(10);
		Day.selectByIndex(14);
		Day.selectByIndex(17);
		Thread.sleep(1000);
		Day.selectByIndex(20);
		Day.selectByIndex(25);
		Day.selectByIndex(29);
		Thread.sleep(1000);
		   
	}

	@When("^User Sets Birth Year to \"([^\"]*)\"$")
	public void user_Sets_Birth_Year_to(String SettingYear) throws Throwable {
     Select Year = new Select (driver.findElement(By.name("birthday_year")));
     Year.selectByValue("1991");
     Thread.sleep(1000);
     Year.selectByValue("1992");
     Year.selectByValue("1996");
     Year.selectByValue("1997");
     Year.selectByValue("1998");
     Year.selectByValue("1999");
     Thread.sleep(1000);
     Year.selectByValue("2000");
     Year.selectByValue("2005");
     Year.selectByValue("2007");
     Year.selectByValue("2020");
     
    		 
		
	}

	@Then("^User Closes the HomePage$")
	public void user_Closes_the_HomePage() throws Throwable {
    driver.close();

		
	}

	
	
	
	
	
	
}
