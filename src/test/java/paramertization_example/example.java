package paramertization_example;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class example 
{

	@Test(enabled = true)
	@Parameters({ "Username", "Password" })
	public void demo(String Username, String Password) {
		System.out.println("Example of parameterization");
		System.out.println("Username :- " + Username);
		System.out.println("Password :- " + Password);
	}

}
