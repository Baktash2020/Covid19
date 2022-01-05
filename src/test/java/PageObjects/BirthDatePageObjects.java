package PageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class BirthDatePageObjects {
	
	
	
	WebDriver driver;
	
	public BirthDatePageObjects (WebDriver x){
		driver = x; 
	}
	
	public WebElement getBirthDay() {
		WebElement Birthday = driver.findElement(By.name(""));
		return Birthday;
		
	}
	
	public WebElement getBirthMonth() {
		WebElement Birthmonth = driver.findElement(By.name(""));
		return Birthmonth;
		
	}
	
	public WebElement getBirthYear() {
		WebElement Birthday = driver.findElement(By.name(""));
		return Birthday;
		
	}
	
	
	
	
	
	
	
	

}
