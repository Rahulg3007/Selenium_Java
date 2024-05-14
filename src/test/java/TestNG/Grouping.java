package TestNG;

import org.testng.annotations.Test;

public class Grouping 
{
	@Test(groups="profile")                  
	public void TC1()
	{
		System.out.println("--running profile TC1--");
	}
	
	@Test(groups="wishlist")              
	public void TC2()
	{
		System.out.println("--running wishlist TC2--");
	}
	
	@Test(groups="wishlist")                
	public void TC3()
	{
		System.out.println("--running wishlist TC3--");
	}
	
	@Test(groups="login")                
	public void TC4()
	{
		System.out.println("--running login TC4--");
	}
	
	@Test(groups="fund")               
	public void TC5()
	{
		System.out.println("--running fund TC5--");
	}
}
