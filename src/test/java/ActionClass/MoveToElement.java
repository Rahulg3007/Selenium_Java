package ActionClass;

import java.awt.Desktop.Action;
import java.awt.event.ActionEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class MoveToElement 
{
	public static void main(String[] args) throws InterruptedException 
	{
		WebDriverManager.firefoxdriver().setup();
		
		WebDriver driver;
		
		driver = new FirefoxDriver();
		
		driver.get("https://www.flipkart.com/");
		
		driver.manage().window().maximize();
		
		Thread.sleep(2000);
		
		 WebElement loginbtn = driver.findElement(By.xpath("//a[@title='Login']"));
		 
		 Thread.sleep(2000);
		 
		 //click on gift card options
		 
		 Actions act = new Actions(driver);
		 
		 //move to login button
		 
		 act.moveToElement(loginbtn).perform();
		 
		 Thread.sleep(2000);
		 
		 driver.findElement(By.xpath("//li[text()='Gift Cards']")).click();
	}
}
