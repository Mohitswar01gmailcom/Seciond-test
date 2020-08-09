package Frame1;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Hnadlingframe {
	
	@Test 
	public void TestPopUp() throws InterruptedException{
	// Open browser
		System.setProperty("webdriver.chrome.driver","D:/final driver/chromedriver.exe");
	    //WebDriver driver= new ChromeDriver();
		ChromeDriver driver= new ChromeDriver();
		
	    driver.get("https://classic.crmpro.com/");
	    Thread.sleep(3000);
	    driver.findElement(By.xpath("//*[@id='loginForm']/div/input[1]")).sendKeys("batchautomation");
	    
	    driver.findElement(By.xpath("//*[@id='loginForm']/div/input[2]")).sendKeys("Test@12345");
	    
	    driver.findElement(By.xpath("//*[@id='loginForm']/div/div/input")).click();
	    Thread.sleep(3000);
	    driver.switchTo().frame("mainpanel");
	    driver.findElement(By.xpath("//*[@id='navmenu']/ul/li[4]/a")).click();

}
}  