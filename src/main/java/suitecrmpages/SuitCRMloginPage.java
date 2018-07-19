package suitecrmpages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SuitCRMloginPage {
	
	public SuitCRMloginPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(id="user_name")
	public WebElement userName;
	
	//if we add like that which exactly inspect Id, we dont need to add @FindBy
	//its search first by id then by name
	public WebElement username_password;
	
	@FindBy(id="bigbutton")
	public WebElement loginButton;
	
	public void login(String username, String password) {
		userName.sendKeys(username);
		username_password.sendKeys(password);
		loginButton.click();
	}
	
	
	

}
