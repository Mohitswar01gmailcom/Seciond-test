package TestNaukri;

import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class TestNaukri2 {
	@Test
	public void TestPopUp() throws InterruptedException{
	// Open browser
		System.setProperty("webdriver.chrome.driver","D:/final driver/chromedriver.exe");
	    WebDriver driver= new ChromeDriver();
	    driver.get("https://www.naukri.com/"); 
	    driver.manage().window().maximize();
	 
	 
	// It will return the parent window name as a String
	String parent=driver.getWindowHandle();
	 
	// This will return the number of windows opened by Webdriver and will return Set of St//rings
	Set<String>s1=driver.getWindowHandles();
	 
	// Now we will iterate using Iterator
	Iterator<String> I1= s1.iterator();
	 
	while(I1.hasNext())
	{
	 
	   String child_window=I1.next();
	 
	// Here we will compare if parent window is not equal to child window then we            will close
	 
	if(!parent.equals(child_window))
	{
	driver.switchTo().window(child_window);
	 
	System.out.println(driver.switchTo().window(child_window).getTitle());
	 
	driver.close();
	}
	 
	}
	// once all pop up closed now switch to parent window
	driver.switchTo().window(parent);

	driver.findElement(By.xpath("//*[@id='login_Layer']")).click();
	driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	driver.findElement(By.xpath("//*[@id='block']")).click();
	driver.findElement(By.xpath("//input[@placeholder='Enter your active Email ID / Username']")).sendKeys("mohitswar01@gmail.com");
	driver.findElement(By.xpath("//input[@placeholder='Enter your password']")).sendKeys("npav@123");
	driver.findElement(By.xpath("//button[starts-with(@type, 'submit')]")).click();
	driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	driver.findElement(By.xpath("//*[@class='btn btn-block btn-large white-text']")).click();
	driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	driver.findElement(By.xpath("//*[@id='attachCV']")).sendKeys("D://RESUME//Resume Mohit Swar.doc");
	//driver.close();
	}

}
