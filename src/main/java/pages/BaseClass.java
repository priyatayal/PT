package pages;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.WebDriver;

public class BaseClass 

{	
	public static WebDriver driver;
	public static Properties prop;
	
public  BaseClass() 
{

	prop = new Properties();	
	FileInputStream propfile;
	try {
		propfile = new FileInputStream("D:\\eclipse-workspace\\preparation\\cnfiguration.Properties");
		try {
			prop.load(propfile);
		} catch (IOException e) {
			
			e.printStackTrace();
		}
	} catch (FileNotFoundException e) {
		e.printStackTrace();
	}
}
	public  static void start()
	{
	 System.setProperty("webdriver.chrome.driver", "E:\\chromedriver_win32 (1)\\\\chromedriver.exe");driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().pageLoadTimeout(10, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.get("https://ui.freecrm.com/home");}
}


