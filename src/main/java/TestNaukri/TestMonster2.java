package TestNaukri;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class TestMonster2 {
	
	@Test
	public void TestPopUp() throws InterruptedException{
	// Open browser
		System.setProperty("webdriver.chrome.driver","D:/final driver/chromedriver.exe");
	    WebDriver driver= new ChromeDriver();
	    driver.get("https://www.monsterindia.com/rio/sign-out"); 
	    driver.manage().window().maximize();
	    driver.findElement(By.xpath("//input[@placeholder='E-mail/Mobile']")).sendKeys("mohitswar01@gmail.com");
	    driver.findElement(By.xpath("//input[@placeholder='Password']")).sendKeys("npav@123");
	    driver.findElement(By.xpath("//*[@id='signInbtn']")).click();
	    driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	    //driver.findElement(By.xpath("//*[@id='covid-header']/div/div[1]/div/div/div/div[1]/span")).click();
	    driver.findElement(By.xpath("//*[@id='stickySidebar']/div[1]/div/a")).click();
	    driver.findElement(By.xpath("//*[@id='user-profile-right']/div/div[2]/div[1]/div/div/div/a[2]")).click();
	    driver.findElement(By.xpath("//*[@id='profileThemeDefault']/div[1]/div[2]/div[6]/div/div/footer/div[2]/div")).click();
	    driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	    driver.findElement(By.xpath("//*[@id='user-profile-right']/div/div[2]/div[1]/div/a/i")).click();
	    driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	    driver.findElement(By.xpath("//*[@id='user-profile-right']/div/div[2]/div[1]/div/a/i")).click();
	    //driver.findElement(By.xpath("//*[@id='resume']")).sendKeys("D://RESUME//Resume Mohit Swar.doc");
	    driver.findElement(By.xpath("//*[@id='resume']")).click();
	}

}
