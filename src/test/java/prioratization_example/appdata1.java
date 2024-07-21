package prioratization_example;

import org.bouncycastle.pkix.SubjectPublicKeyInfoChecker;
import org.testng.annotations.Test;

public class appdata1 
{
	@Test(priority = 1)
	public void demo1()
	{
		System.out.println("demo1");
	}
	
	@Test(priority = 2)
	public void demo2() 
	{
		System.out.println("demo2");
		
	}
	
	@Test(priority = 3)
	public void demo3() 
	{
		System.out.println("demo3");
	}
	
	@Test(enabled = false, priority = 4)
	public void demo4() 
	{
		System.out.println("demo4");
	}
	
}
