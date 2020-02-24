package Com.CRM.TestCases;

import java.io.IOException;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import BaseTest.TestBase;
import CRM.QA.TestData.HomePage;
import CRM.QA.TestData.LoginPage;



public class LoginPageTest1 extends TestBase {
	
	HomePage homepage;
	
	
	LoginPageTest1(){
		
		super();
	}
	LoginPage login;
	
	
	@BeforeMethod
	
	public void setUp() throws IOException{
		//TestBase = new TestBase();
		initiolization();
		
		 login = new LoginPage();
		 
		 
	}


	@Test(priority = 1)
  public void loginPageTitle() {
		
		String title = login.validatingLoginPageTitle();
		Assert.assertEquals(title, "OrangeHRM");
  }
	
	@Test(priority = 2)
	public void Orange_Logo_Img_Test() {
		
		
	boolean flag =	login.validatingImage();
	Assert.assertTrue(flag);
	}
	
	@Test(priority = 3)
	public void LoginPage() {
		homepage = login.login(prop.getProperty("uname"), prop.getProperty("pWd"));
		
	}
	
	
	
	@AfterMethod
	public void TestDown() {
	driver.quit();
	}
	
	
}
