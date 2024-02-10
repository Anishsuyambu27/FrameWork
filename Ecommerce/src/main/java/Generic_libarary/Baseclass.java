package Generic_libarary;

import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;

import com.relevantcodes.extentreports.ExtentReports;

import Object_Repository.Homepage;
import Object_Repository.LoginPage;

public class Baseclass extends UtilityMethods{
	
	
	public WebDriver driver;
	public ExtentReports report;
	
	@BeforeSuite
	public void beforsuite() {
		report=new ExtentReports("./reports/"+getSystemTimeandDate()+".html");
		
		System.out.println("before suite");
	}
	@BeforeTest
	public void beforetest()
	{
		System.out.println("before test");
	}
	@BeforeClass
	public void beforeclass( ) throws IOException
	{
		String browser=FileUtility.getProperty("browser");

		if(browser.equalsIgnoreCase("chrome")) 
			{
			
			driver=new ChromeDriver();
			}
			else if (browser.equalsIgnoreCase("firefox"))
			{
				driver= new FirefoxDriver();
			}
			else if (browser.equalsIgnoreCase("edge"))
			{
				driver=new EdgeDriver();
			}
			else			{
				driver=new ChromeDriver();
		}
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get(FileUtility.getProperty("url"));
		
		
	}
	@BeforeMethod
	public void beforemethod() throws IOException
	{
		
		Homepage homepage=new Homepage(driver);
		LoginPage login=new LoginPage(driver);
		
		homepage.getLoginlink().click();
		
		login.getEmailTextField().sendKeys(FileUtility.getProperty("email"));
		
		login.getPasswordTextField().sendKeys(FileUtility.getProperty("password"));
		
		login.getLoginButton().click();
		
	}
	@AfterMethod
	public void aftermethod()
	{
//		Homepage homepage= new Homepage(driver);
//		homepage.getLogoutlink().click();
		System.out.println("after method");
		
	}
	@AfterClass
	public void afterclass()
	{
		driver.quit();
	}
	@AfterTest
	public void aftertest()
	{
		System.out.println("after test");
	}
	@AfterSuite
	public void aftersuite()
	{
		report.flush();
		System.out.println("after suite");
	}


}
