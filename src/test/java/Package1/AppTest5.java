package Package1;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

public class AppTest5 {
    ExtentReports er;

    @BeforeClass
    public void generateReport() {
        er = new ExtentReports();
        String path = System.getProperty("user.dir") + "/ExtentReportdemo.html";
        ExtentSparkReporter reporter = new ExtentSparkReporter(path);
        reporter.config().setDocumentTitle("QA Report");
        reporter.config().setReportName("Extent Report ResultSet");
        er.attachReporter(reporter);
    }

    @Test(timeOut = 4000)
    public void test15() {
        ExtentTest et = er.createTest("test15");
        System.out.println("Calling test method with timeout parameter of 4000");
        er.flush();
    }

    @Test(enabled = false)
    public void test16() {
        ExtentTest et = er.createTest("test16");
        System.out.println("Calling test 16 method with test execution as false");
        er.flush();
    }

    @Test(dependsOnMethods = "test15")
    public void test17() {
        ExtentTest et = er.createTest("test17");
        System.out.println("Calling dependent method in testng ");
        er.flush();
    }

    @Test(alwaysRun = true)
    public void test18() {
        ExtentTest et = er.createTest("test18");
        System.out.println("Calling to always run method");
        er.flush();
    }
}
