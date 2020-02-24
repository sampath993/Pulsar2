package java.com.pulsar.base;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestBase {
	
	public static WebDriver driver;
	
	public static void initit()
    {
    
    	System.setProperty("webdriver.chrome.driver", "C:\\sampathkumar\\Selenium\\Softwares\\chromedriver.exe");
		
    	driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.get("http://pulsartest.twn.int.hp.com/Pulsar2");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//*[@id=\"accordionSidebar\"]/li[2]/a/span")).click();
		
    }
}
