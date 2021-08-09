
package TestCases;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class HomePage {
	WebDriver driver;
	private static final String TimeUnuits = null;

	@BeforeMethod
	public void browserlaunch() throws Exception {
		System.setProperty("webdriver.chrome.driver","D:\\new selenium\\chromedriver_win32 (1)\\chromedriver.exe");
		
	driver = new ChromeDriver();
	driver.get("https://beginnersbook.com/java-tutorial-for-beginners-with-examples/");
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
	
	Thread.sleep(5000);
	String s1 =driver.findElement(By.xpath("//h1[@class='entry-title']")).getText();
	    	System.out.println(s1);
	}

	@Test
	public void login() throws Exception {
		
		
		System.out.println("Test pass");
		
		Thread.sleep(5000);
		
		String s1 =driver.findElement(By.xpath("//h1[@class='entry-title']")).getText();
		
		System.out.println("Test pass"+s1);
	}
	
	
}
