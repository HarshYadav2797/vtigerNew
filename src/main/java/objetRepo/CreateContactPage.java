package objetRepo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import genericUtilities.SeleniumUtilities;

public class CreateContactPage extends SeleniumUtilities{
	
	
	@FindBy(xpath="//input[@name='lastname']")
	private WebElement lastNameTxtFld;
	
	@FindBy(xpath="//input[@title='Save [Alt+S]']")
	private WebElement saveBtn;
	
	@FindBy(xpath="//select[@name='leadsource']")
	private WebElement leadsDrpDown;
	
	@FindBy(xpath="//select[@name='leadstatus']")
	private WebElement leadsStatusDrpDown;
	
	@FindBy(xpath="//input[@name='mobile']")
	private WebElement mobileNo;
	
	@FindBy(xpath = "//input[@value='T']")
	private WebElement GroupsRadiobtn;
	
	@FindBy(xpath=" //select[@name='assigned_group_id']")
    private WebElement GDropDownclk;
	
	
	
	
	
	
	
	//Initialization
	public CreateContactPage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	
	
	
	
	
	//Utilization
	public WebElement getLastNameTxtFld()
	{
		return lastNameTxtFld;
	}
	public WebElement getsaveBtn()
	{
		return saveBtn;
	}
	public WebElement getleadsDrpDown()
	{
		return leadsDrpDown;
	}
	public WebElement getleadsStatusDrpDown()
	{
		return leadsStatusDrpDown;
	}
	
	public WebElement getmobileNo()
	{
		return mobileNo;
	}
	public WebElement getGroupsRadiobtn()
	{
		return GroupsRadiobtn;
	}
	
	
	public WebElement getGDropDownclk()
	{
		return GDropDownclk;
	}
	
	
	
	
	
	
	//Business Libraries
	public void createContactWithLastNameTxtFld(String LASTNAME)
	{
		lastNameTxtFld.sendKeys(LASTNAME);
		saveBtn.click();
	}
	
	public void createContactWithLastNameTxtFldAndLeads(String LASTNAME, String LeadsdropDown, String MobileNumberOfUtkarshBhai, String GroupDropDown)
	{
		lastNameTxtFld.sendKeys(LASTNAME);
        WebElement value= leadsDrpDown;
        value.click();
        HandleDrpDownByValue(value, LeadsdropDown);
        mobileNo.sendKeys(MobileNumberOfUtkarshBhai);
        GroupsRadiobtn.click();
        WebElement GrDropDownclk = GDropDownclk;
        GrDropDownclk.click();
        HandleDrpDownByVisibleText(GrDropDownclk, GroupDropDown );
		saveBtn.click();
	}

	 
	
	

	

}
