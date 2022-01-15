package TestScripts;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.saucePageObjects.sauceValidateElePO;

public class sauceValidateEleTSP {
	
	public class validateElements {

		  WebDriver driver;
		  sauceValidateElePO SVPO;
		
		
		@BeforeTest
		
		 public void Beforetest() {
			
	    System.setProperty("webdriver.chrome.driver", "C:\\Users\\Aqdas\\Desktop\\Driver\\chromedriver.exe");
			
			driver = new ChromeDriver();
			SVPO = new sauceValidateElePO(driver);
		
			driver.get("https://www.saucedemo.com/");
			driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
			driver.manage().window().maximize();
			driver.manage().deleteAllCookies();
			
			 
		}
		
		@BeforeMethod 
		public void beforeEachTest() {
			driver.get("https://www.saucedemo.com/");
			driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
			
		}
		
       @Test (priority=0)
		
		public void ValidatePositiveLogin () throws InterruptedException {
			SVPO.getusername().sendKeys("standard_user");
			SVPO.getpassword().sendKeys("secret_sauce");
			SVPO.getlogin().click();
			Thread.sleep(2000);
			
			String expectedUrl = "https://www.saucedemo.com/inventory.html";
			String actualUrl = driver.getCurrentUrl();
			Assert.assertEquals(actualUrl, expectedUrl);
			System.out.println(actualUrl);
			
			
			
		}
		
		@Test (priority=1)
		
		public void ValidatePositiveLogin1 () throws InterruptedException {
			SVPO.getusername().sendKeys("problem_user");
			SVPO.getpassword().sendKeys("secret_sauce");
			SVPO.getlogin().click();
			Thread.sleep(2000);
			
		}
		
		
		
       @Test (priority=2)
		
		public void ValidateLockeOutLogin () {
			SVPO.getusername().sendKeys("locked_out_user");
			SVPO.getpassword().sendKeys("secret_sauce");
			SVPO.getlogin().click();
			
			String expectedUrl = "https://www.saucedemo.com/";
			String actualUrl = driver.getCurrentUrl();
			Assert.assertEquals(actualUrl, expectedUrl);
			
		}
		
		
		
		
		@AfterTest()
		public void closeTest() {
			
			driver.quit();
		}
		}
		
		
		

}
