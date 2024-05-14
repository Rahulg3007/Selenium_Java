package WebDriver_Waits;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Implicit_Wait 
{
	public static void main(String[] args) 
	{
		WebDriverManager.firefoxdriver().setup();
		
		WebDriver driver;
		
		driver = new FirefoxDriver();
		
		driver.get("https://www.google.com/");
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		WebElement searchBox = driver.findElement(By.xpath("//textarea[@id='APjFqb']"));
		searchBox.sendKeys("selenium");
		searchBox.sendKeys(Keys.ENTER);
		
		driver.findElement(By.xpath("(//h3[text()='Selenium'])[1]")).click();
	}
}
