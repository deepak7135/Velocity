package alfa;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Xtext {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","C:\\Automation\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        
  //      driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        driver.get("https://www.facebook.com/login/");
        
    //    Thread.sleep(4000);
        
        WebDriverWait wait= new WebDriverWait(driver,20);
        
        WebElement confirme =wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//a[@rel='nofollo']")));
        
       WebElement button= driver.findElement(By.xpath("//a[@rel='nofollow']"));  // x path with attribute
       button.click();   
       WebElement text= driver.findElement(By.xpath("(//input[@class='inputtext _58mg _5dba _2ph-'])[1]"));  // x path with attribute
       text.sendKeys("deepak");
       Thread.sleep(2000);
       WebElement last= driver.findElement(By.xpath("(//input[@class='inputtext _58mg _5dba _2ph-'])[2]"));  // x path with attribute
       last.sendKeys("deep");
       WebElement mobile= driver.findElement(By.xpath("(//input[@type='text'])[3]"));  // x path with attribute
       mobile.sendKeys("339292");
       Thread.sleep(2000);
       WebElement pass= driver.findElement(By.xpath("(//input[@type='password'])")); 
       pass.sendKeys("deepak");
       Thread.sleep(2000);
      
       Thread.sleep(2000);
       WebElement month= driver.findElement(By.xpath("//select[@aria-label='Month']"));
       Select d= new Select(month);
       d.selectByIndex(3);
       Thread.sleep(2000);
       WebElement year= driver.findElement(By.xpath("//select[@aria-label='Year']"));
       Select e= new Select(year);
       e.selectByIndex(3);
       Thread.sleep(2000);
       WebElement radi= driver.findElement(By.xpath("(//input[@name='sex'])[1]"));
       radi.click();  
       Thread.sleep(2000);
       WebElement clas= driver.findElement(By.xpath("//input[@value='2']"));
       clas.click();  
       Thread.sleep(2000);
       WebElement cla= driver.findElement(By.xpath("//input[@value='-1']"));
       cla.click();
       Thread.sleep(2000);
       
       WebElement pro= driver.findElement(By.xpath("//select[@name='preferred_pronoun']"));
       Select h= new Select(pro);
       h.selectByValue("6");
       
       Thread.sleep(4000);
       WebElement text1= driver.findElement(By.xpath("(//input[@type='text'])[6]")); 
       text1.sendKeys("finaly done");
      
    //    WebElement about= driver.findElement(By.xpath("(//a[text()='Services'])"));  //  x path with text
      //   about .click();
        
     //     WebElement text= driver.findElement(By.xpath("//input[@id='email']"));
     //     text.sendKeys("velocity");
        
        //    WebElement Email =driver.findElement(By.xpath("//span[contains(text(),'Language')]"));
      //      Email.click();
        
   //    WebElement d= driver.findElement(By.xpath("//input[@id='session_key']"))  ; 
   //    d.sendKeys("velocity");
	}

}
