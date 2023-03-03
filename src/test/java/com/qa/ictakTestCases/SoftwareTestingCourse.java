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

	STCourse objcourse;
	@BeforeTest
	public void driverSetup() {
		
		objcourse = new STCourse(driver);
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
	}
	
	@Test(priority=1)
	
	public void valid_email_valid_phonenumber() throws IOException, InterruptedException
	{
		
		
		String name=ExcelUtility.getCellData(0,0,System.getProperty("user.dir")+"\\src\\main\\resources\\RegistationData.xlsx",0);
		String email=ExcelUtility.getCellData(0,1,System.getProperty("user.dir")+"\\src\\main\\resources\\RegistationData.xlsx",0);
		String phnumber=ExcelUtility.getIntegerData(0,2,System.getProperty("user.dir")+"\\src\\main\\resources\\RegistationData.xlsx",0);
		
	objcourse.DropDown();
	Thread.sleep(1000);
	objcourse.SoftwareTesting();
	
	String actualtext="Software Testing";
	String expectedtext=objcourse.GetText();
	
	
	objcourse.Apply();
	Thread.sleep(1000);
	objcourse.setName(name);  
	Thread.sleep(3000);
	objcourse.setEmail(email);
	Thread.sleep(3000);
	objcourse.setNumber(phnumber);
	Thread.sleep(5000);
	objcourse.Register();
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
		
	
	
	objcourse.Apply();
	Thread.sleep(1000);
	objcourse.setName(name);  
	Thread.sleep(3000);
	objcourse.setEmail(email);
	Thread.sleep(3000);
	objcourse.setNumber(phnumber);
	Thread.sleep(5000);
	objcourse.Register();
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

	
	
	objcourse.Apply();
	Thread.sleep(1000);
	objcourse.setName(name);  
	Thread.sleep(3000);
	objcourse.setEmail(email);
	Thread.sleep(3000);
	objcourse.setNumber(phnumber);
	Thread.sleep(5000);
	objcourse.Register();
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



objcourse.Apply();
Thread.sleep(1000);
objcourse.setName(name);  
Thread.sleep(3000);
objcourse.setEmail(email);
Thread.sleep(3000);
objcourse.setNumber(phnumber);
Thread.sleep(5000);
objcourse.Register();
Thread.sleep(5000);

String message=driver.switchTo().alert().getText();
Assert.assertEquals(message, "Invalid Credentials");
driver.switchTo().alert().dismiss();


}

}
