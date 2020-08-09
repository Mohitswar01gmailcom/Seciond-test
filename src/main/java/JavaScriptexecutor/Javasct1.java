package JavaScriptexecutor;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Javasct1 {

	@Test
	public void noB()
	{
	
	System.setProperty("webdriver.chrome.driver","D:/final driver/chromedriver.exe");
    WebDriver driver= new ChromeDriver();
    driver.get("https://www.monsterindia.com/rio/sign-out"); 
    driver.manage().window().maximize();
	

	}
}
