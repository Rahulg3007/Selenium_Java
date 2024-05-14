package WebDriver_Waits;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Explicit_Wait 
{
	public static void main(String[] args) 
	{
		WebDriverManager.firefoxdriver().setup();
		
		WebDriver driver;
		
		driver = new FirefoxDriver();
		
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		
		driver.get("https://www.google.com/");

		
		WebElement searchBox = driver.findElement(By.xpath("//textarea[@id='APjFqb']"));
		searchBox.sendKeys("selenium");
		searchBox.sendKeys(Keys.ENTER);
		
		 WebElement element = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("(//h3[text()='Selenium'])[1]")));
		element.click();
	}
}
