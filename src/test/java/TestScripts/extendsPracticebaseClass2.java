package TestScripts;

import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class extendsPracticebaseClass2 extends baseClass2{
	
	@BeforeTest
	public void setupTest() {
		
		OpenChrome();
		
		setupPage();
		
		navigateURL ("https://www.saucedemo.com/");
		
		//closepage();
		
	}
	
	@Test
	
	public void EndtoEndTesting ()  {
	SVPO.getusername().sendKeys("standard_user");
	SVPO.getpassword().sendKeys("secret_sauce");
	SVPO.getlogin().click();
	
	
	PPO.getaddToCart().click();
	PPO.getshoppingcart().click();
	PPO.getcheckout().click();
	

	ChPO.getfirstname().sendKeys("Mike");
	ChPO.getlastname().sendKeys("Tyson");
	ChPO.getpostalcode().sendKeys("22030");
	ChPO.getcontinue().click();
	
	
	ChPO.getfinish().click();
	
	driver.quit();
	
	
	}
}
