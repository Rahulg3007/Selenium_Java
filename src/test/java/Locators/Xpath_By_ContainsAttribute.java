package Locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Xpath_By_ContainsAttribute 
{
	public static void main(String[] args) throws InterruptedException 
	{
		WebDriverManager.firefoxdriver().setup();
		
		WebDriver driver;
		
		driver = new FirefoxDriver();
		
		driver.get("https://www.facebook.com/login/");
		
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//input[contains(@placeholder,'Email')]")).sendKeys("abc123@gmail.com");
		
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//input[contains(@autocomplete,'current')]")).sendKeys("abc123");
	}
}
