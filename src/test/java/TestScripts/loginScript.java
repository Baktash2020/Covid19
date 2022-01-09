package TestScripts;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.saucePageObjects.logInPO;
import com.saucePageObjects.productsPO;

public class loginScript {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Nilla\\Desktop\\Driver\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.saucedemo.com/");
		
		logInPO LG = new logInPO(driver);
		
		productsPO PD = new productsPO(driver);
	
	
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		
		Thread.sleep(2000);
		
		LG.getusername().sendKeys("standard_user");
		
		
		LG.getpassword().sendKeys("secret_sauce");
		
		LG.getlogin().click();
		
		String Url =  driver.getCurrentUrl();
		System.out.println(Url);
		
		String Title = driver.getTitle();
		System.out.println(Title); 
		
		PD.getaddToCart().click();
		Thread.sleep(1000);
		PD.getshoppingcart().click();
		Thread.sleep(1000);
		PD.getcheckout();
		Thread.sleep(1000);
		
		String Url1 = driver.getCurrentUrl();
		System.out.println(Url1);
		String Title1 = driver.getTitle();
		System.out.println(Title1);
		
		
		driver.quit();
		
		
		
		
		
		

	}

}
