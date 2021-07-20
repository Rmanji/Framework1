
package TestCases;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class HomePage {

	private static final String TimeUnuits = null;

	@BeforeMethod
	public void browserlaunch() {
		System.setProperty("webdriver.chrome.driver","D:\\new selenium\\chromedriver_win32\\chromedriver.exe");
		
	WebDriver driver = new ChromeDriver();
	driver.get("https://www.intermiles.com/blog");
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
	    	
	}

	@Test
	public void login() {
		
		System.out.println("tEST 1 PASS");
	}
	
	
}
