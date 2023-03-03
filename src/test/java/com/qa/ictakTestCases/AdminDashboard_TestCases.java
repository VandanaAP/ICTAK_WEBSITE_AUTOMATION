package com.qa.ictakTestCases;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.qa.ictakBase.Base;
import com.qa.ictakPages.AdminDashboard;
import com.qa.ictakPages.LoginPage;
import com.qa.utilities.ExcelUtility;

public class AdminDashboard_TestCases extends Base {

	
	LoginPage login;
	AdminDashboard admin;
	
	
	@Test(priority=1)
	
	public void CourseRegistrationVerification() throws IOException, InterruptedException
	{
		
		login = new LoginPage(driver);
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		
		
		String user1=ExcelUtility.getCellData(0,0,System.getProperty("user.dir")+"\\src\\main\\resources\\LoginData.xlsx",0);
				
		String pass1=ExcelUtility.getIntegerData(0,1,System.getProperty("user.dir")+"\\src\\main\\resources\\LoginData.xlsx",0);		
login.LogIn();
login.setusername(user1);
Thread.sleep(3000);
login.setpassword(pass1);
Thread.sleep(3000);
login.signin();
admin=new AdminDashboard(driver);
Thread.sleep(5000);
admin.CourseRegistration();
Thread.sleep(5000);


String actual="User Registration List";
String expected=admin.UserRegistration();

Assert.assertEquals(actual,expected);
	login.Logout();
	
	}	
	
	@Test(priority=2)
	public void PartnershipRegistrationVerification() throws IOException, InterruptedException
	{
		login = new LoginPage(driver);
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		String user1=ExcelUtility.getCellData(0,0,System.getProperty("user.dir")+"\\src\\main\\resources\\LoginData.xlsx",0);
				
		String pass1=ExcelUtility.getIntegerData(0,1,System.getProperty("user.dir")+"\\src\\main\\resources\\LoginData.xlsx",0);		
login.LogIn();
login.setusername(user1);
Thread.sleep(3000);
login.setpassword(pass1);
Thread.sleep(3000);
login.signin();
admin=new AdminDashboard(driver);
Thread.sleep(5000);
admin.PartnershipRegistration();
Thread.sleep(5000);

String actual="Partnership Application";
String expected=admin.PartnershipApplication();



    admin.Download();
     Thread.sleep(3000); 
     login.Logout();
  }
	@Test(priority=3)

	public void AcademicMembershipVerification() throws IOException, InterruptedException
	{
		login = new LoginPage(driver);
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		String user1=ExcelUtility.getCellData(0,0,System.getProperty("user.dir")+"\\src\\main\\resources\\LoginData.xlsx",0);
				
		String pass1=ExcelUtility.getIntegerData(0,1,System.getProperty("user.dir")+"\\src\\main\\resources\\LoginData.xlsx",0);		
login.LogIn();
login.setusername(user1);
Thread.sleep(3000);
login.setpassword(pass1);
Thread.sleep(3000);
login.signin();
admin=new AdminDashboard(driver);
Thread.sleep(5000);
admin.AcademicMembership();
Thread.sleep(5000);


String actual="Academic Membership";
String expected=admin.AcademicText();



    admin.Download();
     Thread.sleep(3000); 
     login.Logout();
  }
	@Test(priority=4)
	

	public void CorporateMembershipVerification() throws IOException, InterruptedException
	{
		login = new LoginPage(driver);
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		String user1=ExcelUtility.getCellData(0,0,System.getProperty("user.dir")+"\\src\\main\\resources\\LoginData.xlsx",0);
				
		String pass1=ExcelUtility.getIntegerData(0,1,System.getProperty("user.dir")+"\\src\\main\\resources\\LoginData.xlsx",0);		
login.LogIn();
login.setusername(user1);
Thread.sleep(3000);
login.setpassword(pass1);
Thread.sleep(3000);
login.signin();
admin=new AdminDashboard(driver);
Thread.sleep(3000);
admin.CorporateMembership();

Thread.sleep(5000);

String actual="Corporate Membership";
String expected=admin.CorporateText();



    admin.Download();
     Thread.sleep(3000); 
  }
	
}
