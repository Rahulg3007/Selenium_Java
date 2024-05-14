package Fetch_ExcleData;

import java.io.FileInputStream;
import java.io.IOException;
import java.time.Duration;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Test {
	public static void main(String[] args) throws EncryptedDocumentException, IOException {
		FileInputStream file = new FileInputStream(
				"C:\\eclipse-workspace\\Java_And_Selenium\\Selenium_Code\\Excle\\TestData.XLSX");
		
		Sheet sh = WorkbookFactory.create(file).getSheet("DDF");

		WebDriverManager.firefoxdriver().setup();

		WebDriver driver;

		driver = new FirefoxDriver();

		driver.get("https://www.facebook.com/");

		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

		// Enter UN
		//driver.findElement(By.id("email")).sendKeys(sh.getRow(0).getCell(0).getStringCellValue());
		String UN = sh.getRow(0).getCell(0).getStringCellValue();
		driver.findElement(By.id("email")).sendKeys(UN);

		
		 //Enter PWD 
		//driver.findElement(By.id("pass")).sendKeys(sh.getRow(0).getCell(1).getStringCellValue());
		 String PWD = sh.getRow(0).getCell(1).getStringCellValue();
		 driver.findElement(By.id("pass")).sendKeys(PWD);
		 

	}
}
