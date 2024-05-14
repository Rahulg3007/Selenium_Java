package Scrolling;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Scroll_Left_Right 
{
	
	public static void main(String[] args) throws InterruptedException {

		WebDriverManager.firefoxdriver().setup();
		
		WebDriver driver=new FirefoxDriver();

		driver.get("http://demo.guru99.com/test/guru99home/");
		driver.manage().window().maximize();
		Thread.sleep(2000);
		
		Thread.sleep(3000);
		//right  --> 1st parameter +ve value
		((JavascriptExecutor)driver).executeScript("window.scrollBy(300,0)");


		Thread.sleep(3000);
		//left  --> 1st parameter -ve value
		((JavascriptExecutor)driver).executeScript("window.scrollBy(-300,0)");
		
		
	}
}
