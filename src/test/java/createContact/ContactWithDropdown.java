package createContact;

import java.awt.AWTException;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.testng.AssertJUnit;
import org.testng.annotations.Test;

import genericUtilities.BaseClass;
import genericUtilities.ExcelFileUtilities;
import objetRepo.ContacsPage;
import objetRepo.ContactInfoPage;
import objetRepo.CreateContactPage;
import objetRepo.HomePage;

public class ContactWithDropdown extends BaseClass {
	

	@Test
	public void createContacts() throws AWTException, EncryptedDocumentException, IOException, InterruptedException
	{
		
		ExcelFileUtilities eutil = new ExcelFileUtilities();
		
		String name = eutil.excelFile("ContactWithLeadsDropDown", 18, 1);
		String LeadsdropDown = eutil.excelFile("ContactWithLeadsDropDown",8 , 2);
		//String LeadsStatusDropDown = eutil.excelFile("ContactWithLeadsDropDown", 18, 3);
		String MobileNumberOfUtkarshBhai = eutil.excelFile("ContactWithLeadsDropDown", 18, 4);
		String GroupDropDown = eutil.excelFile("ContactWithLeadsDropDown", 19, 5);
		
		
		//Click on Contacts link in HomePage.
		HomePage hp=new HomePage(driver);
		hp.clickContactsLink();
		
		
		//Click on CreateContact Button.
	    ContacsPage cp = new ContacsPage(driver);
	    cp.clickOnContactsLink();
	 
		
		//Create Contact.
	    CreateContactPage ccp= new CreateContactPage(driver);
	  
	    ccp.createContactWithLastNameTxtFldAndLeads(name, LeadsdropDown,MobileNumberOfUtkarshBhai, GroupDropDown );
	    
		
		//Validation.
	    ContactInfoPage cip= new ContactInfoPage(driver);
	    String CONTACTHEADER = cip.contactHeaderText();
	    AssertJUnit.assertTrue(CONTACTHEADER.contains(name));
	    System.out.println(CONTACTHEADER);
	    
		
	}
}
