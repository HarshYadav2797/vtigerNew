package objetRepo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ContacsPage {
	
	//Identification
	@FindBy(xpath="//img[@title='Create Contact...']")
	private WebElement createContactLink;
	
	//Initialization
	public ContacsPage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	//Utilization
	public WebElement getContactsLink()
	{
		return createContactLink;
	}
	
	//Business libraries
	public void clickOnContactsLink()
	{
		createContactLink.click();
	}

}
