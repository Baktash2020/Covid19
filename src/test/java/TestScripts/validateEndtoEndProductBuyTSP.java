package TestScripts;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.saucePageObjects.chechOutPO;
import com.saucePageObjects.productsPO;
import com.saucePageObjects.sauceValidateElePO;

public class validateEndtoEndProductBuyTSP {
	
	WebDriver driver;
	sauceValidateElePO SVPO;
	productsPO PPO;
	chechOutPO ChPO; 
	
	
	@BeforeTest
	
	 public void Beforetest() {
		
     System.setProperty("webdriver.chrome.driver", "C:\\Users\\Aqdas\\Desktop\\Driver\\chromedriver.exe");
		
		driver = new ChromeDriver();
		SVPO = new sauceValidateElePO(driver);
		PPO = new productsPO(driver);
		ChPO = new chechOutPO(driver);
	
		driver.get("https://www.saucedemo.com/");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		
		 
		}
	
	
	@Test
	
		public void EndtoEndTesting () throws InterruptedException {
		SVPO.getusername().sendKeys("standard_user");
		SVPO.getpassword().sendKeys("secret_sauce");
		SVPO.getlogin().click();
		
		String expectedUrl2 = "https://www.saucedemo.com/inventory.html";
		String actualUrl2 = driver.getCurrentUrl();
		Assert.assertEquals(actualUrl2, expectedUrl2);
		
		System.out.println(actualUrl2);
		
		PPO.getaddToCart().click();
		PPO.getshoppingcart().click();
		PPO.getcheckout().click();
		
		Thread.sleep(2000);
		ChPO.getfirstname().sendKeys("Mike");
		ChPO.getlastname().sendKeys("Tyson");
		ChPO.getpostalcode().sendKeys("22030");
		ChPO.getcontinue().click();
		
		
		
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		String expectedUrl = "https://www.saucedemo.com/checkout-step-two.html";
		String actualUrl = driver.getCurrentUrl();
		Assert.assertEquals(actualUrl, expectedUrl);
		
		System.out.println(actualUrl);
        
		ChPO.getfinish().click();
		
		
		String expectedUrl1 = "https://www.saucedemo.com/checkout-complete.html";
		String actualUrl1 = driver.getCurrentUrl();
		Assert.assertEquals(actualUrl1, expectedUrl1);
		System.out.println(actualUrl1);

		
	}
	
	@AfterTest()
	public void closeTest() {
		
		driver.quit();
	}
	
	}
	


