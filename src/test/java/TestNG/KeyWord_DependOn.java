package TestNG;

import org.testng.annotations.Test;

public class KeyWord_DependOn 
{
	@Test
	public void login1()
	{
		System.out.println("running login1 TC");
	}
	
	@Test
	public void login2()
	{
		System.out.println("running login2 TC");
	}
	
	@Test(dependsOnMethods = "login1")
	public void logout1()
	{
		System.out.println("running logout1 TC");
	}
	
	@Test(dependsOnMethods = {"login1","login2"})
	public void logout2()
	{
		System.out.println("running logout2 TC");
	}
}
