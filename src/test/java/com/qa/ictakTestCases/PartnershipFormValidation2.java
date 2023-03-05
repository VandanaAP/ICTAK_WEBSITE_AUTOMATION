package com.qa.ictakTestCases;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.qa.ictakBase.Base;
import com.qa.ictakPages.HomePage;
import com.qa.ictakPages.PartnerFormPage;
import com.qa.ictakPages.PartnershipPage;
import com.qa.utilities.ExcelUtility;


public class PartnershipFormValidation2 extends Base
{
	
	
	HomePage objHome;
	PartnershipPage objPartner;
	PartnerFormPage objPartnerForm;
	@Test(priority=1)
	public void partnershipFormValidation2_TC_407() throws InterruptedException, IOException
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
		String Phonenumber = ExcelUtility.getIntegerData(2, 0, System.getProperty("user.dir")+"\\src\\main\\resources\\ExcelUtilities.xlsx",0);
		objPartnerForm.setPhoneNum(Phonenumber);
		Thread.sleep(1000);
		String Firm = ExcelUtility.getIntegerData(1, 1, System.getProperty("user.dir")+"\\src\\main\\resources\\ExcelUtilities.xlsx",0);
		objPartnerForm.setFirm(Firm);
		Thread.sleep(1000);
		String Address = ExcelUtility.getCellData(2, 1, System.getProperty("user.dir")+"\\src\\main\\resources\\ExcelUtilities.xlsx",0);
		objPartnerForm.setAddress(Address);
		Thread.sleep(1000);
		String District = ExcelUtility.getCellData(1, 0, System.getProperty("user.dir")+"\\src\\main\\resources\\ExcelUtilities.xlsx",0);
		objPartnerForm.setDistrict(District);
		Thread.sleep(1000);
		objPartnerForm.ScrollDown500();
		Thread.sleep(1000);
		String Office = ExcelUtility.getIntegerData(3, 0, System.getProperty("user.dir")+"\\src\\main\\resources\\ExcelUtilities.xlsx",0);
		objPartnerForm.setOffice(Office);
		Thread.sleep(1000);
		String Employee = ExcelUtility.getIntegerData(3, 1, System.getProperty("user.dir")+"\\src\\main\\resources\\ExcelUtilities.xlsx",0);
		objPartnerForm.setEmployee(Employee);
		Thread.sleep(1000);
		String Briefrepot = ExcelUtility.getCellData(4, 0, System.getProperty("user.dir")+"\\src\\main\\resources\\ExcelUtilities.xlsx",0);
		objPartnerForm.setBriefReport(Briefrepot);
		Thread.sleep(1000);
		String Expects = ExcelUtility.getCellData(4, 1, System.getProperty("user.dir")+"\\src\\main\\resources\\ExcelUtilities.xlsx",0);
		objPartnerForm.setExpects(Expects);
		Thread.sleep(1000);
		String Promoters = ExcelUtility.getCellData(5, 0, System.getProperty("user.dir")+"\\src\\main\\resources\\ExcelUtilities.xlsx",0);
		objPartnerForm.setPromoters(Promoters);
		Thread.sleep(2000);
		objPartnerForm.clickSendMsgBtn();
		Thread.sleep(2000);
	
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
