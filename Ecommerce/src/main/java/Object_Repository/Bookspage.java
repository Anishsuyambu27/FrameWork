package Object_Repository;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Bookspage extends basepage{
	
	public Bookspage(WebDriver driver) {
		super(driver);
	}

	@FindBy(id="products-orderby")
	private WebElement Short_byDropdown;
	
	@FindBy(id="products-pagesize")
	private WebElement PagesizeDropdown;

	@FindBy(id="products-viewmode")
	private WebElement ViewAsDropdown;


	//all product images
	@FindBy(xpath = "//div[@class='picture']//img")
	private List<WebElement> allProductImages;

	//all add to cart button 
	@FindBy(css = "[value='Add to cart']")
	private List<WebElement> allAddTocartButtons;


	//computing And internet book-1
	//image
	@FindBy(xpath="//img[@alt='Picture of Computing and Internet']")
	private WebElement ComputingAndInternetBook_Image;

	//link
	@FindBy(xpath="//a[text()='Computing and Internet']")
	private WebElement ComputingAndInternetBook_Link;

	//rating
	@FindBy(xpath="//a[text()='Computing and Internet']/../..//div[@class='product-rating-box']")
	private WebElement ComputingAndInternetBook_Rating;

	//old-price
	@FindBy(xpath="//a[text()='Computing and Internet']/../..//div/span[@class='price old-price']")
	private WebElement ComputingAndInternetBook_OldPrice;

	//Actual-price
	@FindBy(xpath="//a[text()='Computing and Internet']/../..//div/span[@class='price actual-price']")
	private WebElement ComputingAndInternetBook_Actualprice;

	//add to cart button
	@FindBy(xpath="//a[text()='Computing and Internet']/../..//div/input[@value='Add to cart']")
	private WebElement ComputingAndInternetBook_Addtocart;


	//Copy of Computing and Internet EX BOOK-2
	//img
	@FindBy(xpath="//img[@alt='Picture of Copy of Computing and Internet EX']")
	private WebElement ComputingAndInternetEXBook_Image;
	//link
	@FindBy(xpath="//a[text()='Copy of Computing and Internet EX']")
	private WebElement ComputingAndInternetEXBook_Link;

	//rating
	@FindBy(xpath="//a[text()='Copy of Computing and Internet EX']/../..//div[@class='product-rating-box']")
	private WebElement ComputingAndInternetEXBook_Rating;

	//old-price
	@FindBy(xpath="//a[text()='Copy of Computing and Internet EX']/../..//div/span[@class='price old-price']")
	private WebElement ComputingAndInternetEXBook_OldPrice;

	//Actual-price
	@FindBy(xpath="//a[text()='Copy of Computing and Internet EX']/../..//div/span[@class='price actual-price']")
	private WebElement ComputingAndInternetEXBook_Actualprice;


	//Fiction-BOOK-3
	//image
	@FindBy(xpath="(//a/img[@alt='Picture of Fiction'])[2]")
	private WebElement FictionBook_Image;

	//link
	@FindBy(xpath="//div/a[text()='Fiction']")
	private WebElement FictionBook_Link;

	//rating
	@FindBy(xpath="//a[text()='Fiction']/../..//div[@class='product-rating-box']")
	private WebElement FictionBook_Rating;

	//old-price
	@FindBy(xpath="//a[text()='Fiction']/../..//div/span[@class='price old-price']")
	private WebElement FictionBook_OldPrice;

	//Actual-price
	@FindBy(xpath="//a[text()='Fiction']/../..//div/span[@class='price actual-price']")
	private WebElement FictionBook_Actualprice;

	//add to cart button
	@FindBy(xpath="//a[text()='Fiction']/../..//div/input[@value='Add to cart']")
	private WebElement FictionBook_Addtocart;


	//
	//Fiction EX-BOOK-4
	//image
	@FindBy(xpath="//a/img[@alt='Picture of Fiction EX']")
	private WebElement FictionEXBook_Image;

	//link
	@FindBy(xpath="//a[text()='Fiction EX']")
	private WebElement FictionEXBook_Link;

	//rating
	@FindBy(xpath="//a[text()='Fiction EX']/../..//div[@class='product-rating-box']")
	private WebElement FictionEXBook_Rating;

	//old-price
	@FindBy(xpath="//a[text()='Fiction EX']/../..//div/span[@class='price old-price']")
	private WebElement FictionEXBook_OldPrice;

	//Actual-price
	@FindBy(xpath="//a[text()='Fiction EX']/../..//div/span[@class='price actual-price']")
	private WebElement FictionEXBook_Actualprice;

	//add to cart button
	@FindBy(xpath="//a[text()='Fiction EX']/../..//div/input[@value='Add to cart']")
	private WebElement FictionEXBook_Addtocart;


	//HealthBook-5
	//image
	@FindBy(xpath="//a/img[@alt='Picture of Health Book']")
	private WebElement HealthBook_Image;

	//link
	@FindBy(xpath="//a[text()='Health Book']")
	private WebElement HealthBook_Link;

	//rating
	@FindBy(xpath="//a[text()='Health Book']/../..//div[@class='product-rating-box']")
	private WebElement HealthBook_Rating;

	//old-price
	@FindBy(xpath="//a[text()='Health Book']/../..//div/span[@class='price old-price']")
	private WebElement HealthBook_OldPrice;

	//Actual-price
	@FindBy(xpath="//a[text()='Health Book']/../..//div/span[@class='price actual-price']")
	private WebElement HealthBook_Actualprice;

	//add to cart button
	@FindBy(xpath="//a[text()='Health Book']/../..//div/input[@value='Add to cart']")
	private WebElement HealthBook_Addtocart;

	//ScienceBook-6
	//image
	@FindBy(xpath="//a/img[@alt='Picture of Science']")
	private WebElement ScienceBook_Image;

	//link
	@FindBy(xpath="//a[text()='Science']")
	private WebElement ScienceBook_Link;

	//rating
	@FindBy(xpath="//a[text()='Science']/../..//div[@class='product-rating-box']")
	private WebElement ScienceBook_Rating;

	//old-price
	@FindBy(xpath="//a[text()='Science']/../..//div/span[@class='price old-price']")
	private WebElement ScienceBook_OldPrice;

	//Actual-price
	@FindBy(xpath="//a[text()='Science']/../..//div/span[@class='price actual-price']")
	private WebElement ScienceBook_Actualprice;

	public WebElement getShort_byDropdown() {
		return Short_byDropdown;
	}

	public WebElement getPagesizeDropdown() {
		return PagesizeDropdown;
	}

	public WebElement getViewAsDropdown() {
		return ViewAsDropdown;
	}

	public List<WebElement> getAllProductImages() {
		return allProductImages;
	}

	public List<WebElement> getAllAddTocartButtons() {
		return allAddTocartButtons;
	}

	public WebElement getComputingAndInternetBook_Image() {
		return ComputingAndInternetBook_Image;
	}

	public WebElement getComputingAndInternetBook_Link() {
		return ComputingAndInternetBook_Link;
	}

	public WebElement getComputingAndInternetBook_Rating() {
		return ComputingAndInternetBook_Rating;
	}

	public WebElement getComputingAndInternetBook_OldPrice() {
		return ComputingAndInternetBook_OldPrice;
	}

	public WebElement getComputingAndInternetBook_Actualprice() {
		return ComputingAndInternetBook_Actualprice;
	}

	public WebElement getComputingAndInternetBook_Addtocart() {
		return ComputingAndInternetBook_Addtocart;
	}

	public WebElement getComputingAndInternetEXBook_Image() {
		return ComputingAndInternetEXBook_Image;
	}

	public WebElement getComputingAndInternetEXBook_Link() {
		return ComputingAndInternetEXBook_Link;
	}

	public WebElement getComputingAndInternetEXBook_Rating() {
		return ComputingAndInternetEXBook_Rating;
	}

	public WebElement getComputingAndInternetEXBook_OldPrice() {
		return ComputingAndInternetEXBook_OldPrice;
	}

	public WebElement getComputingAndInternetEXBook_Actualprice() {
		return ComputingAndInternetEXBook_Actualprice;
	}

	public WebElement getFictionBook_Image() {
		return FictionBook_Image;
	}

	public WebElement getFictionBook_Link() {
		return FictionBook_Link;
	}

	public WebElement getFictionBook_Rating() {
		return FictionBook_Rating;
	}

	public WebElement getFictionBook_OldPrice() {
		return FictionBook_OldPrice;
	}

	public WebElement getFictionBook_Actualprice() {
		return FictionBook_Actualprice;
	}

	public WebElement getFictionBook_Addtocart() {
		return FictionBook_Addtocart;
	}

	public WebElement getFictionEXBook_Image() {
		return FictionEXBook_Image;
	}

	public WebElement getFictionEXBook_Link() {
		return FictionEXBook_Link;
	}

	public WebElement getFictionEXBook_Rating() {
		return FictionEXBook_Rating;
	}

	public WebElement getFictionEXBook_OldPrice() {
		return FictionEXBook_OldPrice;
	}

	public WebElement getFictionEXBook_Actualprice() {
		return FictionEXBook_Actualprice;
	}

	public WebElement getFictionEXBook_Addtocart() {
		return FictionEXBook_Addtocart;
	}

	public WebElement getHealthBook_Image() {
		return HealthBook_Image;
	}

	public WebElement getHealthBook_Link() {
		return HealthBook_Link;
	}

	public WebElement getHealthBook_Rating() {
		return HealthBook_Rating;
	}

	public WebElement getHealthBook_OldPrice() {
		return HealthBook_OldPrice;
	}

	public WebElement getHealthBook_Actualprice() {
		return HealthBook_Actualprice;
	}

	public WebElement getHealthBook_Addtocart() {
		return HealthBook_Addtocart;
	}

	public WebElement getScienceBook_Image() {
		return ScienceBook_Image;
	}

	public WebElement getScienceBook_Link() {
		return ScienceBook_Link;
	}

	public WebElement getScienceBook_Rating() {
		return ScienceBook_Rating;
	}

	public WebElement getScienceBook_OldPrice() {
		return ScienceBook_OldPrice;
	}

	public WebElement getScienceBook_Actualprice() {
		return ScienceBook_Actualprice;
	}
	

}
