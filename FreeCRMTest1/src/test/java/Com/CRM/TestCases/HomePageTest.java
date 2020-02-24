package Com.CRM.TestCases;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import org.testng.annotations.Test;

import BaseTest.TestBase;
import CRM.QA.TestData.Admin;
import CRM.QA.TestData.HomePage;
import CRM.QA.TestData.Leave;
import CRM.QA.TestData.LoginPage;
import CRM.QA.TestData.PIM;
import CRM.QA.TestData.Time;


public class HomePageTest extends TestBase{
	
	
	HomePage homePage;
	LoginPage loginPage;
	Admin admn;
	PIM pimtest;
	Leave leavetest;
	Time timeTest;
	
	
	HomePageTest(){
		super();
	}
	
	@BeforeMethod
	
	public void setUp() {
		initiolization();
		loginPage = new LoginPage();
		homePage = loginPage.login(prop.getProperty("uname"), prop.getProperty("pWd"));
		admn = new Admin();
		pimtest = new PIM();
		leavetest = new Leave();
		timeTest = new Time();
		
	
	}

	@Test(priority = 1)
  public void verifyHopmePageTitle() {
		
		String homePageTitle =  homePage.verifyHomePageTitle();
		Assert.assertEquals(homePageTitle,"OrangeHRM", "HomePage Title not Matched");
  }
	
	@Test(priority = 2)
	public void verifyadmin() {
		admn = homePage.clickonAdmin();
		
		
	}

	@Test(priority = 3)
	public void verifyPIMTest1(){
		pimtest = homePage.clickonPIM();
	}
	@Test(priority = 4)
	public void verifyLeaveTest2(){
		leavetest = homePage.clickonLeave();
	}
	@Test(priority = 5)
	public void verifyTimeTest3(){
		timeTest = homePage.clickonTime();
	}
	
	@Test(priority = 6)
	public void validateEmpDetails() {
		pimtest = homePage.clickonPIM();
	homePage.verifyPIMvalues("suman", "01", "mallu");
		
		
		
	}
	
	
	 
			
	@AfterMethod
	public void HomePageaftermethod(){
		
	driver.quit();
		
	}
}
