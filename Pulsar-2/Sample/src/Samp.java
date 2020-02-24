import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Samp {

	public static void main(String[] args) {

		
		System.setProperty("webdriver.chrome.driver", "C:\\sampathkumar\\Selenium\\Softwares\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.google.com");
		

	}

}
