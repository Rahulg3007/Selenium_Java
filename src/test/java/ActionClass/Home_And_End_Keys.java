package ActionClass;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Home_And_End_Keys 
{
	public static void main(String[] args) throws InterruptedException 
	{
		WebDriverManager.firefoxdriver().setup();
		
		WebDriver driver;
		
		driver = new FirefoxDriver();
		
		driver.get("https://the-internet.herokuapp.com/key_presses");
		
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//input[@id='target']")).click();

		Actions act = new Actions(driver);
		
		Thread.sleep(2000);
		
		act.sendKeys(Keys.HOME).perform();
		
		Thread.sleep(2000);
		
		act.sendKeys(Keys.END).perform();
	}
}
