package seleniumOne;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class validateSignInPage {

	public static void main(String[] args) throws InterruptedException {

    String actualUrl;
    String actualTitle;
    
    
    String expectedUrl ="https://www.saucedemo.com/";
	String expectedTitle = "Swag Labs";
	
	

    
    System.setProperty("webdriver.chrome.driver", "C:\\Users\\Nilla\\Desktop\\Driver\\chromedriver.exe");
	
	WebDriver driver = new ChromeDriver();
	
	//Thread.sleep(3000);
	driver.get("https://www.saucedemo.com/");
	
	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	
	actualUrl = driver.getCurrentUrl();
	actualTitle = driver.getTitle();
	
	System.out.println(actualUrl);
	System.out.println(actualTitle);
	
	driver.manage().window().maximize();
	driver.manage().deleteAllCookies();
	
	Thread.sleep(3000);
	
	WebElement userName = driver.findElement(By.name("user-name"));
	userName.sendKeys("standard_user");
	Thread.sleep(3000);
	userName.clear();
	WebElement passWord = driver.findElement(By.name("password"));
	passWord.sendKeys("secret_sauce");
	Thread.sleep(3000);
	passWord.clear();
	WebElement logIn = driver.findElement(By.name("login-button"));
	logIn.click();
	

	
    
    driver.quit();
    

	}

}
