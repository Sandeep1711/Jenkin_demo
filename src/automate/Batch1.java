package automate;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.*;

public class Batch1 
{

	WebDriver driver;
	
	@Test(priority=0)
	public void launchBrowser()
	{
	 
		 System.setProperty("webdriver.chrome.driver", "D:\\Testing\\chromedriver.exe");
		  
		  driver = new ChromeDriver(); 
		
		driver.get("https://www.google.co.in/");
		
	}
	
	@Test(priority=1)
	public void getTitle()
	{
		String actual = driver.getTitle();
		
		System.out.println("Actual Title : "+actual);
	}
	
	
	@Test(priority=2)
	public void terminateBrowser()
	{
		driver.quit();
	}
	
}
