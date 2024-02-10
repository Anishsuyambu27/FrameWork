package ReportExample;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

public class reportexample {
	ExtentReports report=new ExtentReports("./reports/report.html");
	@Test
	public void test() {
	ExtentTest test=report.startTest("LoginTestScript");
	WebDriver driver=new ChromeDriver();
	test.log(LogStatus.INFO,"browser is launched" );
	driver.manage().window().maximize();
	test.log(LogStatus.INFO, "maximize");
	driver.get("https://google.com");
	test.log(LogStatus.INFO,"navigate to google webpage");
	
	test.log(LogStatus.INFO, "test script pass");
	
	report.endTest(test);
	report.flush();
	
	
	
	}
	
	
}
