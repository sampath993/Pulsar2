package Marketing;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Com.Qa.Base.Base;

public class Monitors extends Base{


	public  Monitors() {

		PageFactory.initElements(driver, this);


	}

	@FindBy(xpath="//div[@id='Marketing']//a[@class='GenericMenuGroup--content--item--link']//span[contains(text(), ' Monitors')]")
	WebElement Monitors;

	@FindBy(xpath="//span[contains(text(), 'Monitors')]")
	WebElement titleName;


	@FindBy(xpath="//a[contains(text(), 'javascript:MonitorProperties(279)')]")
	WebElement genericName;




	public void CreatingMonitors() {
		Monitors.click();
		titleName.isSelected();
		//	genericName.click();



	}





}
