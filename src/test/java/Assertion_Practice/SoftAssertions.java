package Assertion_Practice;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import io.github.bonigarcia.wdm.WebDriverManager;

public class SoftAssertions {

	@Test
	public void soft_assert() {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.geeksforgeeks.org/how-to-use-soft-asserts-in-testng/");
		String actualRersult = driver.getTitle();
		String expectedResult = "GeeksforGeeks";

		// Creating an assertion initialization
		SoftAssert sa = new SoftAssert();

		// Managing Assertions
		sa.assertEquals(actualRersult, expectedResult, "Title is matched");

		driver.quit();
		System.out.println("End of program code execution");
	}

}
