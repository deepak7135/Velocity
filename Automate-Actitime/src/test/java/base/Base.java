package base;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Base {

	
	public WebDriver OpenBrowserChrome()
	{	
	    System.setProperty("webdriver.chrome.driver","C:\\Automation\\chromedriver.exe");
	    WebDriver driver = new ChromeDriver();
	    
	    return driver;
	}
}
