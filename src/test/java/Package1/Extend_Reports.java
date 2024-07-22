package Package1;

import org.testng.annotations.AfterClass;
import org.testng.annotations.Test;
import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import io.github.bonigarcia.wdm.WebDriverManager;

public class Extend_Reports {
	 ExtentReports ex;
	
	public void  Reportgeneration() {
		new ExtentReports();
		String path=System.getProperty("User.dir")+"ExtentReport.html";
		ExtentSparkReporter reporter=new ExtentSparkReporter(path);
		WebDriverManager.chromedriver().setup();
		//WebDriver driver=new ChromeDriver();
		
		reporter.config().setReportName("Web Automation Report");
		reporter.config().setDocumentTitle("Extent Report ResultSet");
		
		ex.attachReporter(reporter);
		ex.setSystemInfo("QA Eng.", "Roshan Ghadge");
	
	}
	
	@Test
	public void getdata()
	{
		ExtentTest ts=ex.createTest("getdata");
		System.out.println("Calling getdata method");
		ex.flush();
	}
	
	/*
	 * @Test public void setdata() { ExtentTest ts1=ex.createTest("Setdata");
	 * System.out.println("Calling setdata method"); ex.flush(); }
	 * 
	 * @Test public void showdata() { ExtentTest ts2=ex.createTest("showdata");
	 * System.out.println("Calling sedata method"); ex.flush(); }
	 */
	
	/*
	 * @AfterClass public void tearDown() { //driver.quit(); ex.flush(); }
	 */
	
	/*
	 * Selenium provides built-in reporting capabilities through frameworks like TestNG, JUnit, and 
	 * more. While these built-in reports offer basic information, custom reporting is often 
	 * necessary to provide detailed insights into test execution.
	 * To help generate custom reports and make them more presentable, you can use 
	 * Extent Reports.
	 * 
	 */
	 */
}
