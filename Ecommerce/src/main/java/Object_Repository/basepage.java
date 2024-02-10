package Object_Repository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class basepage {
	
	public basepage(WebDriver driver) {
		PageFactory.initElements(driver,this);
	}

}
