package objetRepo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ContactInfoPage {
	
	//identification
	
	@FindBy(xpath="//span[@class='dvHeaderText']")
	private WebElement contactHeader;
	
	//initialization
	
	public ContactInfoPage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	//utilization
	
	public WebElement getContactHeader()
	{
		return contactHeader;
	}
	
	//business libraries
	
	public String contactHeaderText()
	{
		return contactHeader.getText();
	}
	

}
