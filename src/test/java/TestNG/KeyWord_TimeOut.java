package TestNG;

import org.testng.annotations.Test;

public class KeyWord_TimeOut 
{
	@Test(timeOut = 7000)
	public void m1() throws InterruptedException
	{
		Thread.sleep(5000);
		System.out.println("Running TC m1");
	}
}
