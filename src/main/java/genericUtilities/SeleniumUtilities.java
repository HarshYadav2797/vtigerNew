package genericUtilities;

import java.time.Duration;
import java.util.Set;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class SeleniumUtilities {
	
	/**
	 * This method is used to handle drop down by value
	 */
	public void HandleDrpDownByValue(WebElement DrpDown, String value)
	{
		Select sc = new Select(DrpDown);
		sc.selectByValue(value);
	}
	
	/**
	 * This method is used to handle drop down by visibleText
	 */
	public void HandleDrpDownByVisibleText(WebElement DrpDown, String value)
	{
		Select sc = new Select(DrpDown);
		sc.selectByVisibleText(value);
	}
	
	public void implicitWaits(WebDriver driver, int time)
	{
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(time));
	}
	
	
	/**
	 * mouse hover
	 * @param driver
	 * @param PartialWindowId
	 */
	
	public void mouseover(WebDriver driver, WebElement Element) 
	{
		Actions act= new Actions(driver);
		act.moveToElement(Element);
	}
    
	public void windowSwitching(WebDriver driver, String PartialWindowId)
	{
		//capture all window Id's
		
		Set<String> allId = driver.getWindowHandles();
		
		//navigate through all window id
		for (String windowId : allId) 
		{
			
		//switch to every window and capture the element
		
		String Id = driver.switchTo().window(windowId).getTitle();
		
		
		if (Id.equalsIgnoreCase(PartialWindowId)) 
		{
			
		   break;
		}
			
		}
		
	}	
	
}
