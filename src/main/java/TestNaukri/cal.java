package TestNaukri;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class cal {
	
		 
		public static void main(String[] args) 
		{
			
			System.setProperty("webdriver.chrome.driver","D:/final driver/chromedriver.exe");
		    WebDriver driver= new ChromeDriver();
	 
			driver.get("http://seleniumpractise.blogspot.in/2016/08/how-to-handle-calendar-in-selenium.html");
			
			driver.findElement(By.id("datepicker")).click();
						
			List<WebElement> allDates=driver.findElements(By.xpath("//table[@class='ui-datepicker-calendar']//td"));
			
			for(WebElement ele:allDates)
			{
				
				String date=ele.getText();
				
				if(date.equalsIgnoreCase("28"))
				{
					ele.click();
					break;
				}
				
			}
			
			
		}
	 

}
