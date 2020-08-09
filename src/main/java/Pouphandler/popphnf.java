package Pouphandler;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class popphnf {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver","D:/final driver/chromedriver.exe");
	    WebDriver driver= new ChromeDriver();
	    driver.get("http://www.popuptest.com/goodpopups.html"); 
	    driver.manage().window().maximize();
	    driver.findElement(By.xpath("/html/body/table[2]/tbody/tr/td/font/b/a[3]")).click();
	    Set<String> handler =driver.getWindowHandles();
		
	   Iterator<String> it =handler.iterator();
	   String parentWindowId=it.next();
	   System.out.println( "Parent Window Id" +parentWindowId);
	   
	   String childWindowId=it.next();
	   System.out.println( "Child Window Id" +childWindowId);
	   
	   driver.switchTo().window(childWindowId);
	   System.out.println("Child Window poup title"+ driver.getTitle());
	   driver.close();
	   
	}

}
