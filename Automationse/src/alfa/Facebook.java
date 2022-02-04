package alfa;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Facebook {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\Automation\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.facebook.com/");

        WebElement username = driver.findElement(By.xpath("//input[@id='email']")); 
        WebElement passward = driver.findElement(By.xpath("//input[@id='pass']"));
        WebElement button = driver.findElement(By.xpath("//button[@type='submit'] "));
        
        username.sendKeys("kdrock08@gmail.com");
        passward.sendKeys("9145660118");
        button.click();
	}

}
