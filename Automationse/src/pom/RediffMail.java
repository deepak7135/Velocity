package pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class RediffMail {

    @FindBy  (xpath= "//a[text()='HOME']" )  // varibale reference of Xpath
    private WebElement Home;
    
    @FindBy  (xpath= "//li[@class='news']" )
    private WebElement news;
    
    @FindBy  (xpath= "//a[text()='BUSINESS'] " )
    private WebElement business;     
    
    public RediffMail (WebDriver driver) {  //constructor 
  	  
  	PageFactory.initElements(driver,this);  //initilise verible help by initElement method
  	   	
    }   
    public void homePage() {
    	Home.click();
    }
    public void newsPage() {
    	news.click();
    }
    public void Business() {
    	business.click();
    }
}
