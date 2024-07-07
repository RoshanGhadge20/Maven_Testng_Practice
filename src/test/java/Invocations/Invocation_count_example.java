package Invocations;

import org.testng.annotations.Test;

public class Invocation_count_example {
	// Invocation count => For how many of times this method should get invoked
	// InvocationTimeout => Within the how much of time period this all method runs
	// should get happens
	// Skip failed invocations => This it will check that whether the method should
	// do continue to the execution
	// if the attribute is set to the "true". if attribute is set to the false then
	// it will stop the execution of test

	@Test(invocationCount = 10, invocationTimeOut = 500)
	public void m1() {
		System.out.println("Calling Test Method");
	}

	@Test(skipFailedInvocations = true)
	public void m2() {
		System.out.println("Calling Test Method");
	}
}
