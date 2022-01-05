package PageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class SignUpPageObjects {
	
	
	WebDriver driver;
	public SignUpPageObjects (WebDriver x){
		driver = x; 
	}
	
	public WebElement getemailorphone() {
		WebElement EmailorPhone = driver.findElement(By.name("email"));
		return EmailorPhone;
		
	}
	
	public WebElement getpassword() {
		WebElement Password = driver.findElement(By.name("pass"));
		return Password;
		
	}
	
	public WebElement getlogin() {
		WebElement LogIn = driver.findElement(By.id("u_0_b"));
		return LogIn;
		
	}
	
	public WebElement getfirstname() {
		WebElement FirstName = driver.findElement(By.name("firstname"));
		return FirstName;
		
	}
	
	public WebElement getlastname() {
		WebElement LastName = driver.findElement(By.name("lastname"));
		return LastName;
		
	}
	
	public WebElement getMobile() {
		WebElement Mobile = driver.findElement(By.name("reg_email__"));
		return Mobile;
		
	}
	
	public WebElement getreenterEmail() {
		WebElement Email = driver.findElement(By.name("reg_email_confirmation__"));
		return Email;
		
	}
	
	
	public WebElement getnewpasswrod() {
		WebElement NewPassword = driver.findElement(By.name("reg_passwd__"));
		return NewPassword;
		
	}
	
	
	
	
	

}
