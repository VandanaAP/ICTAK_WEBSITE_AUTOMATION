package com.qa.ictakTestCases;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.qa.ictakBase.Base;
import com.qa.ictakPages.HomePage;
import com.qa.ictakPages.PartnerFormPage;
import com.qa.ictakPages.PartnershipPage;
import com.qa.utilities.ExcelUtility;

public class PartnershipFormValidation1 extends Base
{
	HomePage objHome;
	PartnershipPage objPartner;
	PartnerFormPage objPartnerForm;
	@Test(priority=1)
	public void partnershipFormValidation1_TC_405_406_409() throws InterruptedException, IOException
	{
		objHome=new HomePage(driver);
		objPartner=new PartnershipPage(driver);
		objPartnerForm=new PartnerFormPage(driver);
		
		objHome.clickMembership();
		objHome.clickPartnership();
		objPartner.clickRegIcon();
		
		objPartnerForm.ScrollDown300();
		String Fullname = ExcelUtility.getCellData(0, 0, System.getProperty("user.dir")+"\\src\\main\\resources\\ExcelUtilities.xlsx",0);
		objPartnerForm.setFullName(Fullname);
		
		String Email = ExcelUtility.getCellData(0, 1, System.getProperty("user.dir")+"\\src\\main\\resources\\ExcelUtilities.xlsx",0);
		objPartnerForm.setEmail(Email);
		
		String Phonenumber = ExcelUtility.getIntegerData(2, 0, System.getProperty("user.dir")+"\\src\\main\\resources\\ExcelUtilities.xlsx",0);
		objPartnerForm.setPhoneNum(Phonenumber);
		
		objPartnerForm.ScrollDown200();
		String Briefrepot = ExcelUtility.getCellData(4, 0, System.getProperty("user.dir")+"\\src\\main\\resources\\ExcelUtilities.xlsx",0);
		objPartnerForm.setBriefReport(Briefrepot);
		objPartnerForm.ScrollDown500();
		
		Thread.sleep(1000);
		objPartnerForm.clickSendMsgBtn();
		Thread.sleep(1000);
		String AlertMsg=objPartnerForm.GetAlertMsg();
		System.out.println(AlertMsg);
		Assert.assertEquals(AlertMsg,"Registration Successfull");
	}
	
	@Test(priority=2)
	public void mailSendVerification() throws InterruptedException
	{
		String AlertMsg=objPartnerForm.GetAlertMsg();
		Assert.assertEquals(AlertMsg,"Confirmation mail is sent");
	}

}
