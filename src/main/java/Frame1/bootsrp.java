package Frame1;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class bootsrp {

	@Test
	public void TestPopUp() throws InterruptedException {
		// Open browser
		System.setProperty("webdriver.chrome.driver", "D:/final driver/chromedriver.exe");
		// WebDriver driver= new ChromeDriver();
		ChromeDriver driver = new ChromeDriver();
		
		driver.get("https://www.jquery-az.com/boots/demo.php?ex=63.0_2");
		driver.findElement(By.xpath("//button[contains(@class,'multiselect')]")).click();
		/*
		//Thread.sleep(3000);
		driver.findElement(By.xpath("//button[contains(@class,'multiselect')]")).click();
		List<WebElement> list = driver
				.findElements(By.xpath("//ul[contains(@class,'multiselect-container')]//li//a//label"));
		System.out.println(list.size());
		for(int i=0; i<list.size();i++)
		{
			System.out.println(list.get(i).getText());
			if(list.get(i).getText().contains("Angular")){
				list.get(i).click();
				break;
				*/
				
			}
	
}
