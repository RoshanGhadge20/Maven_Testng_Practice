package Package1;

import org.testng.annotations.Test;

public class AppTest5 {

	@Test(timeOut = 4000)
	public void test15() {
		System.out.println("Calling test method with timeout parameter of 4000");
	}

	@Test(enabled = false)
	public void test16() {
		System.out.println("Calling test 16 method with test execution as false");
	}

	
	@Test(dependsOnMethods = "test15")
	public void test17() {
		System.out.println("Calling dependent method in testng ");
	}
	
	@Test(alwaysRun = true)
	public void test18() {
			System.out.println("Calling to always run method");
	}
}
