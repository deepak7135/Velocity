package alfa;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Beta {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","C:\\Automation\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.selenium.dev/");  // important
       driver.navigate().to("https://web.whatsapp.com/");
          Thread.sleep(3000);
       driver.navigate().to("https://web.whatsapp.com/");   //imporatant
      Thread.sleep(3000);
       
       driver.navigate().forward();  //important
       
       Thread.sleep(3000);
       
       driver.navigate().back();
       
       Thread.sleep(3000);
       
       driver.navigate().back();
       
      String url = driver.getCurrentUrl();   //imporatant
       System.out.println(url);
       
      String title= driver.getTitle();  //important
      System.out.println(title);
      driver.close() ;
      driver.quit();
       
      Dimension z = new Dimension(300,900);
      driver.manage().window().setSize(z);
       
      Point y = new Point(400,800);
      driver.manage().window().setPosition(y);

	}
}
