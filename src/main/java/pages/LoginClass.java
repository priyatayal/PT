package pages;

import java.io.IOException;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginClass extends BaseClass
{
	@FindBy(xpath ="//input[@placeholder='E-mail address']")
	WebElement username;
	
	@FindBy(xpath ="//input[@placeholder='Password']")
	WebElement password;
	
	@FindBy(xpath ="//div[text()='Login']")
	WebElement Submitt;

	
	public  LoginClass() 
	{
		
PageFactory.initElements(driver, this);
		 
	}
	public  void  signin() throws IOException
	{
		username.sendKeys(prop.getProperty("username"));
		password.sendKeys(prop.getProperty("password"));
		Submitt.click();
		
	}
	

	
	
	
	
}
