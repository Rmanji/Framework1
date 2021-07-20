package TestCases;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class BrokenLinks {
	WebDriver driver;
	
	public void verifyUrl(String linkurl)
	{
		try {
			URL ur = new URL(linkurl);
			HttpURLConnection huc = (HttpURLConnection)ur.openConnection();
			huc.setConnectTimeout(5000);
			huc.connect();
			if(huc.getResponseCode()>=400) {
				
				System.out.println("Broken url"+huc.getResponseCode()+" "+linkurl);
				
				
			}else {
				
				System.out.println("link"+" "+huc.getResponseCode()+" "+linkurl);
			}
			
			
		} catch (MalformedURLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	
	@BeforeMethod
	public void browserlaunch() {
		System.setProperty("webdriver.chrome.driver","D:\\new selenium\\chromedriver_win32\\chromedriver.exe");
		
	driver = new ChromeDriver();
	driver.get("https://spicejet.com");
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
	    	
	}
	@Test
	public void Alllinks() {
		
		List<WebElement> links = driver.findElements(By.tagName("a"));
		System.out.println("count url "+links.size());
		Iterator<WebElement> it = links.iterator();
		while(it.hasNext())
		{
			String url = it.next().getAttribute("href");
			System.out.println(url);
			
			BrokenLinks br = new BrokenLinks();
			br.verifyUrl(url);
			
		}
		
	}

}
