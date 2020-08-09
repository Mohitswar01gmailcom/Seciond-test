package Tngpract;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Tnganotation1 {
     WebDriver driver;
	
	@BeforeMethod
	public  void mMinesone()
	{
		System.out.println("-1");
	}
	
	

     @Test
     public  void mOne()	
    {
	System.out.println("1");
     } 
     
     @Test
     public  void mTwo()	
    {
	System.out.println("2");
     } 
     
     
     @Test
     public  void mThree()	
    {
	System.out.println("3");
     } 
     
     @AfterMethod
     public  void mMinestwo()
 	{
 		System.out.println("-2");
 	}




}

