package com.qa.ictakTestCases;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;


import com.qa.ictakBase.Base;
import com.qa.ictakPages.LoginPage;
import com.qa.utilities.ExcelUtility;

public class LoginPage_TestCases extends Base{

	
	LoginPage login;
	
	@BeforeTest
	public void driverSetup() {
		login = new LoginPage(driver);
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	}
	
	

	
	
	@Test(priority=1)
	
		public void valid_username_password() throws IOException, Exception
		{
		
		String username=ExcelUtility.getCellData(0,0,System.getProperty("user.dir")+"\\src\\main\\resources\\LoginData.xlsx",0);
					
		String password=ExcelUtility.getIntegerData(0,1,System.getProperty("user.dir")+"\\src\\main\\resources\\LoginData.xlsx",0);		
	login.LogIn();
	login.setusername(username);
    login.setpassword(password);
	Thread.sleep(2000);
    login.signin();
	login.Logout();
    
	String actualUrl="http://64.227.132.109/adminpage";
	String expectedUrl=driver.getCurrentUrl();
	
	Assert.assertEquals(actualUrl,expectedUrl);
	}	
	
@Test(priority=2)
	
	public void valid_username_invalid_password() throws IOException, Exception
	{
	
	String username=ExcelUtility.getCellData(1,0,System.getProperty("user.dir")+"\\src\\main\\resources\\LoginData.xlsx",0);
		
	String password=ExcelUtility.getIntegerData(1,1,System.getProperty("user.dir")+"\\src\\main\\resources\\LoginData.xlsx",0);		
	login.LogIn();
	
	login.setusername(username);
	login.setpassword(password);
	login.signin();
	Thread.sleep(5000);
	

	login.Alertok();
	
	String expected_title="Invalid Password";
	
	String alertMessage=login.alert();
	
	Assert.assertEquals(alertMessage, expected_title);
	
	

}
	
	@Test(priority=3)
	public void invalid_username_valid_password() throws IOException, Exception
	{

	String username=ExcelUtility.getCellData(2,0,System.getProperty("user.dir")+"\\src\\main\\resources\\LoginData.xlsx",0);
		
	String password=ExcelUtility.getIntegerData(2,1,System.getProperty("user.dir")+"\\src\\main\\resources\\LoginData.xlsx",0);		
	login.LogIn();
	
	login.setusername(username);

	login.setpassword(password);
	
	login.signin();
	
	driver.navigate().refresh();
	String expected_title="Invalid username";
	String alertMessage=login.alert();
	
	Assert.assertEquals(alertMessage, expected_title);
	Thread.sleep(5000);
	
}
	
	@Test(priority=4)
	public void invalid_username_invalid_password() throws IOException, Exception
	{

		

	String username=ExcelUtility.getCellData(3,0,System.getProperty("user.dir")+"\\src\\main\\resources\\LoginData.xlsx",0);
		
	String password=ExcelUtility.getIntegerData(3,1,System.getProperty("user.dir")+"\\src\\main\\resources\\LoginData.xlsx",0);		
	login.LogIn();
	login.setusername(username);
	
	login.setpassword(password);
	
	login.signin();
	Thread.sleep(5000);
	driver.navigate().refresh();
	String expected_title="Invalid username";
      String alertMessage=login.alert();
	
	Assert.assertEquals(alertMessage, expected_title);
	Thread.sleep(5000);
	
	
	
	}
}
