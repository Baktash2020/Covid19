package TestScripts;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

  
  public class validateElements {

	  WebDriver driver;
	
	
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
	
	public void Elementdisplayed() {
		
		WebElement userName = driver.findElement(By.name("user-name"));
		WebElement passWord = driver.findElement(By.name("password"));
		WebElement logIn = driver.findElement(By.name("login-button"));
		
		boolean usernamedisplay = userName.isDisplayed();
		boolean passworddisplay= passWord.isDisplayed();
		boolean logIndisplay = logIn.isDisplayed();
		
		Assert.assertEquals(usernamedisplay, true);
		Assert.assertEquals(passworddisplay, true);
		Assert.assertEquals(logIndisplay, true);
	}
	
	@Test(priority=02)
	
  public void ElementsEnabled() {
		
		WebElement userName = driver.findElement(By.name("user-name"));
		WebElement passWord = driver.findElement(By.name("password"));
		WebElement logIn = driver.findElement(By.name("login-button"));
		
		boolean usernameEnable = userName.isEnabled();
		boolean passwordEnable= passWord.isEnabled();
		boolean logInEnable = logIn.isEnabled();
		
		Assert.assertEquals(usernameEnable, true);
		Assert.assertEquals(passwordEnable, true);
		Assert.assertEquals(logInEnable, true);
	}
		
		@AfterTest 
		public void CloseTest() {
			
			driver.quit();
			
		}
		
		
		
		
		
		
		
	}

