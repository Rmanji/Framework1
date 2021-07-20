package TestCases;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Parallel {
	WebDriver driver;
	@BeforeTest
	public void browserlaunch() {
		System.setProperty("webdriver.chrome.driver","D:\\new selenium\\chromedriver_win32\\chromedriver.exe");
		
	driver = new ChromeDriver();
	driver.get("https://spicejet.com");
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
	}
	
	
	 @Test    
	    public void executSessionOne(){
	            //First session of WebDriver
		 System.setProperty("webdriver.chrome.driver","D:\\new selenium\\chromedriver_win32\\chromedriver.exe");
			

	            WebDriver driver = new ChromeDriver();
	            //Goto guru99 site
	            driver.get("http://demo.guru99.com/V4/");
	            //find user name text box and fill it
	            driver.findElement(By.name("uid")).sendKeys("Driver 1");
	            
	        }
	        
	    @Test    
	        public void executeSessionTwo(){
	            //Second session of WebDriver
	    	System.setProperty("webdriver.chrome.driver","D:\\new selenium\\chromedriver_win32\\chromedriver.exe");
			

	         driver = new ChromeDriver();
	            //Goto guru99 site
	        driver.get("http://demo.guru99.com/V4/");
	        //find user name text box and fill it
	        driver.findElement(By.name("uid")).sendKeys("Driver 2");
	        
	        }
	        
	    @Test    
	        public void executSessionThree(){
	            //Third session of WebDriver
	    	System.setProperty("webdriver.chrome.driver","D:\\new selenium\\chromedriver_win32\\chromedriver.exe");
			

	        driver = new ChromeDriver();
	            //Goto guru99 site
	        driver.get("http://demo.guru99.com/V4/");
	        //find user name text box and fill it
	        driver.findElement(By.name("uid")).sendKeys("Driver 3");
	        
	        }        
	
}
