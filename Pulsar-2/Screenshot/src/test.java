import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class test {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "C:\\sampathkumar\\Selenium\\Softwares\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		driver.get("http://pulsartest.twn.int.hp.com/pulsarplus/today");
		

	}

}
