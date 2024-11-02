package genericUtilities;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Random;

public class JavaUtility {
	/**
	 * This method will return random number
	 * @return
	 */
	
	public int randomNumber()
	{
		Random r = new Random();
		int randomNumber = r.nextInt(100);
		return randomNumber;
		
	}
	
	/**
	 * This method will return system date
	 */
	
	public String systemDate()
	{
		Date date = new Date();
		SimpleDateFormat formatter = new SimpleDateFormat("dd-mm-yyyy-hh-mm-ss");
		String currentDate = formatter.format(date);
		return currentDate;
	}
	
	
	
	
	
	
	
	

}
