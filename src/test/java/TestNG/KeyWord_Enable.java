package TestNG;

import org.testng.annotations.Test;

public class KeyWord_Enable 
{
	@Test
	public void m1()
	{
		System.out.println("Running method m1");
	}
	
	@Test(enabled = false)
	public void m2()
	{
		System.out.println("Running method m2");
	}
	
	@Test
	public void m3()
	{
		System.out.println("Running method m3");
	}
	
	@Test(enabled = false)
	public void m4()
	{
		System.out.println("Running method m4");
	}
}
