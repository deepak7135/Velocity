package alfa;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class isSelected {

	
		public static void main(String[] args) {
			System.setProperty("webdriver.chrome.driver","C:\\Automation\\chromedriver.exe");
	        WebDriver driver = new ChromeDriver();
	        driver.get("https://html.form.guide/checkbox/html-form-with-checkbox/");

	        WebElement checkbox = driver.findElement(By.xpath("//input[@type='checkbox']"));
	        //checkbox.click();
	        
	        boolean result = checkbox.isSelected();
	        
	        if(result== true)
	        {
	        	System.out.println("true");
	        	
	        }
	        else
	        {
	        	System.out.println("falls");
	        }
		}

	}
