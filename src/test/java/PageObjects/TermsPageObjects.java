package PageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class TermsPageObjects {
	
	
	
WebDriver driver;
	
	public TermsPageObjects (WebDriver x){
		driver = x; 
	}
	
	
	public WebElement getTerms() {
		WebElement terms = driver.findElement(By.id("terms-link"));
		return terms;
		
	}
	
	public WebElement getDataPolicy() {
		WebElement datapolicy = driver.findElement(By.id("privacy-link"));
		return datapolicy;
		
	}
	
	public WebElement getCookiePolicy() {
		WebElement cookeiPolicy = driver.findElement(By.id("cookie-use-link"));
		return cookeiPolicy;
		
	}
	

}
