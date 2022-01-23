package TestScripts;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

public class baseClassTNG {
	WebDriver driver;
	
	
	@BeforeClass 
	
	public void setupTest() {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Nilla\\Desktop\\Driver\\chromedriver.exe");
		
		driver = new ChromeDriver();
		
		driver.get("https://www.saucedemo.com/");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		
		
	}
		
		
		
	
	
	
	@AfterClass 
	public void tearDownTest() {
		
		driver.quit();
		
		
	}

}
