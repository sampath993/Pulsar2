package DataProvider;

import org.testng.annotations.Test;

import jxl.Sheet;
import jxl.Workbook;
import jxl.read.biff.BiffException;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;

public class datadriven {
	String[][] data=null;

	@DataProvider(name="logindata")
	  public String[][] loginDataProvider() throws BiffException, IOException{
		  data=GetExcelData();
		  return data;
	    }

	public String[][] GetExcelData() throws BiffException, IOException{
	  FileInputStream m=new FileInputStream("C:\\sampathkumar\\Selenium\\DataDriven.xls");
	  Workbook excel=Workbook.getWorkbook(m);
	  Sheet sheet=excel.getSheet("Sheet1");
	  int rowcount=sheet.getRows();
	  int columncount=sheet.getColumns();
	  
	  String[][] testdata=new String[rowcount-1][columncount-1];
	  
	  for(int i=1; i<rowcount; i++) {
		  for(int j=1; j<columncount;j++) {
			  testdata[i-1][j-1]=sheet.getCell(j, i).getContents();
		  }
	  }
	  
	  return testdata;
  }
  @Test(dataProvider = "logindata")
  public void logincheck(String uname, String pwd) {
	  System.setProperty("webdriver.chrome.driver", "C:\\sampathkumar\\Selenium\\Softwares\\chromedriver.exe");
		
  	WebDriver driver = new ChromeDriver();
  	driver.get("https://opensource-demo.orangehrmlive.com/");
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
		driver.manage().window().maximize();
		
		WebElement username=driver.findElement(By.id("txtUsername"));
		username.sendKeys(uname);
		
		WebElement password=driver.findElement(By.name("txtPassword"));
		password.sendKeys(pwd);
		
		WebElement loginbutton=driver.findElement(By.id("btnLogin"));
		loginbutton.click();
		
		driver.quit();
		  }

}
