package WebElement_Methods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class SendKeys 
{
	public static void main(String[] args) throws InterruptedException 
	{
		WebDriverManager.firefoxdriver().setup();
		
		WebDriver driver;
		
		driver = new FirefoxDriver();
		
		driver.get("https://www.facebook.com/login/");
		
		/*
		 * WebElement UN = driver.findElement(By.name("email"));
		 * UN.sendKeys("abc123@gmail.com");
		 * 
		 * WebElement PW = driver.findElement(By.name("pass")); 
		 * PW.sendKeys("abc@123");
		 */
		
		driver.findElement(By.name("email")).sendKeys("abc123@gmail.com");
		
		Thread.sleep(2000);
		
		driver.findElement(By.name("pass")).sendKeys("abc@123");
	}
}
