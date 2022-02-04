package pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
	
	private WebDriver driver;

      @FindBy  (xpath= "//input[@id='email']" )  // varibale reference of Xpath
      private WebElement username;
      
      @FindBy  (xpath= "//input[@id='pass']" )
      private WebElement passward;
      
      @FindBy  (xpath= "//button[@type='submit'] " )
      private WebElement button;          
      
      public LoginPage (WebDriver driver) {  //constructor 
    	  
    	  PageFactory.initElements(driver,this);  //initilise verible help by initElement method
    	  
    	  this.driver= driver;
      }
      
  //   public void userNameText() { //create methods reference of varible
      
   //      username.sendKeys("kdrock08@gmail.com");
    
    	  
   // 	  passward.sendKeys("9145660118");
     
              
  //        button.click();
  //   }
      
      
      
      
          public void clickall() {
       	  passward.sendKeys("9145660118");
        	 username.sendKeys("kdrock08@gmail.com");   
             button.click();

          
       
       

//private void isiDispayed() {
//	// TODO Auto-generated method stub
	
} 
      
}

 