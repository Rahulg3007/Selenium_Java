package ActionClass;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Drag_And_Drop 
{
	public static void main(String[] args) throws InterruptedException 
	{
		WebDriverManager.firefoxdriver().setup();
		
		WebDriver driver;
		
		driver = new FirefoxDriver();
		
		driver.get("https://demo.guru99.com/test/drag_drop.html");
		
		Thread.sleep(2000);
		
		 WebElement ele1 = driver.findElement(By.xpath("(//a[@class='button button-orange'])[5]"));
		 
		  WebElement ele2 = driver.findElement(By.xpath("//ol[@id='bank']"));
		  
		  Thread.sleep(2000);
		  
		  Actions act = new Actions(driver);
		  
		  act.dragAndDrop(ele1, ele2).perform();
		 
		 
	}
}
