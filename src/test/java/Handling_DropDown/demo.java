package Handling_DropDown;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class demo
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
		
		WebElement month = driver.findElement(By.xpath("//select[@id='month']"));
		
		Select m = new Select(month);
		
		//m.selectByVisibleText("Jul");
		
		//m.selectByValue("7");
		
		//m.selectByIndex(6);
		
		
		 List<WebElement> alloptions = m.getOptions();
		 
		for(WebElement options :alloptions)
		{
			if(options.getText().equals("Jul"))
			{
				options.click();
				break;
			}
		}	
		
	}
	
}
