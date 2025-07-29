package base;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.GeckoDriverInfo;
import org.openqa.selenium.ie.InternetExplorerDriver;

import utils.getPropertyValue;


public class CreateDriverObject {
	static WebDriver driver;
	
	public static WebDriver getDriver() throws IOException {
		
		try {
		String browserType =getPropertyValue.getkeyvalue("browser");

		if(browserType.equalsIgnoreCase("chrome"))
		{
			driver = new ChromeDriver();
		}
		
		else if(browserType.equalsIgnoreCase("edge")) {
			driver = new EdgeDriver();			
		}
		
		else if(browserType.equalsIgnoreCase("FireFox"))
		{
			driver = new FirefoxDriver();
		}
		
		else
		{
			System.out.println("Please enter only Chrome or edge or Firefox for browseType");
		}
		
		driver.manage().window().maximize();
		}
		catch(Exception e)
		{
			System.out.println("Exception occured while intializing the WebDriver:"+e.getMessage());
		}
		
	
		
		return driver;
		
		
	}
		

	}