package Scrolling;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ScrollDown_UptoPageBottom 
{
	public static void main(String[] args) throws InterruptedException {

		WebDriverManager.firefoxdriver().setup();
		
		WebDriver driver=new FirefoxDriver();

		// Launch the application
		driver.get("http://demo.guru99.com/test/guru99home/");

		  //This will scroll the web page till end.		
		((JavascriptExecutor)driver).executeScript("window.scrollTo(0, document.body.scrollHeight)");
	}
}

