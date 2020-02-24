package DemoPulsar.DemoPulsar2;

import java.util.concurrent.TimeUnit;

public class App 
{
    public static void main( String[] args )
    {

    	System.setProperty("webdriver.chrome.driver", "C:\\sampathkumar\\Selenium\\Softwares\\chromedriver.exe");
		
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.get("http://pulsartest.twn.int.hp.com/Pulsar2");
		    }
}
