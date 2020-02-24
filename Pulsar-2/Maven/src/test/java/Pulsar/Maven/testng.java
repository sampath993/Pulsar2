package Pulsar.Maven;

import org.testng.annotations.Test;	
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;

public class testng {
	public static WebDriver driver;
	
	@Test
	  public void search1() {
		 System.out.print("Search1");
		 driver.findElement(By.xpath("//div[@id='logo-default']")).isDisplayed();
	  }
	  @Test
	  public void search2() {
			 System.out.print("Search2");
	  }
	  @Test
	  public void search3() {
		 System.out.print("Search3");
	  }
	  @BeforeMethod
	  public void beforeMethod() {
		  System.setProperty("webdriver.chrome.driver", "C:\\sampathkumar\\Selenium\\Softwares\\chromedriver.exe");
			
	    	driver = new ChromeDriver();
	    	driver.get("http://www.google.com");
			driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
			
			driver.manage().window().maximize();
			
	  }

	  @AfterMethod
	  public void afterMethod() {
		  System.out.println("after method");
	  }


	  @BeforeClass
	  public void beforeClass() {
		  System.out.println("before class");
	  }

	  @AfterClass
	  public void afterClass() {
		  System.out.println("after class");
	  }

	  @BeforeTest
	  public void beforeTest() {
		  System.out.println("before test");
	  }

	  @AfterTest
	  public void afterTest() {
		  System.out.println("after test");
	  }

	  @BeforeSuite
	  public void beforeSuite() {
		  System.out.println("before suite");
	  }

	  @AfterSuite
	  public void afterSuite() {
		  System.out.println("after suite");
	  }

}
