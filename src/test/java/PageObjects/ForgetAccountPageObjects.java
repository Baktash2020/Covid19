package PageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class ForgetAccountPageObjects {
	
	WebDriver driver;
	
	public ForgetAccountPageObjects (WebDriver x){
		driver = x; 
	}
	
	
	public WebElement getForgetAccount() {
		WebElement Forget = driver.findElement(By.id("terms-link"));
		return Forget;
		
	}
	
	
	

}
