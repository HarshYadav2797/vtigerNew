package createContact;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DataProvidersPractice1 {
	
	
	/**
	 * 1. here we fetched data from data providers by taking flag called 'data provider'
	 * 2. over here we will parameterized the data thrown by data providers in sequential manner.
	 * @param name
	 * @param model
	 * @param Qty
	 * @param price
	 */
	@Test(dataProvider = "getData")
	public void datapro(String name, String model, int Qty, int price)
	
	{
		
	System.out.println(name  +"----" + model +"----" + Qty + "----" + price);	
		
		
	}
		
	
		@DataProvider
		public Object[][] getData()
		{
			/**
			 * imp: data providers should always be there in class , script specific it is
			 * 1. here first '[]' represents row and second one column
			 * 2. the data types has to be uniformly given otherwise it will throw method matcher exception
			 * 3. if in interview someone asks about data provider you can give it like this
			 */
		Object [][] data= new Object[3][4];
		
		data[0][0]="Samsung";
		data[0][1]="abc";
		data[0][2]=12;
		data[0][3]=12000;
		
		data[1][0]="Iphone";
		data[1][1]="abc";
		data[1][2]=45;
		data[1][3]=566666;
		
		data[2][0]="Micromax";
		data[2][1]="abc";
		data[2][2]=20;
		data[2][3]=75987;
		
		
		return data;
		
		}
	
}
