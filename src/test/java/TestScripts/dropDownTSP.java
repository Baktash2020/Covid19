package TestScripts;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class dropDownTSP {
	WebDriver driver;
	
	@BeforeTest
	
	 public void Beforetest() {
		
    System.setProperty("webdriver.chrome.driver", "C:\\Users\\Nilla\\Desktop\\Driver\\chromedriver.exe");
		
		driver = new ChromeDriver();
		driver.get("");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		
		 
		}
	
	@Test
	
	public void DropDown() throws InterruptedException {
		
		driver.findElement(By.id("usernamereg-firstName")).sendKeys("Kimmy");
		
		driver.findElement(By.id("usernamereg-lastName")).sendKeys("Diam");
		
		driver.findElement(By.name("yid")).sendKeys("kimmy66");
		
		driver.findElement(By.name("password")).sendKeys("ZaheenRoom1");
		
		WebElement coutryCode = driver.findElement(By.name("shortCountryCode"));
		Select CCode = new Select(coutryCode);
		CCode.selectByIndex(0);
		Thread.sleep(1000);
		CCode.selectByIndex(1);
		Thread.sleep(1000);
		CCode.selectByIndex(3);
		Thread.sleep(1000);
		CCode.selectByIndex(5);
		Thread.sleep(1000);
		CCode.selectByIndex(50);
		Thread.sleep(1000);
		
		
		WebElement phone = driver.findElement(By.name("phone"));
		phone.sendKeys("5173314255");
		phone.clear();
		//System.out.println(phone);
		
		
		WebElement birthMonth = driver.findElement(By.id("usernamereg-month"));
		Select BM = new Select(birthMonth);
		
		BM.selectByValue("1");
		BM.selectByValue("9");
		//BM.selectByIndex(2);
		Thread.sleep(1000);
		//BM.selectByIndex(5);
		Thread.sleep(1000);
		
		WebElement Day = driver.findElement(By.name("dd"));
		
		Day.sendKeys("4");
		Day.clear();
		Thread.sleep(1000);
		Day.sendKeys("8");
		
		WebElement Year = driver.findElement(By.id("usernamereg-year"));
		
		Year.sendKeys("1999");
		Thread.sleep(1000);
		Year.clear();
		Year.sendKeys("2001");
		Thread.sleep(2000);
		Year.clear();
		Year.sendKeys("2005");
		Thread.sleep(3000);
		Year.clear();
		
		
		
		
		
		
		
	}
		
	@AfterTest
	public void CloseTest() {
		driver.quit();
	}
	
}
