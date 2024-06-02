package Assertion_Practice;

import org.testng.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;	


import io.github.bonigarcia.wdm.WebDriverManager;

public class HardAssertions {

	@Test
	public void soft_assert() {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.geeksforgeeks.org/how-to-use-soft-asserts-in-testng/");
		String actualRersult = driver.getTitle();
		System.out.println(actualRersult);
		String expectedResult = "How to Use Soft Asserts in TestNG? - GeeksforGeeks";

		// Managing Assertions
		Assert.assertEquals(actualRersult, expectedResult,"Title matches");

		driver.quit();
		System.out.println("End of program code execution");
	}

}
