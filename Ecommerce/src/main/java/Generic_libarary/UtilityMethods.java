package Generic_libarary;

import java.io.File;
import java.io.IOException;
import java.time.LocalDateTime;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.io.FileHandler;
import org.openqa.selenium.support.ui.Select;

public class UtilityMethods{
	 
	static Select selectoption;
	
	static Actions mouseaction;
	
	public static void selectOptionByIndex(WebElement dropdown,int index)
	{
		selectoption=new Select(dropdown);
		
		selectoption.selectByIndex(index);
	}
	
	public static void selectOptionByVale(WebElement dropdown, String value )
	{

		selectoption=new Select(dropdown);
		selectoption.selectByValue(value);
		
	}
	public static void selectOptionByVisiableText(WebElement dropdown,String text)
	{

		selectoption=new Select(dropdown);
		selectoption.selectByVisibleText(text);
	}

	public static void deSelectOptionByVisibleText(WebElement dropdown,String text)
	{

		selectoption=new Select(dropdown);
		selectoption.deselectByVisibleText(text);
	}
	
	public static void deSelectOptionByIndex(WebElement dropdown,int index)
	{
		selectoption=new Select(dropdown);
		
		selectoption.deselectByIndex(index);
	}
	
	public static void deSelectOptionByVale(WebElement dropdown, String value )
	{

		selectoption=new Select(dropdown);
		selectoption.deselectByValue(value);
		
	}
	
	public static void deselectall(WebElement dropdown)
	{
		selectoption=new Select(dropdown);
		selectoption.deselectAll();
	}
	
	public static void isMultiple(WebElement dropdown)
	{
		selectoption=new Select(dropdown);
		selectoption.isMultiple();
	}

	public static void getAllSelectedOption(WebElement dropdown)
	{
		selectoption=new Select(dropdown);
		List<WebElement> AllSelectedOptions = selectoption.getAllSelectedOptions();
		for (WebElement allselectedoption : AllSelectedOptions) {
			System.out.println(allselectedoption);
		}			
	}
	public static void getAllOption(WebElement dropdown) {
		selectoption=new Select(dropdown);
		List<WebElement> getalloptions = selectoption.getOptions();
		for (WebElement alloptions : getalloptions) {
			System.out.println(alloptions);
		}
	}
	//END OF DROPDOWN  METHODS
		
	//TO TAKE SCREENSHOT OF WEBPAGE
	public static void getWebpageScreenshot(WebDriver driver)
	{
		TakesScreenshot takesScreenshot=(TakesScreenshot) driver;
		
		File temp = takesScreenshot.getScreenshotAs(OutputType.FILE);
		
		File perm=new File("./Screenshots/"+getSystemTimeandDate()+".png");
		 
		try {
			FileHandler.copy(temp, perm);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	//TO TAKE SCREENSHOT OF WEBELEMENT:
	public static void getWebElementScreenshot(WebElement element)
	{
		File temp = element.getScreenshotAs(OutputType.FILE);
		
		File perment_file=new File("./Screenshots/"+getSystemTimeandDate()+".png");
		
		try {
			FileHandler.copy(temp, perment_file);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	//Get current time and date:
	public static String getSystemTimeandDate()
	{
		return LocalDateTime.now().toString().replace(":", "_").replace("-", "_");
	}
	
	//SWITCHING BY USING WINDOW TITLE:
	public static void switchtoWindowbyTitle(WebDriver driver, String title)
	{
		Set<String> allwindows = driver.getWindowHandles();
		
		for (String window : allwindows) {
			driver.switchTo().window(window);
			
			if(driver.getTitle().contains(title))	
			{
				break;
			}
			
		}
	}
	
	//SWITCHING BY USING WINDOW URL:
	public static void switchtoWindowbyUrl(WebDriver driver,String Url)
	{
		Set<String> allwindows = driver.getWindowHandles();
		
		for (String window : allwindows) {
			driver.switchTo().window(window);
			if(driver.getCurrentUrl().contains(Url))
			{
				break;
			}
		}
	}
	//SWITCH TO FRAME BY USING INDEX VALUE:
	public static void switchtoIFrameIndex(WebDriver driver,int index)
	{
		driver.switchTo().frame(index);
	}
	//SWITCH TO FRAME BY USING  WEBELEMENT
	public static void switchtoIFrameWebelement(WebDriver driver,WebElement element)
	{
		driver.switchTo().frame(element);
	}

	//SWITCH TO FRAME BY USING NAME OR ID VALUES
	public static void switchtoIFrameNameOrId(WebDriver driver,String nameOrid ) {
		driver.switchTo().frame(nameOrid);
	}
	
	public static void alertNotificationAccept(WebDriver driver)
	{
		driver.switchTo().alert().accept();
	}
	
	public static void alertNotificationDismiss(WebDriver driver)
	{
		driver.switchTo().alert().dismiss();
	}
	
	public static void alertNotificationSendkeys(WebDriver driver,String value)
	{
		driver.switchTo().alert().sendKeys(value);
	}
	
	public static void alertNotificationGetText(WebDriver driver)
	{
		driver.switchTo().alert().getText();
	}
	
	
	
}
