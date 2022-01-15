package TestScripts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class drapDown {

	public static void main(String[] args) throws InterruptedException {


		
      System.setProperty("webdriver.chrome.driver", "C:\\Users\\Aqdas\\Desktop\\Driver\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		Thread.sleep(3000);
		driver.get("https://www.facebook.com/create/");
		
		String url = driver.getCurrentUrl();
		String title = driver.getTitle();
		
		System.out.println(url);
		System.out.println(title);
		
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		
		Thread.sleep(3000);
		
		WebElement firstName = driver.findElement(By.id("usernamereg-firstName"));
		
		firstName.sendKeys("Kimmy");
		
		firstName.clear();
		WebElement lastName = driver.findElement(By.id("usernamereg-lastName"));
		lastName.sendKeys("Diam");
		
		WebElement userName = driver.findElement(By.name("yid"));
		userName.sendKeys("kimmy66");
		Thread.sleep(3000);
		
		WebElement passWord = driver.findElement(By.name("password"));
		
		passWord.sendKeys("ZaheenRoom1");
		Thread.sleep(3000);
		
		
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
		
		
		
		
		
		
		
		
		driver.quit();

	}

	}


