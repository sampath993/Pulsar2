package CRM.QA.TestData;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import BaseTest.TestBase;

public class LoginPage extends TestBase {

	

	@FindBy(id = "txtUsername")
	WebElement username;
	
	@FindBy(name = "txtPassword")
	WebElement password;
	
	@FindBy(xpath = "//input[@type='submit']")
	WebElement loginButton;
	@FindBy(xpath = "//img(contains(text(), '/webres_5d6f937c9c7169.68307390/themes/default/images/login/logo.png'))")
	WebElement Orangelog;
	
	//Initilizing the Page Objects	
	public LoginPage () {
		
		PageFactory.initElements(driver, this);
		
	}
	//Actions
	
	public String validatingLoginPageTitle() {
		
		return driver.getTitle();
		
	}
	
	public boolean validatingImage() {
		return Orangelog.isDisplayed();
		
		
	}
	
	public HomePage login(String uname, String pWd) {
		
		
		username.sendKeys(uname);
		password.sendKeys(pWd);
		loginButton.click();
		return new HomePage();
		
		
	}
	

}
