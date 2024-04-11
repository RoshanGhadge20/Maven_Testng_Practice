package Package1;

import org.testng.annotations.Test;

public class AppTest3 {
	@Test(groups=("Sanity"))
	public void Test7()
	{
		System.out.println("Test C-7 - Added as sanity test for testing purpose");
	}
	
	@Test()
	public void Test8()
	{
		System.out.println("Test C-8");
	}
	@Test (enabled=false)
	public void Test9()
	{
		System.out.println("Test C-9");
	}

}
