package CRM.QA.TestData;


import java.io.IOException;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import BaseTest.TestBase;
import CRM.QA.Utile.TestUtil;

public class HomePage extends TestBase {
	
	@FindBy(xpath = "//b[contains(text(), 'Admin')]")
	WebElement admin1;
	
	@FindBy(xpath = "//b[contains(text(), 'PIM')]")
	WebElement pim1;

	@FindBy(xpath = "//b[contains(text(), 'menu_pim_Configuration')]")
	WebElement Optionalfind;
	
	@FindBy(xpath = "//b[contains(text(), 'Leave')]")
	WebElement leave1;
	
	@FindBy(xpath = "//b[contains(text(), 'Time')]")
	WebElement time1;
	@FindBy(xpath = "//b[contains(text(), 'Recruitment')]")
	WebElement recruitment1;
	
	@FindBy(id = "empsearch_employee_status")
	WebElement Sele;
	@FindBy(id = "empsearch_employee_name_empName")
	WebElement empName;
	@FindBy(id = "empsearch_id")
	WebElement empId;
	@FindBy(id = "empsearch_supervisor_name")
	WebElement superName;
	
	
	public HomePage() {
		
		PageFactory.initElements(driver, this);
	}
	
	public String verifyHomePageTitle() {
		return driver.getTitle();
	}

	public Admin verifyAdmin() {
	
		admin1.click();
		return new Admin();
	}
	
	public Admin clickonAdmin() {
		admin1.click();
		return new Admin();
	}
	
	public PIM clickonPIM() {
		pim1.click();
		return new PIM();
	}
	
	
	public Leave clickonLeave() {
		leave1.click();
		return new Leave();
	}
	
	public Time clickonTime() {
		time1.click();
		return new Time();
	}
	
	
	
	//public void clickOnPIM() {
		//Actions  action = new Actions(driver);
		//action.moveToElement(pim1).build().perform();
		//Optionalfind.click();
	//	empId.click();
		
	//}
	
	public void verifyPIMvalues(String empN , String empI , String emsur) {
	//	Select selct = new Select(driver.findElement(By.linkText("empsearch_employee_status")));
		//selct.selectByVisibleText("All");
		empName.sendKeys(empN);
		empId.sendKeys(empI);
		superName.sendKeys(emsur);
	}
	
	public void onException(Throwable error, WebDriver driver) {
		System.out.println("Exception occur" + error);
		try {
			TestUtil.takeScreenshotAtEndTest();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	
}
