package createContact;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.testng.AssertJUnit;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import genericUtilities.BaseClass;
import genericUtilities.ExcelFileUtilities;
import genericUtilities.PropertyFileUtilities;
import genericUtilities.SeleniumUtilities;
import objetRepo.ContacsPage;
import objetRepo.ContactInfoPage;
import objetRepo.CreateContactPage;
import objetRepo.HomePage;

public class DataProvidersPractice extends BaseClass{
	
	
	ExcelFileUtilities eutil= new ExcelFileUtilities();
	SeleniumUtilities sutil= new SeleniumUtilities();
	PropertyFileUtilities putil= new PropertyFileUtilities();

	
	@Test(dataProvider = "getData")
	public void createMultipleContact(String LASTNAME) throws EncryptedDocumentException, IOException
	{
		
		//Click on Contacts link in HomePage.
		HomePage hp=new HomePage(driver);
		hp.clickContactsLink();
		
		
		//Click on CreateContact Button.
	    ContacsPage cp = new ContacsPage(driver);
	    cp.clickOnContactsLink();
	 
		
		//Create Contact.
	    CreateContactPage ccp= new CreateContactPage(driver);
	    ccp.createContactWithLastNameTxtFld(LASTNAME);
	  
	    
		//validation
	   ContactInfoPage cip= new ContactInfoPage(driver);
	   String CONTACTHEADER = cip.contactHeaderText();
	   AssertJUnit.assertTrue(CONTACTHEADER.contains(LASTNAME));
	   System.out.println(CONTACTHEADER);
		   	
	}
	
	@DataProvider
	public Object[][] getData() throws EncryptedDocumentException, IOException
	{
		return eutil.readMultipleData("CampaignTextField");
	}

}
