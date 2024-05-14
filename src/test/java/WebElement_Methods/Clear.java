package WebElement_Methods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Clear 
{
	public static void main(String[] args) throws InterruptedException 
	{
		WebDriverManager.firefoxdriver().setup();
		
		WebDriver driver;
		
		driver = new FirefoxDriver();
		
		driver.get("https://www.facebook.com/login/");
		
		driver.findElement(By.name("email")).sendKeys("abc123@gmail.com");
		
		Thread.sleep(2000);
		
		driver.findElement(By.name("email")).clear();
		
		Thread.sleep(2000);
		
		driver.findElement(By.name("email")).sendKeys("xyz321@gmail.com");
		
		Thread.sleep(2000);
		
		driver.findElement(By.name("email")).clear();
		
		Thread.sleep(2000);
		
		driver.findElement(By.name("pass")).sendKeys("xyz@321");
	}
}
