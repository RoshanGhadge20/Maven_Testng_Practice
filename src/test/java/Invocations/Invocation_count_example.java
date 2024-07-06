package Invocations;

import org.testng.annotations.Test;

public class Invocation_count_example 
{
	@Test(invocationCount = 10, invocationTimeOut = 500)
	public void m1()
	{
		System.out.println("Calling Test Method");
	}
	
	@Test(skipFailedInvocations = true)
	public void m2()
	{
		System.out.println("Calling Test Method");
	}
}
