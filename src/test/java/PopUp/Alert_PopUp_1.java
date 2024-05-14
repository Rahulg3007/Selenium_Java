package PopUp;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Alert_PopUp_1 
{
	public static void main(String[] args) throws InterruptedException 
	{
		WebDriverManager.firefoxdriver().setup();
		
		WebDriver driver = new FirefoxDriver();
		
		driver.get("https://demo.guru99.com/test/delete_customer.php");
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		//enter custID
		driver.findElement(By.xpath("//input[@name='cusid']")).sendKeys("112");
		
		//click on submit button
		driver.findElement(By.xpath("//input[@name='submit']")).click();
		
		Thread.sleep(2000);
		
		//get pop up text
		 String text = driver.switchTo().alert().getText();
		 System.out.println(text);
		 
		 //click on ok button
		 driver.switchTo().alert().accept();
		 
		 //click on cancel button
		// driver.switchTo().alert().dismiss();
		 
		 Thread.sleep(2000);
		 
		 //get text from 2nd popup
		 String text2 = driver.switchTo().alert().getText();
		 System.out.println(text2);
		 
		 //click on ok button from 2nd popup
		 driver.switchTo().alert().accept();
	}
}
