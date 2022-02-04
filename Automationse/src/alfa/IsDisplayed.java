package alfa;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class IsDisplayed {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","C:\\Automation\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.facebook.com/login/");
     
        
        WebElement mail= driver.findElement(By.xpath("(//a[@class='_97w5'])")); 
        
        mail.click();
        WebElement femal= driver.findElement(By.xpath("(//input[@type='radio'])[1]")); 
       
        WebElement male= driver.findElement(By.xpath("(//input[@type='radio'])[2]")); 

        WebElement custom= driver.findElement(By.xpath("(//input[@type='radio'])[3]"));
        
       
        WebElement cust= driver.findElement(By.xpath("(//select[@name='preferred_pronoun'])")); 
        
       boolean result= cust.isDisplayed();
       if(result==true)
      {
    	   System.out.println("true");
       }
      else
       {
    	   System.out.println("failes");
       
      }
	}
}
