package WebDriver_Waits;

import java.time.Duration;
import java.util.NoSuchElementException;
import java.util.function.Function;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Fluent_Wait
{
	public static void main(String[] args) 
	{
		WebDriverManager.firefoxdriver().setup();
		
		WebDriver driver;
		
		driver = new FirefoxDriver();
		
		//Fluent Wait Declaration
		Wait<WebDriver> mywait = new FluentWait<WebDriver>(driver)
				.withTimeout(Duration.ofSeconds(30))
				.pollingEvery(Duration.ofSeconds(5))
				.ignoring(NoSuchElementException.class);
		
		
		driver.get("https://www.google.com/");

		
		WebElement searchBox = driver.findElement(By.xpath("//textarea[@id='APjFqb']"));
		searchBox.sendKeys("selenium");
		searchBox.sendKeys(Keys.ENTER);
	
		//Usage of Fluent Wait
		WebElement element = mywait.until(new Function<WebDriver, WebElement>() {
			public WebElement apply(WebDriver driver) {
				return driver.findElement(By.xpath("(//h3[text()='Selenium'])[1]"));
			}
		});
		
		element.click();
	}	
}
