package pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;
public class ActiTimeHome {	
	 @FindBy  (xpath= "//a[@class='content users']" ) 
     private WebElement userlist;  
    
    @FindBy  (xpath= "//div[@id='ext-gen6']" )
     private WebElement useform;  

    
    @FindBy  (xpath= "//input[@id='userDataLightBox_firstNameField']" )
    private WebElement firstname;
    
    @FindBy  (xpath= "//input[@id='userDataLightBox_usernameField']" )
    private WebElement lastname;
    
   @FindBy  (xpath= "(//button[@class='x-btn-text'])[3]" )
     private WebElement calender;
    
    @FindBy  (xpath= "//*[@id=\"ext-gen122\"]//img" )
     private WebElement cal;
    
    @FindBy  (xpath= "//tr[@id='ext-gen71']//button" )
    private WebElement calenertab;
    @FindBy  (xpath= "(//button[@class='x-btn-text'])[7]" )
    private WebElement year;
    
    @FindBy  (xpath= "//*[@id='closeUserDataLightBoxBtn']" )
    private WebElement close; 
    
     @FindBy  (xpath= "//a[@id='logoutLink']" )
    private WebElement logout; 
     
   

    

    
  // @FindBy  (xpath= "//a[text()='Logout']" )
  // private WebElement logout; 
      
    public ActiTimeHome(WebDriver driver) {  //constuctor
    PageFactory.initElements(driver, this);
    }	      
     public void TaskButtonTab() {
     userlist.click();
     }
    public void ProjectandCustTab() {
     useform.click();
     }
    public void UserFirstName() {
    	firstname.sendKeys("deepak");
        }
    public void UserLastName() {
    	lastname.sendKeys("kadam");
        }
      public void CalenderSelect() {
    	  calender.click();
      }
    	  public void CalenderSe() {
        	  cal.click();
    	  }
        	  public void CalenderTab() {
        		  calenertab.click();
        	  }
        	  public void Calenderyear() {
        		  year.click();
    	 }
        	  
        	  public void ColseForm() {
        		  close.click();
    	 }
    public void logoutField() {
  	 logout.click();  
   
    }
   }    
