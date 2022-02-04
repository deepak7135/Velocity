package Test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import pom.LoginPage;

public class TestNG {
	  WebDriver driver ;
	  LoginPage loginpage;
	  
	    @BeforeClass 
	    public void befroeclass() {
	    	System.out.println("launch browser");
	    	System.setProperty("webdriver.chrome.driver","C:\\Automation\\chromedriver.exe");
	         driver = new ChromeDriver();
	        driver.get("https://www.facebook.com/");
	    }
	
		@BeforeMethod 
		public void befroemethod() {			
		System.out.println("beforecmethod");
		driver.get("https://www.facebook.com/");
		}
		@Test 
		public void LoginpageFace() {
				
		System.out.println("test");
	    loginpage = new LoginPage(driver);
		
        loginpage.clickall();
        
     //   loginpage.userPass();
        
     //   loginpage.buttonTab();              
			}
	//	@Test 
	//	public void testB() {
				
	//	System.out.println("testB");
	//		}
	//	@AfterMethod 
	//	public void aftermethod() {
					
//		System.out.println("aftermethod");
//				}
//		@AfterClass 
     	public void AfterClass() {
						
		System.out.println("close th facebook");
		
		driver.close();
					
	}

}
