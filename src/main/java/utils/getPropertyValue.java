package utils;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class getPropertyValue {

	public static String getkeyvalue(String key) throws IOException {
		
		String value = null;
		try
		{
		String path = System.getProperty("user.dir")+"\\Resources\\UI_Properties.properties";
		FileInputStream fis = new FileInputStream(path);
		
		Properties prop = new Properties();
		prop.load(fis);
	    
		 value = prop.getProperty(key);
	    
		}
		
		catch(Exception e)
		{
			System.out.println("Exception occured While Reading the PropertyFile "+e);
		}
		return value;
		
		
		
	}

}
