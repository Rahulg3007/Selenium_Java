package WebDriver_Waits;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Explicit_Wait_GenericMethod 
{
	
	public static WebElement waitForElementPresent(WebDriver driver, By locator, int timeout)
	{
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(timeout));
		wait.until(ExpectedConditions.presenceOfElementLocated(locator));
		
		return driver.findElement(locator);
	}
	
	public static void main(String[] args) 
	{
		WebDriverManager.firefoxdriver().setup();
		
		WebDriver driver;
		
		driver = new FirefoxDriver();
		
		
		driver.get("https://www.google.com/");

		
		WebElement searchBox = driver.findElement(By.xpath("//textarea[@id='APjFqb']"));
		searchBox.sendKeys("selenium");
		searchBox.sendKeys(Keys.ENTER);
		
		 By element = By.xpath("(//h3[text()='Selenium'])[1]");
		 
		 waitForElementPresent(driver, element, 10).click();
	}
}
