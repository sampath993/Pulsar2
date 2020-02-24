package BaseTest;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

import CRM.QA.Utile.TestUtil;




public class TestBase {

	public static WebDriver driver;
	public static Properties prop;
	
	public TestBase() {

		
		
	try {
		
		prop = new Properties();
		FileInputStream ip = new FileInputStream("C:\\sampathkumar\\FreeCRMTest1\\src\\main\\java\\CRM\\Config\\Config.CRM.Properties");
		prop.load(ip);
		
	}	catch (FileNotFoundException e) {
		
		e.printStackTrace();
	}catch (IOException e) {
		e.printStackTrace();
		
	}
		
	}
	
	
	 public static void initiolization() {
		  
		  String browserHome = prop.getProperty("browser");
		  
		  if (browserHome.equals("InternetExplorer")) {
		  System.setProperty("webdriver.ie.driver", "C:\\sampathkumar\\Selenium\\Softwares\\IEDriverServer.exe");
		   driver = new InternetExplorerDriver();  
		  }
		  
		   else if(browserHome.equals("InternetExplorer")) {
		  System.setProperty("webdriver.ie.driver", "C:\\sampathkumar\\Selenium\\Softwares\\IEDriverServer.exe");
		   driver = new InternetExplorerDriver();
		  
		  }
		  
			driver.manage().window().maximize();
			driver.manage().timeouts().pageLoadTimeout(TestUtil.Page_Load_TimeOut, TimeUnit.SECONDS);
			//driver.manage().deleteAllCookies();
			driver.manage().timeouts().implicitlyWait(TestUtil.Implicitly_wait, TimeUnit.SECONDS);
			driver.get(prop.getProperty("url"));
			
			
			
			//Alert alrt = driver.switchTo().alert();
        	//click on Ok button to use .accept();
        	//alrt.accept();
        	//click on Cancel button use dismiss();
        	//alrt.dismiss();
        	//verify text message.getText();
        //	alrt.getText();
        	
			
	 }

}
