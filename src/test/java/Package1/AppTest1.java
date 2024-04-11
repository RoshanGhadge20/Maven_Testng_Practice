package Package1;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class AppTest1 {
	
	@Test(groups=("Sanity"))
	public void Test1()
	{
		System.out.println("Test A-1 - Added as sanity test for testing purpose");
	}
	
	@DataProvider(name="data_pro")
	@Test
	public Object[][] Test2() {
	    String name = "Roshan";
	    System.out.println("Test A-2 Calling Data provider method ") ;
	    return new Object[][] {{name}};
	}

	@Test (dataProvider="data_pro")
	public void Test3(String a)
	{
		System.out.println("data is fetched fom data provider method"+a);
	}

}
