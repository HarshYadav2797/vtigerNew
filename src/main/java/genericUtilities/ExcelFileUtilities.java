package genericUtilities;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ExcelFileUtilities {
	
	public String excelFile(String sheetName, int rowNum, int cellNum) throws EncryptedDocumentException, IOException
	{
		FileInputStream fis= new FileInputStream(".\\src\\test\\resources\\newcontacts.xlsx");
		Workbook wb = WorkbookFactory.create(fis);
		Sheet sht=wb.getSheet(sheetName);
		Row row = sht.getRow(rowNum);
		Cell cell = row.getCell(cellNum);
		String value= cell.toString(); //changed to toString for taking numeric values
		return value;
	}
	
	
	public Object[][] readMultipleData(String sheetName) throws EncryptedDocumentException, IOException
	{
	  FileInputStream fis = new FileInputStream(".\\src\\test\\resources\\newcontacts.xlsx");
	  Workbook wb= WorkbookFactory.create(fis);
	  Sheet sht = wb.getSheet(sheetName);
	  int LastRow = sht.getLastRowNum();
	  int LastCell = sht.getRow(0).getLastCellNum();
	  
	  Object[][] data = new Object[LastRow][LastCell];
	  
	  for(int i=0; i<LastRow; i++)
		   
	  {
		 for(int j=0; j<LastCell; j++)
		 {
			 data[i][j]=sht.getRow(i+1).getCell(j).getStringCellValue();
		 }
		 
	  }
	   
	   return data;
	}
}
