package Package1;
import Package1.AppTest1;
import org.testng.annotations.Test;

public class AppTest2 {
	@Test(groups=("Sanity"))
	public void Test4()
	{
		System.out.println("Test B-4 - Added as sanity test for testing purpose");
	}
	
	@Test
	public void Test5()
	{
		System.out.println("Test B-5 ");
	}
	
	@Test
	public void Test6()
	{
		System.out.println("Test B-6");
	}

}
