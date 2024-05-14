package WebElement_Methods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class IsSelected 
{
	public static void main(String[] args) throws InterruptedException 
	{
		WebDriverManager.firefoxdriver().setup();
		
		WebDriver driver;
		
		driver = new FirefoxDriver();
		
		driver.get("https://www.facebook.com/login/");
		
		Thread.sleep(2000);
		
		//Click on Sign Up link
		driver.findElement(By.xpath("//a[text()='Sign up for Facebook']")).click();
		
		Thread.sleep(2000);
		
		//Click on radio button
		 boolean a = driver.findElement(By.xpath("//input[@value='2']")).isSelected();
		 
		 if(a==true)
		 {
			 System.out.println("Radio button is selected");
		 }
		 else
		 {
			 System.out.println("Radio button is not selected");
		 }
		
		driver.close();
		
	}
}
