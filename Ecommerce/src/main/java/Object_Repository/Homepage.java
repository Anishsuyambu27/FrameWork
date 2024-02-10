package Object_Repository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Homepage extends basepage {
	
	

	public Homepage(WebDriver driver) {
		super(driver);
	}

	@FindBy(partialLinkText = "Register")
	private WebElement registerlink;
	
	@FindBy(partialLinkText = "Log in")
	private WebElement loginlink;
	
	@FindBy(partialLinkText = "Shopping cart")
	private WebElement shoppingCartlink;
	
	@FindBy(partialLinkText = "Wishlist")
	private WebElement wishlistlink;
	
	@FindBy(partialLinkText = "BOOKS")
	private WebElement bookslinks;
	
	@FindBy(partialLinkText = "Computers")
	private WebElement computerlinks;
	

	@FindBy(xpath="//a[@class='ico-logout']")
	private WebElement logoutlink;
	
	
	
	public WebElement getLogoutlink() {
		return logoutlink;
	}

	public WebElement getRegisterlink() {
		return registerlink;
	}

	public WebElement getLoginlink() {
		return loginlink;
	}

	public WebElement getShoppingCartlink() {
		return shoppingCartlink;
	}

	public WebElement getWishlistlink() {
		return wishlistlink;
	}

	public WebElement getBookslinks() {
		return bookslinks;
	}

	public WebElement getComputerlinks() {
		return computerlinks;
	}

	
}
