package Object_Repository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPage extends basepage {
		
	public LoginPage(WebDriver driver) {
		super(driver);
	}

	public WebElement getEmailTextField() {
		return EmailTextField;
	}

	public WebElement getPasswordTextField() {
		return PasswordTextField;
	}

	public WebElement getRemberCheckbox() {
		return RemberCheckbox;
	}

	public WebElement getForgetPasswordLink() {
		return ForgetPasswordLink;
	}

	public WebElement getLoginButton() {
		return LoginButton;
	}

	@FindBy(id="Email")
	private WebElement EmailTextField;
	
	@FindBy(id="Password")
	private WebElement PasswordTextField;
	
	@FindBy(id="RememberMe")
	private WebElement RemberCheckbox;
	
	@FindBy(partialLinkText = "Forgot password?")
	private WebElement ForgetPasswordLink;
	
	@FindBy(css="[value='Log in']")
	private WebElement LoginButton;

}
