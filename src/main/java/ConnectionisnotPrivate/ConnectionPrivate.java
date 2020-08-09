package ConnectionisnotPrivate;

import org.openqa.selenium.UnexpectedAlertBehaviour;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.Test;

public class ConnectionPrivate {
	
	@Test
	public void TestPopUp() throws Exception {
		
		/*DesiredCapabilities dc=new DesiredCapabilities();
		dc.setCapability(CapabilityType.ACCEPT_INSECURE_CERTS, true);
		ChromeOptions co=new ChromeOptions();
		co.merge(dc);
		System.setProperty("webdriver.chrome.driver", "D:/final driver/chromedriver.exe");
		
		WebDriver driver=new ChromeDriver(co);
		driver.manage().window().maximize();
		
		driver.get("https://www.cacert.org");
		
		System.out.println(driver.getTitle());*/
		
		
		
		ChromeOptions dc=new ChromeOptions();
		dc.setCapability(CapabilityType.ACCEPT_INSECURE_CERTS, true);
	
		System.setProperty("webdriver.chrome.driver", "D:/final driver/chromedriver.exe");
		
		WebDriver driver=new ChromeDriver(dc);
		driver.manage().window().maximize();
		
		driver.get("https://www.cacert.org");
		
		System.out.println(driver.getTitle());
		
		
		
		
		
		
		
		
		
	/*	ChromeOptions options = new ChromeOptions();
		options.setAcceptInsecureCerts(true);
		options.setUnhandledPromptBehaviour(UnexpectedAlertBehaviour.ACCEPT);
		System.setProperty("webdriver.chrome.driver", "D:/final driver/chromedriver.exe");
		WebDriver driver = new ChromeDriver(options);
		driver.get("https://www.cacert.org/");
	

		/*DesiredCapabilities cap = new DesiredCapabilities();
		cap.setCapability(CapabilityType.ACCEPT_SSL_CERTS, true);*/
		
		//WebDriver driver= new ChromeDriver(cap);
		
}
	}