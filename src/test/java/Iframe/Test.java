package Iframe;

import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import io.github.bonigarcia.wdm.WebDriverManager;

public class Test 
{
	public static void main(String[] args) 
	{
		WebDriverManager.firefoxdriver().setup();
		
		WebDriver driver = new FirefoxDriver();
		
		driver.get("https://www.w3schools.com/js/tryit.asp?filename=tryjs_myfirst");
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		//driver.switchTo().frame(0);   //iframeIndex
		//driver.switchTo().frame("iframeResult"); //String frameName
		//driver.switchTo().frame("iframeResult"); //String frameID
		driver.switchTo().frame(driver.findElement(By.xpath("//iframe[@id='iframeResult']")));  //WebElement
		
		driver.findElement(By.xpath("//button[@type='button']")).click();
		
		//driver.switchTo().defaultContent();
		  driver.switchTo().parentFrame();
		
		driver.findElement(By.xpath("//a[@id='tryhome']")).click();
		
		driver.quit();
	}
}
