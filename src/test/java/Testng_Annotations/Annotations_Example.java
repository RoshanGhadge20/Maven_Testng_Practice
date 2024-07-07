package Testng_Annotations;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterGroups;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeGroups;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.fasterxml.jackson.core.sym.Name;

public class Annotations_Example 
{
		
	
	@DataProvider(name = "data_provider_method")
	@Test
	public void m12()
	{
		System.out.println("Calling Test Method");
	}
	
	
	@Test(alwaysRun = true,dataProvider ="data_provider_method" )
	public void m1()
	{
		System.out.println("Calling Test Method");
	}
	
	@BeforeMethod
	public void m2()
	{
		System.out.println("Calling Before Method");
	}
	
	@AfterMethod
	public void m3()
	{
		System.out.println("Calling AFter Method");
	}
	
	@BeforeTest
	public void m4()
	{
		System.out.println("Calling Before Test Method");
	}
	
	@AfterTest
	public void m5()
	{
		System.out.println("Calling AFter Test Method");
	}
	
	
	@BeforeSuite
	public void m6()
	{
		System.out.println("Calling Before Suite Method");
	}
	
	
	@AfterSuite
	public void m7()
	{
		System.out.println("Calling After suite Method");
	}
	
	
	@BeforeClass
	public void m8()
	{
		System.out.println("Calling Before Class Method");
	}
	
	@AfterClass
	public void m9()
	{
		System.out.println("Calling AFter class Method");
	}
	
		
	@BeforeGroups
	public void m10()
	{
		System.out.println("Calling Before groups Method");
	}
	
	@AfterGroups
	public void m11()
	{
		System.out.println("Calling After groups Method");
	}
	
	/*
	 * Heirarchy of Execution 
	 * 1. Suite 
	 * 2. Before Test 
	 * 3. Class 
	 * 4. Method 
	 * 5. test
	 * 
	 */
}
