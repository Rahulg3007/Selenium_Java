package ChromeNotification;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Test
{
	public static void main(String[] args) throws InterruptedException 
	{
		FirefoxOptions option = new FirefoxOptions();
		
		WebDriverManager.firefoxdriver().setup();
		
		WebDriver driver = new FirefoxDriver(option);
		
		driver.get("https://www.justdial.com/Pune/Bakeries/");
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		Thread.sleep(2000);
		
		driver.quit();
	}
}
