package genericUtilities;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class PropertyFileUtilities {

	public String propertyFiles(String object) throws IOException
	{
		FileInputStream fis = new FileInputStream(".\\src\\test\\resources\\common.properties");
		Properties pro = new Properties();
		pro.load(fis);
		String value = pro.getProperty(object);
		return value;
		
		
		
	}
}
