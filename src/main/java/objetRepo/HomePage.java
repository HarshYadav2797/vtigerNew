package objetRepo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import genericUtilities.SeleniumUtilities;

public class HomePage extends SeleniumUtilities {
	
	@FindBy(xpath="//a[text()='Contacts']")
	private WebElement contactsmjrTab;
	
	
	@FindBy(xpath = "//img[@src='themes/softed/images/user.PNG']")
	private WebElement administratorImg;

	
	@FindBy(linkText = "Sign Out")
	private WebElement signoutLnk;

	
	//utilization
	
	public HomePage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	//getters
	public WebElement getContactslnk()
	{
		return contactsmjrTab;
	}
	
	public WebElement getSingoutLnk() {
		return signoutLnk;
	}
	
	public WebElement getAdministratorImg() {
		return administratorImg;
	}

	
	//business libraries
	public void clickContactsLink()
	{
		contactsmjrTab.click();
	}
	
	
	public void logoutOfApp(WebDriver driver) throws InterruptedException
	{
		mouseover(driver, administratorImg);
		Thread.sleep(3000);
		signoutLnk.click();
	}
	
	

}
