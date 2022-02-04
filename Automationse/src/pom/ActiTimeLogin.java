package pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ActiTimeLogin {
	
    	@FindBy  (xpath= "//input[@id='username']" ) 
	    private WebElement text;
	    
	    @FindBy  (xpath= "(//input[@type='password'])[1]")
	    private WebElement passward;
	    
	    @FindBy  (xpath= "//a[@id='loginButton']" )
	    private WebElement login;  
	    
	    public ActiTimeLogin(WebDriver driver) {
	    	PageFactory.initElements(driver, this);
	    }	    
	    public void textTag() {
	    	text.sendKeys("admin");
	    }
	    public void passWardTag() {
	 	    passward.sendKeys("manager");
	    }	    	 
	    public void loginButton() {
		 	login.click();
        }    
      	    
	    }


