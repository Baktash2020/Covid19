package com.saucePageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class productsPO {
	
	
	WebDriver driver;
	
	public productsPO (WebDriver x) {
		
		driver = x;
	}
	
    public WebElement getaddToCart() {
    	WebElement AdCart = driver.findElement(By.name("add-to-cart-sauce-labs-backpack"));
    	return AdCart;
    }
    
    public WebElement getshoppingcart() {
    	WebElement ShpC = driver.findElement(By.xpath("//*[@id=\"shopping_cart_container\"]/a"));
    	return ShpC; 
    }
	
    public WebElement getcheckout() {
    	WebElement ChOut = driver.findElement(By.name("checkout"));
    	return ChOut;
    }

}
