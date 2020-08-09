package Tngpract;

import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Twosame {

	public static void main(String[] args) {
		//Open browser
		System.setProperty("webdriver.chrome.driver","D:/final driver/chromedriver.exe");
	    WebDriver driver= new ChromeDriver();
	    driver.get("https://www.naukri.com/"); 
	    driver.manage().window().maximize();
	    
	 // It will return the parent window name a a String
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

		//driver.findElement(By.xpath("//button[contains(text(),'Login')][1]")).click();
		//System.out.println(2);
		//driver.findElement(By.xpath("[2]")).click();
		//System.out.println(3);
		
	
		List<WebElement> elementName = driver.findElements(By.xpath("//button[contains(text(),'Login')]"));
		System.out.println(elementName.size());

		//elementName.get(0).click();
		elementName.get(1).click();
	}

}
