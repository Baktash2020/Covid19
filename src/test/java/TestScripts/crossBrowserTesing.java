package TestScripts;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;

public class crossBrowserTesing {
	
	WebDriver driver;
	



	@Parameters("Browser")
	@BeforeTest
  
	public void setupTest(String Browser  ){
		
		if(Browser=="Chrome"){
			
			System.setProperty("webdriver.chrome.driver", "C:\\Users\\Nilla\\Desktop\\Driver\\chromedriver.exe");
			driver =new ChromeDriver();
			
		}
		
		if( Browser=="IEBrowser"){
			System.setProperty("webdriver.IE.driver", ".exe");
			driver= new InternetExplorerDriver();
			
		}
	  
	  if(Browser=="Mozila"){
		  
		  System.setProperty("webdriver.gecko.driver", "C:\\Users\\Aqdas\\Desktop\\Mozila\\geckodriver.exe");
		   driver = new FirefoxDriver();
		  
		  
		  
	  }
	  
	  
  }
	

}
