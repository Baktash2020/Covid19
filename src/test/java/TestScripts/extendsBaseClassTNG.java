package TestScripts;

import org.openqa.selenium.By;

import org.openqa.selenium.WebElement;

import org.testng.annotations.Test;

			public class extendsBaseClassTNG extends baseClassTNG {
				

	
	
	@Test
	
	public void Elementdisplayed() throws InterruptedException {
		
		WebElement userName = driver.findElement(By.name("user-name"));
		userName.sendKeys("standard_user");
		Thread.sleep(2000);
		userName.click();
		WebElement passWord = driver.findElement(By.name("password"));
		passWord.sendKeys("secret_sauce");
		Thread.sleep(2000);
		WebElement logIn = driver.findElement(By.name("login-button"));
		logIn.click();
		


	}
		
			
			
		
		

	}


