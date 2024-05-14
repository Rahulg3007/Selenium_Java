package TestNG;

import org.testng.annotations.Test;

public class KeyWord_Invocation_Count 
{
	@Test(invocationCount = 5)
	public void m1()
	{
		System.out.println("Running method m1");
	}
}
