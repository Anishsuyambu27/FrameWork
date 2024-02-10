package TestScript;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;
import Generic_libarary.Baseclass;
import Generic_libarary.UtilityMethods;
import Object_Repository.Bookspage;
import Object_Repository.Homepage;

public class booksTest extends Baseclass {
	@Test
	public void book_001() throws InterruptedException{
		Homepage homepage=new Homepage(driver);
		homepage.getBookslinks().click();
		Bookspage bookspage=new Bookspage(driver);
	
		UtilityMethods.selectOptionByIndex(bookspage.getPagesizeDropdown(), 2);

	
		
//		selectOptionByVisiableTest(bookspage.getShort_byDropdown(), "Price: Low to High");
		selectOptionByVale(bookspage.getShort_byDropdown(), "https://demowebshop.tricentis.com/books?orderby=6");
		Thread.sleep(2000);
		selectOptionByVale(bookspage.getViewAsDropdown(), "https://demowebshop.tricentis.com/books?viewmode=list");
		
	}
	
	@Test
	public void book002()
	{
		Homepage homepage=new Homepage(driver);
		homepage.getBookslinks().click();
		
		 WebElement sortby = driver.findElement(By.id("products-orderby"));
		   
		   Select select = new Select(sortby);
		   
		   select.selectByIndex(2);
		   select.selectByValue("https://demowebshop.tricentis.com/books?orderby=10");
		   
		   
		 

	}

}
