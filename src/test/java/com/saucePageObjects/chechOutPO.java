package com.saucePageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class chechOutPO {
	
	WebDriver driver;
	
	public chechOutPO (WebDriver x) {
		driver =x;
	}
	
	public WebElement getfirstname() {
		WebElement FirstName = driver.findElement(By.name("firstName"));
	    return FirstName ;
		}
	
	public WebElement getlastname() {
		WebElement LastName = driver.findElement(By.name("lastName"));
	    return LastName;
		}
	
	public WebElement getpostalcode() {
		WebElement PostalCode = driver.findElement(By.name("postalCode"));
	    return PostalCode;
		}
	
	public WebElement getcontinue() {
		WebElement Continue = driver.findElement(By.name("continue"));
	    return Continue;
		}
	
	public WebElement getfinish() {
		WebElement Finish = driver.findElement(By.name("finish"));
		return Finish; 
	}
	


	

}
