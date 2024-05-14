package TestNG;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class Emailable_Report 
{
	@Test
	public void m1()
	{
		Reporter.log("Running test case m1",true);
	}
	
	@Test
	public void m2()
	{
		Reporter.log("Running test case m2",true);
	}
}
