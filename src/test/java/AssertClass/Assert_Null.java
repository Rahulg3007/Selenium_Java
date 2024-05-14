package AssertClass;

import org.testng.Assert;
import org.testng.annotations.Test;

public class Assert_Null 
{
	@Test
	public void a()
	{
		String s1 = "abc";
		
		Assert.assertNotNull(s1,"Failed - s1 is null");
	}
	
	@Test
	public void b()
	{
		String s2 = null;
		
		Assert.assertNull(s2,"Failed - s2 is not null");
	}
}
