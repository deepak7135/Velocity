package Test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import pom.LoginPage;

public class TestClass {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\Automation\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.facebook.com/");
        
        
        LoginPage loginpage= new LoginPage(driver);
        
        
 
     //   LoginPage loginpage= new LoginPage(driver);
        
     //  loginpage.userNameText();
        
     //   loginpage.userPass();
        
     //   loginpage.buttonTab();
        
   //      loginpage.clickall(); // all methods are execute
        	
        	
        
	}

}
