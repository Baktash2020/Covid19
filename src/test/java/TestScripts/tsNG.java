package TestScripts;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import junit.framework.Assert;

public class tsNG {
	
	@BeforeTest
	public void testsetup() {
		
		System.out.println("This is before test");
		
		
	}
	
	@Test 
	public void maintest() {
		System.out.println("This is main test");
		
		Assert.assertEquals("Mike", "Mike");
		
	}
	
	@AfterTest
	public void closetest() {
		
		System.out.println("This is after test");
		
	}

}
