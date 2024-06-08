package TestNG_Listners;

import org.testng.ITestListener;
import org.testng.ITestResult;

public class Mylistners implements ITestListener {

	public void onstart(ITestResult result) {
		System.out.println("Getting started with method :- " + result.getMethod());
	}

	public void onTestFailure(ITestResult result) {
		System.out.println("Method failed :- " + result.getMethod());
	}

	public void onTestSuccess(ITestResult result) {
		System.out.println("Method passed :- " + result.getName());
	}

	public void onFinish(ITestResult result) {
		System.out.println("All the test case execution has completed " + result.getMethod());
	}

}

//Methods of ITestListners 
/*
 * 1. OnTestStart() 2. OnTestSuccess() 3. OnTestFailure() 4. OnTestSkipped() 5.
 * OnTestFailedButWithinSuccessPercentage() 6. OnStart() 7. OnFinish()
 */