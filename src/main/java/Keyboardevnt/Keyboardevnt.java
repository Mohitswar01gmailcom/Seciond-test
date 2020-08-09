package Keyboardevnt;

import java.awt.RenderingHints.Key;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class Keyboardevnt {
	
	@Test
	public  void keyevent(){
	
		System.setProperty("webdriver.chrome.driver","D:/final driver/chromedriver.exe");
	    WebDriver driver= new ChromeDriver();
	    driver.get("https://the-internet.herokuapp.com"); 
	    driver.manage().window().maximize();
	    /*
	    driver.findElement(By.xpath("//*[@id='target']")).sendKeys(Keys.ENTER);
	    driver.findElement(By.xpath("//*[@id='target']")).sendKeys(Keys.SPACE);
	    driver.findElement(By.xpath("//*[@id='target']")).sendKeys(Keys.ENTER);
		//https://www.youtube.com/watch?v=2n8Uay6o240
		 * 
		 */
	   WebElement s1= driver.findElement(By.xpath("//*[@id='content']/ul/li[14]/a"));
	    Actions action=new Actions(driver);
	    
	    //action.sendKeys(Keys.ENTER).build().perform();
	    action.click(s1).build().perform();
		
	}

}
 