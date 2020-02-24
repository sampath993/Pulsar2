package CRM.QA.Utile;

import java.io.File;
import java.io.IOException;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

public class TestUtil {
	static WebDriver driver;
	
	public static long Page_Load_TimeOut=50;
	public static long Implicitly_wait =30;

	
	public static void takeScreenshotAtEndTest() throws IOException{
		
		File scrFile = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		String currentDir = System.getProperty("user_dlr");
		//FileUtils.copyFile(srcFile,  new File(currentDir + "/screenshots/" + System.currentTimeMillis() + ".png"));
	}
	
	
	
	
	
}
