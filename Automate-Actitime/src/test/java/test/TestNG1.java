package test;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;


import pom.LoginPage;
import pom.RediffMail;

public class TestNG1 {
	
	WebDriver driver;
	RediffMail  rediffmail;
		 @BeforeClass 
		    public void homeButton() {
		    	System.out.println("launch browser");
		    	System.setProperty("webdriver.chrome.driver","C:\\Automation\\chromedriver.exe");
		         driver = new ChromeDriver();		     
		    }	
			@BeforeMethod 
			public void LounchLink() {			
			driver.get("https://www.rediff.com/news");
			}
			@Test 
			public void  HomePageverify() {
			System.out.println("open the home");
		    rediffmail= new RediffMail(driver);
		    rediffmail.homePage();		     
			}				
			@Test 
			public void homePagelink() {	
			System.out.println("open the news tab");
			rediffmail= new RediffMail(driver);
			rediffmail.newsPage();
			}			
			@Test 
			public void businessLink() {	
			System.out.println("open the bussines tab");
		    rediffmail= new RediffMail(driver);
            rediffmail.Business();
			}			
		 					
			@org.testng.annotations.AfterClass 
	     	public void AfterClass() {
							
			System.out.println("close the facebook");
			
			driver.close();
}
}