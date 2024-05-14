package Locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ClassName 
{
	public static void main(String[] args) throws InterruptedException 
	{
		WebDriverManager.firefoxdriver().setup();
		
		WebDriver driver;
		
		driver = new FirefoxDriver();
		
		driver.get("file:///C:/Manual_Autoamtion_Data/Manual_Autoamtion_Data/Practice_HTML/Example_For_Class.html");
		
		driver.findElement(By.className("abc123")).sendKeys("abc123@gmail.com");
		
		Thread.sleep(2000);
		
		driver.findElement(By.className("xyz123")).sendKeys("abc@123");
	}
}
