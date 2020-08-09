package Dyamicwebtable;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class DyWebtable {

	@Test
	public void TestPopUp() throws InterruptedException {
		// Open browser
		System.setProperty("webdriver.chrome.driver", "D:/final driver/chromedriver.exe");
		// WebDriver driver= new ChromeDriver();
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://money.rediff.com/gainers");
		driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
		////table[@class='dataTable']
		//driver.quit();
		
		//*[@id="leftcontainer"]/table/tbody/tr
	/*	
		 int row=driver.findElements(By.xpath("//*[@id='leftcontainer']/table/tbody/tr")).size();
		 System.out.println("numberof rows are:"+row);
		 
		 int col=driver.findElements(By.xpath("//*[@id='leftcontainer']/table/tbody/tr[1]/td")).size();
		 System.out.println("numberof colmns are:"+col);
		 
		 */
		
		 String name=driver.findElement(By.xpath("//*[@id='leftcontainer']/table/tbody/tr/td")).getText();
		 System.out.println("Name of data  :"+name);
		 //driver.quit();
			
		 
		 
		 
}
}