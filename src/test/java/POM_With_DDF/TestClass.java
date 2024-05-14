package POM_With_DDF;

import java.io.FileInputStream;
import java.io.IOException;
import java.time.Duration;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import io.github.bonigarcia.wdm.WebDriverManager;

public class TestClass
{
	public static void main(String[] args) throws InterruptedException, EncryptedDocumentException, IOException 
	{
		FileInputStream file = new FileInputStream("C:\\eclipse-workspace\\Java_And_Selenium\\Selenium_Code\\Excle\\TestData.XLSX");
		Sheet sh = WorkbookFactory.create(file).getSheet("DDF");
		
		WebDriverManager.firefoxdriver().setup();
		
		WebDriver driver;
		
		driver = new FirefoxDriver();
		
		driver.get("https://www.facebook.com/");
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		LoginPage d = new LoginPage(driver);
		
		String UserName = sh.getRow(0).getCell(0).getStringCellValue();
		d.enterUN(UserName);
		
		String password = sh.getRow(0).getCell(1).getStringCellValue();
		d.enterPWD(password);
		
		d.clickLoginButton();
		
	}
}
