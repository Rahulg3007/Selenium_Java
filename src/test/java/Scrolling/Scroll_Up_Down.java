package Scrolling;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Scroll_Up_Down 
{
	public static void main(String[] args) throws InterruptedException {

		WebDriverManager.firefoxdriver().setup();
		
		WebDriver driver=new FirefoxDriver();

		driver.get("http://demo.guru99.com/test/guru99home/");
		driver.manage().window().maximize();
		Thread.sleep(2000);
		
		// down --> 2nd parameter +ve value
		((JavascriptExecutor) driver).executeScript("window.scrollBy(0,1000)");

		Thread.sleep(3000);
		
		// up --> 2nd parameter -ve value
		((JavascriptExecutor) driver).executeScript("window.scrollBy(0,-500)");
		
		Thread.sleep(2000);
		
		driver.quit();
		
	}
}
