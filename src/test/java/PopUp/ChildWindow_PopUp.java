package PopUp;

import java.awt.Desktop.Action;
import java.time.Duration;
import java.util.ArrayList;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ChildWindow_PopUp 
{
	public static void main(String[] args) throws InterruptedException 
	{
		WebDriverManager.firefoxdriver().setup();
		
		WebDriver driver;
		
		driver = new FirefoxDriver();
		
		driver.get("https://skpatro.github.io/demo/links/");
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.findElement(By.xpath("//input[@name='NewWindow']")).click();
		
		//Get all windows ID
		 Set<String> allID = driver.getWindowHandles();
		 
		 //Get Window ID
		 ArrayList<String> al = new ArrayList<String>(allID);
		
		  String mainWindow = al.get(0);
		  String childWindow = al.get(1);
		  
		  //Switch focus to childWindow
		  driver.switchTo().window(childWindow);
		  
		  driver.manage().window().maximize();
		  
		  //Click on Home
		  
		  driver.findElement(By.xpath("(//span[text()='HOME'])[1]")).click();
		  
		  Thread.sleep(2000);
		  
		  driver.close();
		  
		  System.out.println("Child Window Closed");
		  
		  Thread.sleep(2000);
		  
		  //Switch focus to mainWindwo
		  driver.switchTo().window(mainWindow);
		  
		  driver.quit();
		  
		  System.out.println("Main window closed");
		  
		  
		  
		  
		
		
	}
}
