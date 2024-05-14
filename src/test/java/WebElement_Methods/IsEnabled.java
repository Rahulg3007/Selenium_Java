package WebElement_Methods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class IsEnabled 
{
	public static void main(String[] args) throws InterruptedException 
	{
		WebDriverManager.firefoxdriver().setup();
		
		WebDriver driver;
		
		driver = new FirefoxDriver();
		
		driver.get("https://www.facebook.com/login/");
		
		Thread.sleep(2000);
		
		boolean a = driver.findElement(By.id("loginbutton")).isEnabled();
		
		if(a==true)
		{
			System.out.println("WebElement is Enabled");
		}
		else
		{
			System.out.println("WebElement is not Enabled");
		}
		
		Thread.sleep(2000);
		
		driver.close();
		
	}
}
