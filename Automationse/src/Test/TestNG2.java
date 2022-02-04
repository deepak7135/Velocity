package Test;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import pom.ActiTimeHome;
import pom.ActiTimeLogin;

public class TestNG2 {
	WebDriver driver;
	ActiTimeLogin  actiTimeLogin;
	ActiTimeHome actiTimeHome;	
	SoftAssert softassert;
	  @BeforeClass 
	    public void LaunchBrower() {
		System.out.println("launch browser");
	    System.setProperty("webdriver.chrome.driver","C:\\Automation\\chromedriver.exe");
	    driver = new ChromeDriver();
	  //  driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
	    driver.get("http://localhost/login.do");
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
	    System.out.println("launch the text");
	    actiTimeHome= new ActiTimeHome(driver);
	    actiTimeHome.TaskButtonTab();
	    String url= driver.getCurrentUrl();
	    System.out.println(url); 
	    System.out.println("launch the url");
	    Assert.assertEquals(url,"http://localhost/administration/userlist.do" );  
	  //  Assert.assertNotEquals(url, "http://localhost/administration/userlist.d");
	  
	    }      
	/// 	@AfterMethod
	 //	 public void logoutFiel() {
	 //    System.out.println("launch the text");
	//	// actiTimeHome.logoutField();	   
	//    }	 
	    @org.testng.annotations.AfterClass 	   
	    public void AfterClas() {			
		System.out.println("close th actitime");	
		driver.close(); 
	    }
}