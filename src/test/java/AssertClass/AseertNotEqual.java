package AssertClass;

import org.testng.Assert;
import org.testng.annotations.Test;

public class AseertNotEqual 
{
	@Test
	public void m1()
	{
		String actResult = "Java";
		String expResult = "Python";
		
		Assert.assertNotEquals(actResult, expResult, "Failed: both results are same");
	}
}
