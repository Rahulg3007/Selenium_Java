package Locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Xpath_By_Attribute 
{
		public static void main(String[] args) throws InterruptedException 
		{
			WebDriverManager.firefoxdriver().setup();
			
			WebDriver driver;
			
			driver = new FirefoxDriver();
			
			driver.get("https://www.facebook.com/login/");
			
			driver.findElement(By.xpath("//input[@name='email']")).sendKeys("abc123@gmail.com");
			
			Thread.sleep(2000);
			
			driver.findElement(By.xpath("//input[@name='pass']")).sendKeys("abc@123");
			
		}
	}
