package TestScripts;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.saucePageObjects.chechOutPO;
import com.saucePageObjects.productsPO;
import com.saucePageObjects.sauceValidateElePO;

public class baseClass2 {
	
	WebDriver driver;
	sauceValidateElePO SVPO;
	productsPO PPO;
	chechOutPO ChPO;
	
		public void OpenChrome() {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Nilla\\Desktop\\Driver\\chromedriver.exe");
		
		driver = new ChromeDriver();
		
		driver.get("https://www.saucedemo.com/");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		
		
	}
	
		public void setupPage() {
			
			
			SVPO = new sauceValidateElePO(driver);
			PPO = new productsPO(driver);
			ChPO = new chechOutPO(driver);
		}
	
	
		public void navigateURL (String URL) {
			driver.get(URL);
			driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
			
			
		}
		
		public void closepage() {
			
			driver.quit();
		}
		
		

}
