package Package1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class parameterization_practice 
{
	@Test
	@Parameters({"browser","url_link"})
	public void start(String browserName, String URL) 
	{
		if (browserName.equalsIgnoreCase("Chrome")) 
		{
			WebDriverManager.chromedriver().setup();
			WebDriver driver = new ChromeDriver();
			driver.get(URL);
			System.out.println("Navigated to the respective page ");
			driver.close();
			
		}
	}
}
