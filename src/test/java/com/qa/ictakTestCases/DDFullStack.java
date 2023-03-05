package com.qa.ictakTestCases;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.asynchttpclient.util.Assertions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.qa.ictakBase.Base;
import com.qa.ictakPages.Courses;
import com.qa.utilities.ExcelUtility;

public class DDFullStack extends Base{
	Courses coursesDD;
	@Test(priority=1)
	public void ValidNameEmailNumber() throws InterruptedException, IOException
	{
		coursesDD=new Courses(driver);
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		String name=ExcelUtility.getCellData(0,0,System.getProperty("user.dir")+"\\src\\main\\resources\\CourseRegnData.xlsx",0);
		String email=ExcelUtility.getCellData(0,1,System.getProperty("user.dir")+"\\src\\main\\resources\\CourseRegnData.xlsx",0);
		String phnumber=ExcelUtility.getIntegerData(0,2,System.getProperty("user.dir")+"\\src\\main\\resources\\CourseRegnData.xlsx",0);
		
		coursesDD.clickCourseDD();
		coursesDD.clickFullStackDD();
		String Text=coursesDD.FSGetText();
		Assert.assertEquals(Text,"CERTIFIED SPECIALIST IN FULL STACK DEVELOPMENT using MEAN");
				
		coursesDD.clickFSapply();
		coursesDD.setName(name);
		coursesDD.setEmail(email);
		coursesDD.setNumber(phnumber);		
		coursesDD.clickFSregister();
				
	    String expectedAlertMessage = "Registration Successfull";
	    String actualAlertMessage = driver.switchTo().alert().getText();
	    Assert.assertEquals(actualAlertMessage,expectedAlertMessage);
	    driver.switchTo().alert().accept();
		Thread.sleep(3000);
	}//TC_03
@Test(priority=2)
	
	public void ValidNameInvalidEmailValidNumber() throws IOException, InterruptedException
	{
		coursesDD = new Courses(driver);
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
				
		String name=ExcelUtility.getCellData(1,0,System.getProperty("user.dir")+"\\src\\main\\resources\\CourseRegnData.xlsx",0);
		String email=ExcelUtility.getCellData(1,1,System.getProperty("user.dir")+"\\src\\main\\resources\\CourseRegnData.xlsx",0);
		String phnumber=ExcelUtility.getIntegerData(1,2,System.getProperty("user.dir")+"\\src\\main\\resources\\CourseRegnData.xlsx",0);
			
		coursesDD.clickFSapply();
		coursesDD.setName(name);  
		coursesDD.setEmail(email);
		coursesDD.setNumber(phnumber);
		coursesDD.clickFSregister();
		
		String expectedAlertMessage = "Invalid Email";
	    String actualAlertMessage = driver.switchTo().alert().getText();
	    Assert.assertEquals(actualAlertMessage,expectedAlertMessage);
	    driver.switchTo().alert().accept();
		Thread.sleep(3000);
	}//TC_04
	
@Test(priority=3)

public void ValidNameValidEmailInvalidNumber() throws IOException, InterruptedException
{
	coursesDD = new Courses(driver);
	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
	String name=ExcelUtility.getCellData(2,0,System.getProperty("user.dir")+"\\src\\main\\resources\\CourseRegnData.xlsx",0);
	String email=ExcelUtility.getCellData(2,1,System.getProperty("user.dir")+"\\src\\main\\resources\\CourseRegnData.xlsx",0);
	String phnumber=ExcelUtility.getIntegerData(2,2,System.getProperty("user.dir")+"\\src\\main\\resources\\CourseRegnData.xlsx",0);
	
	coursesDD.clickFSapply();
	coursesDD.setName(name);  
	coursesDD.setEmail(email);
	coursesDD.setNumber(phnumber);
	coursesDD.clickFSregister();
	
	String expectedAlertMessage = "Invalid Number";
    String actualAlertMessage = driver.switchTo().alert().getText();
    Assert.assertEquals(actualAlertMessage,expectedAlertMessage);
    driver.switchTo().alert().accept();
	Thread.sleep(3000);
}//TC_05

@Test(priority=4)

public void InvalidNameValidEmailValidNumber() throws IOException, InterruptedException
{
	coursesDD = new Courses(driver);
	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
	String name=ExcelUtility.getCellData(3,0,System.getProperty("user.dir")+"\\src\\main\\resources\\CourseRegnData.xlsx",0);
	String email=ExcelUtility.getCellData(3,1,System.getProperty("user.dir")+"\\src\\main\\resources\\CourseRegnData.xlsx",0);
	String phnumber=ExcelUtility.getIntegerData(3,2,System.getProperty("user.dir")+"\\src\\main\\resources\\CourseRegnData.xlsx",0);
	
	coursesDD.clickFSapply();
	coursesDD.setName(name);  
	coursesDD.setEmail(email);
	coursesDD.setNumber(phnumber);
	coursesDD.clickFSregister();
		
    String expectedAlertMessage = "Enter valid name";
    String actualAlertMessage = driver.switchTo().alert().getText();
    Assert.assertEquals(actualAlertMessage,expectedAlertMessage);
    driver.switchTo().alert().accept();
	Thread.sleep(3000);
}//TC_06
}
