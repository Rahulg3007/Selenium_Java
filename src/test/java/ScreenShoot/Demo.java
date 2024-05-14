package ScreenShoot;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.io.FileHandler;

import io.github.bonigarcia.wdm.WebDriverManager;
import net.bytebuddy.utility.RandomString;

public class Demo 
{
	public static void main(String[] args) throws IOException 
	{
		WebDriverManager.firefoxdriver().setup();
		
		WebDriver driver = new FirefoxDriver();
		
		driver.get("https://facebook.com/");
		
		 File source = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		 
		  String rs = RandomString.make(1);
		 
		 File destination = new File("C:\\Manual_Autoamtion_Data\\Manual_Autoamtion_Data\\Selenium\\Screenshot\\"+rs+ ".jpg");
	
		 FileHandler.copy(source, destination);
	}
}
