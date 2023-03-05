package com.qa.ictakTestCases;
import org.testng.Assert;
import org.testng.annotations.Test;
import com.qa.ictakBase.Base;
import com.qa.ictakPages.HomePage;
import com.qa.ictakPages.PartnerFormPage;
import com.qa.ictakPages.PartnershipPage;

public class PartnershipPageValidation extends Base 
{
	HomePage objHome;
	PartnershipPage objPartner;
	PartnerFormPage objPartnerForm;
@Test(priority=1)
	public void partnershipPageValidation_TC_401() throws InterruptedException
	{
	objHome=new HomePage(driver);
	objPartner=new PartnershipPage(driver);
	
	
	
	objHome.clickMembership();	
	
	String Icon=objHome.GetIcon();
	Assert.assertEquals(Icon,"Partnership");
	
	objHome.clickPartnership();
	
	
	String Title=objPartner.GetTitle();
	Assert.assertEquals(Title,"PARTNERSHIP");
	
	
	
	String RegIcon=objPartner.RegIcon();
	Assert.assertEquals(RegIcon,"REGISTER HERE");

	}
@Test(priority=2)
	public void partnershipPageValidation_TC_402() throws InterruptedException
	{
	objPartnerForm=new PartnerFormPage(driver);
	objPartner.clickRegIcon();
	Thread.sleep(2000);
	
	String FormPageTitle=objPartnerForm.GetFormPageTitle();
	Assert.assertEquals(FormPageTitle,"Work with Us");
	
	String FormTitle=objPartnerForm.GetFormTitle();
	Assert.assertEquals(FormTitle,"PARTNERSHIP FORM");
	
	}
@Test(priority=3)
public void partnershipPageValidation_TC_403() throws InterruptedException
{
	objPartnerForm.ScrollDown500();
	
	String FullnameLabel=objPartnerForm.GetFullnameLabel();
	Assert.assertEquals(FullnameLabel,"Full Name");
	Assert.assertTrue(objPartnerForm.EnFullname());
	Thread.sleep(2000);
	
	String EmailLabel=objPartnerForm.GetEmailLabel();
	Assert.assertEquals(EmailLabel,"Email");
	Assert.assertTrue(objPartnerForm.EnEmail());
	Thread.sleep(2000);
	
	objPartnerForm.ScrollDown300();
	
	String PhoneNumLabel=objPartnerForm.GetPhoneNumLabel();
	Assert.assertEquals(PhoneNumLabel,"Phone Number");
	Assert.assertTrue(objPartnerForm.EnPhoneNum());
	Thread.sleep(2000);
	
	String FirmLabel=objPartnerForm.GetFirmLabel();
	Assert.assertEquals(FirmLabel,"Firm");
	Assert.assertTrue(objPartnerForm.EnFirm());
	Thread.sleep(2000);
	
	objPartnerForm.ScrollDown300();
	
	String AddressLabel=objPartnerForm.GetAddressLabel();
	Assert.assertEquals(AddressLabel,"Address");
	Assert.assertTrue(objPartnerForm.EnAddress());
	Thread.sleep(2000);
	
	String DistrictLabel=objPartnerForm.GetDistrictLabel();
	Assert.assertEquals(DistrictLabel,"District");
	Assert.assertTrue(objPartnerForm.EnDistrict());
	Thread.sleep(2000);
	
	objPartnerForm.ScrollDown300();
	
	String OfficeLabel=objPartnerForm.GetOfficeLabel();
	Assert.assertEquals(OfficeLabel,"Office Space in Square Feet");
	Assert.assertTrue(objPartnerForm.EnOffice());
	Thread.sleep(2000);
	
	String EmployeeLabel=objPartnerForm.GetEmployeeLabel();
	Assert.assertEquals(EmployeeLabel,"Number of Employees");
	Assert.assertTrue(objPartnerForm.EnEmployee());
	Thread.sleep(2000);
	
	objPartnerForm.ScrollDown300();
	
	String BriefReportLabel=objPartnerForm.GetBriefReportLabel();
	Assert.assertEquals(BriefReportLabel,"Brief Report");
	Assert.assertTrue(objPartnerForm.EnBriefReport());
	Thread.sleep(2000);

	String ExpectsLabel=objPartnerForm.GetExpectsLabel();
	Assert.assertEquals(ExpectsLabel,"Expects");
	Assert.assertTrue(objPartnerForm.EnExpects());
	Thread.sleep(2000);
	
	objPartnerForm.ScrollDown300();
	
	String PromotersLabel=objPartnerForm.GetPromotersLabel();
	Assert.assertEquals(PromotersLabel,"Promoters");
	Assert.assertTrue(objPartnerForm.EnPromoters());
	Thread.sleep(2000);
	
	objPartnerForm.ScrollDown300();
	
	String SendMsgBtn=objPartnerForm.GetSendMsgBtn();
	Assert.assertEquals(SendMsgBtn,"SEND MESSAGE");
	Assert.assertTrue(objPartnerForm.EnSendMsgBtn());
	Thread.sleep(2000);
		
}
@Test(priority=4)

public void partnershipPageValidation_TC_404() throws InterruptedException
{	
	objPartnerForm.clickSendMsgBtn();
	String AlertMsg=objPartnerForm.GetAlertMsg();
	System.out.println(AlertMsg);
	Thread.sleep(2000);
	Assert.assertEquals(AlertMsg,"Required fields cannot be empty");
}
}
