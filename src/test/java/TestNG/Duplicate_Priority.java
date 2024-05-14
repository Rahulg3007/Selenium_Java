package TestNG;

import org.testng.annotations.Test;

public class Duplicate_Priority 
{
	@Test(priority = 1) //-->Duplicate priority = 1
	public void m1()
	{
		System.out.println("Running method m1");
	}
	
	@Test(priority = 1) //-->Duplicate priority = 1
	public void m2()
	{
		System.out.println("Running method m2");
	}
	
	@Test //default priority = 0 -->Duplicate priority = 0
	public void m3()
	{
		System.out.println("Running method m3");
	}
	
	@Test //default priority = 0 -->Duplicate priority = 0
	public void m4()
	{
		System.out.println("Running method m4");
	}
}
