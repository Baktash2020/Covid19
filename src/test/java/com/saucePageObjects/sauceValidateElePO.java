package com.saucePageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class sauceValidateElePO {

   WebDriver driver;
	
	public  sauceValidateElePO(WebDriver x) {
		driver =x;
	
	}
	
	
	
	public WebElement getusername() {
		WebElement userName = driver.findElement(By.name("user-name"));
	    return userName;
		}

		
		public WebElement getpassword() {
		WebElement passWord = driver.findElement(By.name("password"));
		return passWord;
		}
		
		
		public WebElement getlogin() {
		WebElement logIn = driver.findElement(By.name("login-button"));
		return logIn;
		}
	
}
