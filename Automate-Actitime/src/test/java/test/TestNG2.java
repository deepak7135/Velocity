package test;
import java.io.IOException;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.ITestResult;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import base.Base;
import junit.framework.Assert;
import pom.ActiTimeHome;
import pom.ActiTimeLogin;
import util.Utility;

public class TestNG2 extends Base {
	WebDriver driver;
	ActiTimeLogin  actiTimeLogin;
	ActiTimeHome actiTimeHome;		
	SoftAssert softassert;
		
	@BeforeTest
	@Parameters("browser")
	public void LaunchBrowser(String browser) {
			
	if(browser.equals("chrome")) {
			driver=OpenBrowserChrome();
		}
	}	
	  @BeforeClass 
	    public void LaunchBrower() {
		  actiTimeLogin = new ActiTimeLogin(driver);
		  actiTimeHome= new ActiTimeHome(driver);
		
	 // System.setProperty("webdriver.chrome.driver","C:\\Automation\\chromedriver.exe");
	//  driver = new ChromeDriver();
	 // driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
	    driver.get("http://localhost/login.do"); 
	    System.out.println("launch browser");
	    }
	    @BeforeMethod
	    public void LaunchlinkActi() {	    	
	     System.out.println("launch the mrthod");
	 	 actiTimeLogin = new ActiTimeLogin(driver);
	 	 
	 	 actiTimeLogin.textTag();
	 	 actiTimeLogin.passWardTag();
	 	 actiTimeLogin.loginButton();
	 	}	    
	    @Test	
	    public void VerifyUserTab() throws InterruptedException {
	  
	   
	    actiTimeHome.TaskButtonTab();
	   String url= driver.getCurrentUrl();
	    System.out.println(url); 
	    System.out.println("launch the url");
	 //   Assert.assertEquals(url,"http://localhost/administration/userlist.do" );  
	    
	  
	 //  boolean result= url.equals("http://localhost/administration/userlist.do");
	 //  Assert.assertTrue(result);
	 //  Assert.assertFalse(result);	 
	   // softassert.assertAll();
	        
	    actiTimeHome.ProjectandCustTab();
	    Thread.sleep(4000);
	    actiTimeHome.UserFirstName();
	    Thread.sleep(4000);
	    actiTimeHome.UserLastName();	 	    
	    Thread.sleep(4000);
	    actiTimeHome.CalenderSelect();
	    Thread.sleep(4000);
	    actiTimeHome.CalenderSe();
	    Thread.sleep(4000);
	    actiTimeHome.CalenderTab();
	    Thread.sleep(4000);
	    actiTimeHome. Calenderyear();
	    Thread.sleep(7000);
	    actiTimeHome.ColseForm();
	    Thread.sleep(4000);
	    driver.switchTo().alert().accept();
	    
	    }      
		@AfterMethod
	   public void logoutFiel(ITestResult result) throws IOException {
		if (ITestResult.FAILURE == result.getStatus())

{
	    Utility.takeScreenShot(driver);
}
		
	   actiTimeHome.logoutField();	 
	  System.out.println("launch the text");
   }	 
	    @org.testng.annotations.AfterClass 	   
	   public void AfterClas() {			

	  	  actiTimeLogin = null;
		  actiTimeHome= null;
			   
	    }
	    @AfterTest
	    
	    public void closeBrowser() {
	    	driver.quit();
	    }
		

}