package WebDriver_Methods;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class GetTitle 
{
	public static void main(String[] args) 
	{
		WebDriverManager.firefoxdriver().setup();
		
		WebDriver driver;
		
		driver = new FirefoxDriver();
		
		driver.get("https://www.amazon.in/");
		
		String title = driver.getTitle();
		
		System.out.println(title);
	}
}
