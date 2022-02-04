package pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
public class ActiTimeHome {	
	 @FindBy  (xpath= "//a[@class='content users']" ) 
     private WebElement userlist;  
	 
	 @FindBy  (xpath= "//div[@style='position: relative; float: left;']" ) 
     private WebElement verify;  
	
   @FindBy  (xpath= "//div[@id='ext-gen7']" )
   private WebElement useform;  
    
     @FindBy  (xpath= "//a[text()='Logout']" )
     private WebElement logout; 
    
 //  @FindBy  (xpath= "//a[text()='Logout']" )
 //  private WebElement logout; 
      
    public ActiTimeHome(WebDriver driver) {  //constuctor
    PageFactory.initElements(driver, this);
    }	      
     public void TaskButtonTab() {
     userlist.click();
     }
     
     public void VeryFyUser() {
         userlist.click();
         }
   public void ProjectandCustTab() {
   useform.click();
   }
     public void logoutField() {
  	 logout.click();  
   
   } 
     }
