package TestNG;

import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Annotations
{
	@BeforeClass
	public void openBrowser()
	{
		Reporter.log("--------Open browser----------",true);
	}
	
	
	@BeforeMethod
	public void loginToApp()
	{
		Reporter.log("--login to app--",true);
	}
	
	@Test
	public void verifyUserID()
	{
		Reporter.log("running verifyUserID TC",true);
	}
	
	@Test
	public void verifyUserID1()
	{
		Reporter.log("running verifyUserID1 TC",true);
	}
	
	@AfterMethod
	public void logoutFromApp()
	{
		Reporter.log("--logout from App--",true);
	}
		

	@AfterClass
	public void closeBrowser()
	{
		Reporter.log("--------close browser----------",true);
	}
}
