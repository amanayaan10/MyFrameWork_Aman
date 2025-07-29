package tests;

import java.io.IOException;
import java.util.HashMap;

import org.openqa.selenium.WebDriver;

import base.CreateDriverObject;
import utils.getPropertyValue;

public class testFramework {

	public static void main(String[] args) throws IOException, InterruptedException
	{
		/*Testing the Get Properties Class
		String environment =getPropertyValue.getkeyvalue("env");
		System.out.println(environment);

		
		//Testing the Driver Object
		WebDriver driver = CreateDriverObject.getDriver();
		driver.get("https://en.wikipedia.org/wiki/India");
		Thread.sleep(1000);
		driver.close();
		
		*/
		//Test Excel Sheet Data
		HashMap<String,String>hmap=ExcelFileReader.getExcelData("search","requestGroup02");
		String value = hmap.get("Pincode");
		System.out.println(value);
	}

}
