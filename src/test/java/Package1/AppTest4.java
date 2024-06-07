package Package1;

import org.testng.annotations.Test;

public class AppTest4 {
	@Test(groups=("smoke"))
	public void Test10()
	{
		System.out.println("Test10 - Added as sanity test for testing purpose");
	}
	
	@Test(groups = ("smoke"))
	public void Test11()
	{
		System.out.println("Test11 - Added as sanity test for testing purpose");
	}
	
	public void Test12()
	{
		System.out.println("Test without added as smoke");
	}

}
