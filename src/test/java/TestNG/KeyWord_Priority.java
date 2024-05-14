package TestNG;

import org.testng.annotations.Test;

public class KeyWord_Priority 
{
	@Test(priority = 1) //4
	public void m1()
	{
		System.out.println("Running method m1");
	}
	
	@Test(priority = 2) //5
	public void m2()
	{
		System.out.println("Running method m2");
	}
	
	@Test //default priority = 0 //3
	public void m3()
	{
		System.out.println("Running method m3");
	}
	
	@Test(priority = -3) //1
	public void m4()
	{
		System.out.println("Running method m4");
	}
	
	@Test(priority = -1) //2
	public void m5()
	{
		System.out.println("Running method m5");
	}
}
