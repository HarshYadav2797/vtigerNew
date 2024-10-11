package createContact;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DataProvidersPractice2 {

	@Test(dataProvider = "getData")
	public void data(String phone, String model)
	{
		System.out.println(phone + "____" + model);
	}
	
	
	@DataProvider
	public Object[][] getData()
	{
		Object[][] data= new Object[2][2];
		
		
		data[0][0]="Samsung";
		data[0][1]="abc";
		
		
		data[1][0]="iphone";
		data[1][1]="xyz";
		
		return data;
	}
	
	
	
}