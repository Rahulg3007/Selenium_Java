package AssertClass;

import org.testng.Assert;
import org.testng.annotations.Test;

public class Assert_True_And_False
{
	@Test
	public void m1()
	{
		boolean actResult1 = true;
		
		Assert.assertTrue(actResult1, "Failed - actResult = true");
	}
	
	@Test
	public void m2()
	{
		boolean actResult2 = false;
		
		Assert.assertFalse(actResult2, "Failed - actResult2 = false");
	}
}
