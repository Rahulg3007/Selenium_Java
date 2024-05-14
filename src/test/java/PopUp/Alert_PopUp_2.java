package PopUp;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Alert_PopUp_2 
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
		 Alert alt = driver.switchTo().alert();
		 String text = alt.getText();
		 System.out.println(text);
		 
		 //click on ok button
		 alt.accept();
		 
		 //click on cancel button
		// alt.dismiss();
		 
		 Thread.sleep(2000);
		 
		 //get text from 2nd popup
		 Alert alt2 = driver.switchTo().alert();
		 String text2 = alt.getText();
		 System.out.println(text2);
		 
		 //click on ok button from 2nd popup
		 alt.accept();
	}
}
