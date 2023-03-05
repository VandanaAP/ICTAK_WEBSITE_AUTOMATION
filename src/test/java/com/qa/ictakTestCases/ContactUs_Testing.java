package com.qa.ictakTestCases;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.testng.Assert;
import org.testng.annotations.Test;


import com.qa.ictakBase.Base;
import com.qa.ictakPages.ContactUs_Page;
import com.qa.utilities.ExcelUtility;


public class ContactUs_Testing extends Base{

	
	ContactUs_Page contact;

	@Test(priority=1)
	public void contact_information_validation() throws InterruptedException
	{
		contact = new ContactUs_Page(driver);
		 driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		 Thread.sleep(3000);
	    contact.ContactUs();
	    Thread.sleep(3000);

		 String actualtext="Contact Information";
			String expectedtext=contact.ContactDetails();
			 
			Assert.assertEquals(actualtext, expectedtext);	 
		
		
	}
	
	@Test(priority=2)

	public void physical_address_validation() throws InterruptedException {
		 
		 String actualtext="G1 Ground Floor Thejaswini Building Technopark Thiruvananthapuram Kerala India";
		 String expectedtext=contact.Address();
			 
			Assert.assertEquals(actualtext, expectedtext);
			
	}
	
@Test(priority=3)
	
	public void ContactUs_form() throws IOException, InterruptedException
	{
		
	 
	 String actualtext="Say Hi!";
		String expectedtext=contact.ContactForm();
		 
		Assert.assertEquals(actualtext, expectedtext);
		 
	 
	}
	 	

@Test(priority=4)


public void contact_form_validation() throws IOException, InterruptedException {
	
	
	String name=ExcelUtility.getCellData(0,0,System.getProperty("user.dir")+"\\src\\main\\resources\\ContactData.xlsx",0);
	
	String email=ExcelUtility.getCellData(0,1,System.getProperty("user.dir")+"\\src\\main\\resources\\ContactData.xlsx",0);
String coursename=ExcelUtility.getCellData(0,2,System.getProperty("user.dir")+"\\src\\main\\resources\\ContactData.xlsx",0);
	
	String message=ExcelUtility.getCellData(0,3,System.getProperty("user.dir")+"\\src\\main\\resources\\ContactData.xlsx",0);
	
	contact.setusername(name);
	
	contact.setemail(email);
	
	contact.CourseName(coursename);

	contact.Message(message);
	contact.SendMessage();
	
	
	

	String text=driver.switchTo().alert().getText();
	Assert.assertEquals(text, "Message Send! Our Expert Team will Contact you Soon!");
	driver.switchTo().alert().dismiss();
	
}


}