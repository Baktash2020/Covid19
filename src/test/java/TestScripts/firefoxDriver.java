package TestScripts;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.AssertJUnit;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class firefoxDriver {
	
	WebDriver driver;
	
	
	
	
	@BeforeTest
	
	 public void Beforetest() {
		
   System.setProperty("webdriver.gecko.driver", "C:\\Users\\Aqdas\\Desktop\\Mozila\\geckodriver.exe");
   driver = new FirefoxDriver();
   
   driver.get("https://www.saucedemo.com/");
	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	driver.manage().window().maximize();
	driver.manage().deleteAllCookies();
	
	
	}

		@Test 

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


	@AfterTest 
	public void CloseTest() {
		
		driver.quit();
		
	}
	
	
	

}
