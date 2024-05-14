package AssertClass;

import org.testng.Assert;
import org.testng.annotations.Test;


public class AssetEquals 

{
	@Test
	public void m1()
	{
		String actResult = "Java";
		String expResult = "Java";
		
		Assert.assertEquals(actResult, expResult, "Failed: both results are not same");
	}
}