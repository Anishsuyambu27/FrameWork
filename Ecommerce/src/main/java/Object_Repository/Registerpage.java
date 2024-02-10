package Object_Repository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Registerpage extends basepage {

	public Registerpage(WebDriver driver) {
		super(driver);
	}


	@FindBy(xpath= "//div[@class='page-title']/h1")
	private WebElement pagetitle;

	@FindBy(id="gender-male")
	private WebElement GenderMaleRadioButton;

	@FindBy(id="gender-female")
	private WebElement GenderFemaleRadioButton;


	@FindBy(id="FirstName")
	private WebElement FirstNameTextField;

	@FindBy(id="LastName")
	private WebElement LastNameTextField;

	@FindBy(id="Email")
	private WebElement EmailTextField;

	@FindBy(id="Password")
	private WebElement PasswordTextField;

	@FindBy(id="ConfirmPassword")
	private WebElement ConfirmPasswordTextField;

	@FindBy(id="register-button")
	private WebElement Register_Button;



	public WebElement getPagetitle() {
		return pagetitle;
	}

	public WebElement getGenderMaleRadioButton() {
		return GenderMaleRadioButton;
	}

	public WebElement getGenderFemaleRadioButton() {
		return GenderFemaleRadioButton;
	}

	public WebElement getFirstNameTextField() {
		return FirstNameTextField;
	}

	public WebElement getLastNameTextField() {
		return LastNameTextField;
	}

	public WebElement getEmailTextField() {
		return EmailTextField;
	}

	public WebElement getPasswordTextField() {
		return PasswordTextField;
	}

	public WebElement getConfirmPasswordTextField() {
		return ConfirmPasswordTextField;
	}

	public WebElement getRegister_Button() {
		return Register_Button;
	}





}
