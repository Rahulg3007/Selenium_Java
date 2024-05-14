package AssertClass;

import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class Soft_Assertion 
{
	@Test
	public void softAssert()
	{		
		SoftAssert soft=new SoftAssert();		
		
		String actResult="Hi";
		String expResult="Hello";
		soft.assertEquals(actResult, expResult,"Failed1: both results are diff: ");
				
		boolean actResult1=false;
		soft.assertTrue(actResult1,"Failed2: actResult is false");
		
		soft.assertAll();
	}
}
