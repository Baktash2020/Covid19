package TestScripts;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.AssertJUnit;
import org.testng.Reporter;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class mozilaBrowser {
	WebDriver driver;
	
	
	@Parameters("Browser")
	@BeforeTest
	
	 public void Beforetest() {
		
   System.setProperty("webdriver.chrome.driver", "C:\\Users\\Aqdas\\Desktop\\Driver\\chromedriver.exe");
		
		driver = new ChromeDriver();
		
		driver.get("https://www.saucedemo.com/");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		
		
	}
	

	
	
	
	@Test (priority=01)
	
	public void Elementdisplayed() throws InterruptedException {
		
		WebElement userName = driver.findElement(By.name("user-name"));
		userName.sendKeys("standard_user");
		Thread.sleep(2000);
		userName.click();
		WebElement passWord = driver.findElement(By.name("password"));
		passWord.sendKeys("secret_sauce");
		Thread.sleep(2000);
		WebElement logIn = driver.findElement(By.name("login-button"));
		
		boolean usernamedisplay = userName.isDisplayed();
		boolean passworddisplay= passWord.isDisplayed();
		boolean logIndisplay = logIn.isDisplayed();
		
		AssertJUnit.assertEquals(usernamedisplay, true);
		AssertJUnit.assertEquals(passworddisplay, true);
		AssertJUnit.assertEquals(logIndisplay, true);
	}
	
	@Test(priority=02)
	
 public void ElementsEnabled() throws InterruptedException {
		
		WebElement userName = driver.findElement(By.name("user-name"));
		userName.sendKeys("standard_user");
		Thread.sleep(2000);
		WebElement passWord = driver.findElement(By.name("password"));
		passWord.sendKeys("secret_sauce");
		Thread.sleep(2000);
		WebElement logIn = driver.findElement(By.name("login-button"));
		
		boolean usernameEnable = userName.isEnabled();
		boolean passwordEnable= passWord.isEnabled();
		boolean logInEnable = logIn.isEnabled();
		
		
		
		Reporter.log("End to End Testing Scneario Passed Successfully!");
		AssertJUnit.assertEquals(usernameEnable, true);
		AssertJUnit.assertEquals(passwordEnable, true);
		AssertJUnit.assertEquals(logInEnable, true);
	}
		
		@AfterTest 
		public void CloseTest() {
			
			driver.quit();
			
		}
	
	
	
	
	

}
