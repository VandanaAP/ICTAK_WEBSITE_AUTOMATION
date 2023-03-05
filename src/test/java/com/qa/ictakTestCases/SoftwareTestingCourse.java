package com.qa.ictakTestCases;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.qa.ictakBase.Base;
import com.qa.ictakPages.STCourse;
import com.qa.utilities.ExcelUtility;




public class SoftwareTestingCourse extends Base {

	STCourse software_testing;
	@BeforeTest
	public void driverSetup() {
		
		software_testing = new STCourse(driver);
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
	}
	
	@Test(priority=1)
	
	public void valid_email_valid_phonenumber() throws IOException, InterruptedException
	{
		
		
		String name=ExcelUtility.getCellData(0,0,System.getProperty("user.dir")+"\\src\\main\\resources\\RegistationData.xlsx",0);
		String email=ExcelUtility.getCellData(0,1,System.getProperty("user.dir")+"\\src\\main\\resources\\RegistationData.xlsx",0);
		String phnumber=ExcelUtility.getIntegerData(0,2,System.getProperty("user.dir")+"\\src\\main\\resources\\RegistationData.xlsx",0);
		
		software_testing.DropDown();
	Thread.sleep(1000);
	software_testing.SoftwareTesting();
	
	String actualtext="Software Testing";
	String expectedtext=software_testing.GetText();
	 
	Assert.assertEquals(actualtext, expectedtext);
	
	software_testing.Apply();
	Thread.sleep(1000);
	software_testing.setName(name);  
	Thread.sleep(3000);
	software_testing.setEmail(email);
	Thread.sleep(3000);
	software_testing.setNumber(phnumber);
	Thread.sleep(5000);
	software_testing.Register();
	Thread.sleep(5000);
	
String actual="Registration Successfull";
String expected=driver.switchTo().alert().getText();

Assert.assertEquals(expected, actual);
driver.switchTo().alert().accept();

	}
@Test(priority=2)
	
	public void invalid_email_valid_phonenumber() throws IOException, InterruptedException
	{
		
		
		String name=ExcelUtility.getCellData(1,0,System.getProperty("user.dir")+"\\src\\main\\resources\\RegistationData.xlsx",0);
		String email=ExcelUtility.getCellData(1,1,System.getProperty("user.dir")+"\\src\\main\\resources\\RegistationData.xlsx",0);
		String phnumber=ExcelUtility.getIntegerData(1,2,System.getProperty("user.dir")+"\\src\\main\\resources\\RegistationData.xlsx",0);
		
	
	
	software_testing.Apply();
	Thread.sleep(1000);
	software_testing.setName(name);  
	Thread.sleep(3000);
	software_testing.setEmail(email);
	Thread.sleep(3000);
	software_testing.setNumber(phnumber);
	Thread.sleep(5000);
	software_testing.Register();
	Thread.sleep(5000);
String actual="Invalid email";
	String message=driver.switchTo().alert().getText();
	Assert.assertEquals(message,actual);

	driver.switchTo().alert().accept();
	Thread.sleep(3000);

	}
@Test(priority=3)

public void valid_email_invalid_phonenumber() throws IOException, InterruptedException
{
	String name=ExcelUtility.getCellData(2,0,System.getProperty("user.dir")+"\\src\\main\\resources\\RegistationData.xlsx",0);
	String email=ExcelUtility.getCellData(2,1,System.getProperty("user.dir")+"\\src\\main\\resources\\RegistationData.xlsx",0);
	String phnumber=ExcelUtility.getIntegerData(2,2,System.getProperty("user.dir")+"\\src\\main\\resources\\RegistationData.xlsx",0);

	
	
	software_testing.Apply();
	Thread.sleep(1000);
	software_testing.setName(name);  
	Thread.sleep(3000);
	software_testing.setEmail(email);
	Thread.sleep(3000);
	software_testing.setNumber(phnumber);
	Thread.sleep(5000);
	software_testing.Register();
	Thread.sleep(5000);
	driver.switchTo().alert().accept();

	String message=driver.switchTo().alert().getText();
	Assert.assertEquals(message, "Invalid Phone Number");
	
	Thread.sleep(3000);
	
}

@Test(priority=4)

public void invalid_email_invalid_phonenumber() throws IOException, InterruptedException
{


String name=ExcelUtility.getCellData(3,0,System.getProperty("user.dir")+"\\src\\main\\resources\\RegistationData.xlsx",0);
String email=ExcelUtility.getCellData(3,1,System.getProperty("user.dir")+"\\src\\main\\resources\\RegistationData.xlsx",0);
String phnumber=ExcelUtility.getIntegerData(3,2,System.getProperty("user.dir")+"\\src\\main\\resources\\RegistationData.xlsx",0);



software_testing.Apply();
Thread.sleep(1000);
software_testing.setName(name);  
Thread.sleep(3000);
software_testing.setEmail(email);
Thread.sleep(3000);
software_testing.setNumber(phnumber);
Thread.sleep(5000);
software_testing.Register();
Thread.sleep(5000);

String message=driver.switchTo().alert().getText();
Assert.assertEquals(message, "Invalid Credentials");
driver.switchTo().alert().dismiss();


}

}
