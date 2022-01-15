package TestScripts;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import com.saucePageObjects.sauceValidateElePO;

public class validatDataLoginParameter {
	
	
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
	
	@Parameters ({"username","password", "expectedURL"})
	@Test
	
	public void DataDrivenLoging (String username, String password, String expectedURL) throws InterruptedException {
	SVPO.getusername().sendKeys(username);
	SVPO.getpassword().sendKeys(password);
	SVPO.getlogin().click();
	
	
	String actualUrl2 = driver.getCurrentUrl();
	Assert.assertEquals(actualUrl2, expectedURL);
	
	System.out.println(actualUrl2);
	System.out.println(expectedURL);
	
	
	}
	
	@AfterTest()
	public void closeTest() {
		
		driver.quit();
	}

}
