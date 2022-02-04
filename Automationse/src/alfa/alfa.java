package alfa;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class alfa {

	public static void main(String[] args) {
		
			System.setProperty("webdriver.chrome.driver","C:\\Automation\\chromedriver.exe");
	        WebDriver driver = new ChromeDriver();
	        driver.get("https://www.facebook.com/r.php?locale=en_GB&display=page");

	        WebElement lite = driver.findElement(By.xpath("//a(text()='About')"));
	        String link = lite.getAttribute("href");
	      
	      System.out.println(link);
	      if(link.equals("https://about.facebook.com/"))
	      {
	    	  System.out.println("pass");
	      }
	      else
	      {
	    	  System.out.println("fails");
	      }
		}

	}
