package POM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class DemoPage_Login 
{
	//Step 1-Declaration
	@FindBy(xpath = "//input[@id='email']") private WebElement UN; //private WebElement UN=driver.findElement(By.xpath(""));
	@FindBy(xpath = "//input[@id='pass']") private WebElement PWD; //private WebElement PWD=driver.findElement(By.xpath(""));
	@FindBy(xpath = "//button[text()='Log in']") private WebElement LoginButton; //private WebElement LoginButton=driver.findElement(By.xpath(""));
	
	//Step 2-Initialization
	public DemoPage_Login(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	//Step 3-Usage
	public void enterUN()
	{
		UN.sendKeys("Testuser");
	}
	
	public void enterPWD()
	{
		PWD.sendKeys("Test@123");
	}
	
	public void clickLoginButton()
	{
		LoginButton.click();
	}
}
