package TestNG;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class parallel_1 
{
	@Test
	public void browser1() throws InterruptedException
	{
	WebDriverManager.firefoxdriver().setup();
	
	WebDriver driver = new FirefoxDriver();
	
	driver.get("https://www.flipkart.com/");
	
	Thread.sleep(3000);
	
	driver.close();
}	
}
