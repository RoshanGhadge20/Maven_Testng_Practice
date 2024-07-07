package iRetryAnalyzer;

import org.testng.Assert;
import org.testng.annotations.Test;

public class retry_example 
{

	@Test(retryAnalyzer = iretryAnalyzer_example.class)
	public void sample() 
	{
		System.out.println("Calling form the sample method");
		Assert.assertTrue(false);
	}
	
}
