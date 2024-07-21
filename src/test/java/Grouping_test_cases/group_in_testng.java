package Grouping_test_cases;

import org.testng.annotations.Test;

public class group_in_testng 

{
	@Test(priority = 1, groups = "sanity")
	public void demo1()
	{
		System.out.println("demo1");
	}
	
	@Test(priority = 2, groups = "sanity")
	public void demo2() 
	{
		System.out.println("demo2");
		
	}
	
	@Test(priority = 3, groups = "smoke")
	public void demo3() 
	{
		System.out.println("demo3");
	}
	
	@Test(enabled = true, priority = 4, groups = "smoke")
	public void demo4() 
	{
		System.out.println("demo4");
	}
}
