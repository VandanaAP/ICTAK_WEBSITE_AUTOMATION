package com.qa.ictakTestCases;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.qa.ictakBase.Base;
import com.qa.ictakPages.HomePage;
import com.qa.ictakPages.PartnerFormPage;
import com.qa.ictakPages.PartnershipPage;
import com.qa.utilities.ExcelUtility;

public class PartnershipFormValidation4 extends Base
{
	HomePage objHome;
    PartnershipPage objPartner;
    PartnerFormPage objPartnerForm;
@Test(priority=1)
public void partnershipFormValidation4_TC_410() throws InterruptedException, IOException

{
	objHome=new HomePage(driver);
	objPartner=new PartnershipPage(driver);
	objPartnerForm=new PartnerFormPage(driver);
	
	objHome.clickMembership();
	Thread.sleep(2000);
	objHome.clickPartnership();
	Thread.sleep(2000);
	objPartner.clickRegIcon();
	Thread.sleep(2000);
	objPartnerForm.ScrollDown300();
	String Fullname = ExcelUtility.getCellData(0, 0, System.getProperty("user.dir")+"\\src\\main\\resources\\ExcelUtilities.xlsx",0);
	objPartnerForm.setFullName(Fullname);
	Thread.sleep(1000);
	String Email = ExcelUtility.getCellData(0, 1, System.getProperty("user.dir")+"\\src\\main\\resources\\ExcelUtilities.xlsx",0);
	objPartnerForm.setEmail(Email);
	Thread.sleep(1000);
	String Phonenumber = ExcelUtility.getIntegerData(2, 2, System.getProperty("user.dir")+"\\src\\main\\resources\\ExcelUtilities.xlsx",0);
	objPartnerForm.setPhoneNum(Phonenumber);
	Thread.sleep(2000);
	objPartnerForm.ScrollDown500();
	String Briefrepot = ExcelUtility.getCellData(4, 0, System.getProperty("user.dir")+"\\src\\main\\resources\\ExcelUtilities.xlsx",0);
	objPartnerForm.setBriefReport(Briefrepot);
	Thread.sleep(1000);
	objPartnerForm.clickSendMsgBtn();
	Thread.sleep(2000);

	String AlertMsg=objPartnerForm.GetAlertMsg();
	System.out.println(AlertMsg);
	Assert.assertEquals(AlertMsg,"Registration UnSuccessfull, Invalid PhoneNumber");
}
}


