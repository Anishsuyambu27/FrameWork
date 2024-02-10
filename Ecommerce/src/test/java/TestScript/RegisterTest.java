package TestScript;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import Generic_libarary.Baseclass;
import Generic_libarary.ExcelUtility;
import Object_Repository.Homepage;
import Object_Repository.Registerpage;

public class RegisterTest extends Baseclass {
	@DataProvider
	public String[][] data() throws EncryptedDocumentException, IOException
	{
		return ExcelUtility.getrowData("Registerdata");
	}
	
	
	@Test(dataProvider = "data")
	public void register001(String firstName,String lastname,String email,String Password ,String Confirmpassword) throws InterruptedException
	{
		Homepage homepage=new Homepage(driver);
		Registerpage registerpage=new Registerpage(driver);
		
		
		homepage.getLogoutlink().click();
		Thread.sleep(1000);
		
		homepage.getRegisterlink().click();
		
		registerpage.getGenderMaleRadioButton().click();
		
		registerpage.getFirstNameTextField().sendKeys(firstName);
		
		registerpage.getLastNameTextField().sendKeys(lastname);
		
		registerpage.getEmailTextField().sendKeys(email);
		
		registerpage.getPasswordTextField().sendKeys(Password);
		
		registerpage.getConfirmPasswordTextField().sendKeys(Confirmpassword);
		
		registerpage.getRegister_Button().click();	
		
	}
	
}
