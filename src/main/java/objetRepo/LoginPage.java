package objetRepo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
	
	//Identification
	
	 @FindBy(xpath = "//input[@name='user_name']")
	 private WebElement userNm;
	 
	 @FindBy(xpath="//input[@name='user_password']")
	 private WebElement pass;
	 
	 @FindBy(xpath = "(//input[@value='Login'])[2]")
	 private WebElement loginBtn;
		
	//Initialization
	 
	 public LoginPage(WebDriver driver) 
	 {
		PageFactory.initElements(driver, this);
	 }
	 
	 //utilization
	 
	 public String getuserNm(String userNm)
	 {
		 return userNm;
	 }
	 
	 public String getpass(String pass)
	 {
		 return pass;
	 }
	 public WebElement getloginBtn()
	 {
		 return loginBtn;
	 }
		
	 
	 //business libraries
	 
	 public void loginToapplication(String Username, String password) {
		 
		 userNm.sendKeys(Username);
		 pass.sendKeys(password);
		 loginBtn.click();
	 }
		
		
		
		
		
	

}
