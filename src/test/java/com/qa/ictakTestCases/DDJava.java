package com.qa.ictakTestCases;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.qa.ictakBase.Base;
import com.qa.ictakPages.Courses;
import com.qa.utilities.ExcelUtility;

public class DDJava extends Base {
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
		coursesDD.clickjava();
		
		String Text=coursesDD.JavaGetText();
		Assert.assertEquals(Text,"Advanced Java Programming");
				
		coursesDD.clickFSapply();
		coursesDD.setName(name);
		coursesDD.setEmail(email);
		coursesDD.setNumber(phnumber);
		coursesDD.clickFSregister();
		Thread.sleep(5000);
		
		String AlertMsg=coursesDD.GetAlertMsg();
		Assert.assertEquals(AlertMsg, "Registration Successfull");
		driver.switchTo().alert().accept();
	}//TC_07&TC_08&TC_09
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
		Thread.sleep(5000);
		
		String AlertMsg=coursesDD.GetAlertMsg();
		Assert.assertEquals(AlertMsg, "Registration Unsuccessfull, enter valid email");
		driver.switchTo().alert().accept();
	}//TC_10
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
	Thread.sleep(5000);
	
	String AlertMsg=coursesDD.GetAlertMsg();
	Assert.assertEquals(AlertMsg, "Registration Unsuccessfull, enter valid number");
	driver.switchTo().alert().accept();
}//TC_11
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
	Thread.sleep(5000);
	
	String AlertMsg=coursesDD.GetAlertMsg();
	Assert.assertEquals(AlertMsg, "Registration Unsuccessfull, enter valid name");
	driver.switchTo().alert().accept();
}//TC_12
	
}
