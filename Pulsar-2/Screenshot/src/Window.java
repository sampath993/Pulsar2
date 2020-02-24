import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

import okio.Timeout;


public class Window {

	public static void main(String[] args) {

		
		
		
		System.setProperty("webdriver.chrome.driver", "C:\\sampathkumar\\Selenium\\Softwares\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
	driver.get("http://pulsartest.twn.int.hp.com/pulsarplus/today");
	driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		driver.manage().window().maximize();
	/***	 Actions act = new Actions(driver);
		act.click(driver.findElement(By.linkText("Marketing"))).build().perform();
		driver.findElement(By.linkText("Add New Product")).click();
		//driver.switchTo().window(); 
		***/
	//	Actions act1 = new Actions(driver);
		//act1.click(driver.findElement(By.id("cmdOK"))).build().perform();
		
	//		driver.findElement(By.id("cmdOK")).click();
		

		
		
	//driver.findElement(By.id("txtproductName")).sendKeys("sr");
	//driver.findElement(By.id("btnProductName")).click();
	
	//Actions act1 = new Actions(driver);
	
//	act1.click(driver.findElement(By.xpath("//img[contains(text(), 'middle')]"))).build().perform();

			
			/**driver.get("http://demo.guru99.com/test/newtours/register.php");
			
		Select drop = new Select(driver.findElement(By.name("country")));
		drop.selectByVisibleText("BAHAMAS");
		
		**/
		
		
			
			
			
			
			
			
			
	}

}
