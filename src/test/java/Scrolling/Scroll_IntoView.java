package Scrolling;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Scroll_IntoView 
{
	public static void main(String[] args) throws InterruptedException {

		WebDriverManager.firefoxdriver().setup();
		
		WebDriver driver=new FirefoxDriver();

		// Launch the application
		driver.get("http://demo.guru99.com/test/guru99home/");

		// find Facebook webelement
		WebElement facebook = driver.findElement(By.xpath("//a[text()='Facebook']"));
		
		Thread.sleep(3000);
		
		// This will scroll the page till the element is found
		((JavascriptExecutor)driver).executeScript("arguments[0].scrollIntoView();", facebook);
	}
}
