package WebDriver_Methods;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Close_And_Quit_Method 
{
	public static void main(String[] args) throws InterruptedException 
	{
		WebDriverManager.firefoxdriver().setup();
		
		WebDriver driver;
		
		driver = new FirefoxDriver();
		
		driver.get("https://www.amazon.in/");
		
		Thread.sleep(3000);
		
		driver.switchTo().newWindow(WindowType.TAB);
		
		Thread.sleep(3000);
		
		driver.get("https://www.flipkart.com/");
		
		Thread.sleep(3000);
		
		driver.switchTo().newWindow(WindowType.TAB);
		
		Thread.sleep(3000);
		
		driver.get("https://www.myntra.com/");
		
		Thread.sleep(3000);
		
		driver.close(); //Close Current Tab
		
		Thread.sleep(3000);
		
		driver.quit(); //Close browser
	}
}
