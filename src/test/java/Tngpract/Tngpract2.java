package Tngpract;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.AfterSuite;

public class Tngpract2 {
	@BeforeMethod
	public void setUp(){
	         System.out.println("@BeforeMethod");
	}
	
	
	@Test (groups = { "smokeTest", "functionalTest" })
	public void setUp2(){
	{
	System.out.println("Logged in successfully");
	}
	}
	@Test(priority=1)
	public void loginPageTitleTest(){
		System.out.println("priority=1");
	
	}
	
	@Test(priority=2)
	public void crmLogoImageTest(){
		System.out.println("priority=2");
		
	}
	
	@Test(priority=3)
	public void loginTest(){
		System.out.println("priority=3");
	}
	
	
	
	@AfterMethod
	public void tearDown(){
		System.out.println("@AfterMethod");
	}
	
	
	
 

  

}
