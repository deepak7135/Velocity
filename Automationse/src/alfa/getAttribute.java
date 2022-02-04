package alfa;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class getAttribute {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\Automation\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.facebook.com/r.php?locale=en_GB&display=page");

        WebElement lite = driver.findElement(By.xpath("(//a[@aria-label='Already have an account?'])"));
        String link = lite.getAttribute("href");
      
      System.out.println(link);
      if(link.equals("/login/?privacy_mutation_token=eyJ0eXBlIjowLCJjcmVhdGlvbl90aW1lIjoxNjQxOTAyMDk1LCJjYWxsc2l0ZV9pZCI6MjY5NTQ4NDUzMDcyMDk1MX0%3D/"))
      {
    	  System.out.println("pass");
      }
      else
      {
    	  System.out.println("fails");
      }
	}

}
