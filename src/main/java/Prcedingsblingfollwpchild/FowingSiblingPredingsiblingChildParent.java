package Prcedingsblingfollwpchild;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class FowingSiblingPredingsiblingChildParent {
	
	@Test 
	public void TestPopUp() throws InterruptedException{
	// Open browser
		System.setProperty("webdriver.chrome.driver","D:/final driver/chromedriver.exe");
		ChromeDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
	    driver.get("https://classic.crmpro.com/");
	    driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
	    driver.findElement(By.xpath(""));
	    
 
}
}