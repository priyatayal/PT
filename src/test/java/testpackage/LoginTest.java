package testpackage;

import java.io.IOException;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import pages.BaseClass;
import pages.LoginClass;

public class LoginTest extends BaseClass

{
	LoginClass login;
public LoginTest()
{
	super();
}

@BeforeMethod
public void setup()
{
start();
 login = new LoginClass();

}
@Test
public void signupTest() throws IOException
{
	
login.signin();	

}
@AfterMethod
public void teardown()
{
	driver.close();
}

}
