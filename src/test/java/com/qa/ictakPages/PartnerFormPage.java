package com.qa.ictakPages;



import org.openqa.selenium.Alert;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PartnerFormPage {
	
	WebDriver driver;
	
	@FindBy(xpath="//h1[text()='Work with Us']")
	private WebElement PartnerFormPageTitle;
	@FindBy(xpath="//h3[text()='PARTNERSHIP FORM']")
	private WebElement PartnerFormTitle;
	
	@FindBy(xpath="//label[text()='Full Name']")
	private WebElement FullnameLabel;
	@FindBy(xpath="//input[@placeholder='Name' and @type='text']")
	private WebElement FullnameField;
	
	@FindBy(xpath="//input[@placeholder=' Email']//preceding-sibling::label")
	private WebElement EmailLabel;
	@FindBy(xpath="//input[@placeholder=' Email']")
	private WebElement EmailField;
	
	@FindBy(xpath="//label[text()='Phone Number']")
	private WebElement PhoneNumLabel;
	@FindBy(xpath="//input[@placeholder=' Contact Number' and @name='phone']")
	private WebElement PhoneNumField;
	
	@FindBy(xpath="//label[text()='Firm']")
	private WebElement FirmLabel;
	@FindBy(xpath="//input[@placeholder='Published Date']")
	private WebElement FirmField;
	
	@FindBy(xpath="//label[text()='Address']")
	private WebElement AddressLabel;
	@FindBy(xpath="//input[@placeholder='Address']")
	private WebElement AddressField;
	
	@FindBy(xpath="//label[text()='District']")
	private WebElement DistrictLabel;
	@FindBy(xpath="//input[@placeholder='Distict']")
	private WebElement DistrictField;
	
	@FindBy(xpath="//label[text()='Office Space in Square Feet']")
	private WebElement OfficeLabel;
	@FindBy(xpath="//label[text()='Office Space in Square Feet']//following-sibling::input")
	private WebElement OfficeField;
	
	@FindBy(xpath="//label[text()='Number of Employees']")
	private WebElement EmployeeLabel;
	@FindBy(xpath="//label[text()='Number of Employees']//following-sibling::input")
	private WebElement EmployeeField;
	
	@FindBy(xpath="//label[text()='Brief Report']")
	private WebElement BriefReportLabel;
	@FindBy(xpath="//label[text()='Brief Report']//following-sibling::textarea")
	private WebElement BriefReportField;
	
	@FindBy(xpath="//label[text()='Expects']")
	private WebElement ExpectsLabel;
	@FindBy(xpath="//label[text()='Expects']//following-sibling::textarea")
	private WebElement ExpectsField;
	
	@FindBy(xpath="//label[text()='Promoters']")
	private WebElement PromotersLabel;
	@FindBy(xpath="//textarea[@placeholder='Brief Profile of the promoters']")
	private WebElement PromotersField;
	
	@FindBy(xpath="//button[text()='Send Message']")
	private WebElement SendMsgBtn;
		
	public PartnerFormPage(WebDriver driver) 
	{
		this.driver=driver;
		PageFactory.initElements(driver,this);
	}
	
	//Methods for getting form page entries title
	
	public String GetFormPageTitle()
	{
		String Text=PartnerFormPageTitle.getText();
		return Text;
	}
	public String GetFormTitle()
	{
		String Text=PartnerFormTitle.getText();
		return Text;
	}
	public String GetFullnameLabel()
	{
		String Text=FullnameLabel.getText();
		return Text;
	}
	public String GetEmailLabel()
	{
		String Text=EmailLabel.getText();
		return Text;
	}
	public String GetPhoneNumLabel()
	{
		String Text=PhoneNumLabel.getText();
		return Text;
	}
	public String GetFirmLabel()
	{
		String Text=FirmLabel.getText();
		return Text;
	}
	public String GetAddressLabel()
	{
		String Text=AddressLabel.getText();
		return Text;
	}
	public String GetDistrictLabel()
	{
		String Text=DistrictLabel.getText();
		return Text;
	}
	public String GetOfficeLabel()
	{
		String Text=OfficeLabel.getText();
		return Text;
	}
	public String GetEmployeeLabel()
	{
		String Text=EmployeeLabel.getText();
		return Text;
	}
	public String GetBriefReportLabel()
	{
		String Text=BriefReportLabel.getText();
		return Text;
	}
	public String GetExpectsLabel()
	{
		String Text=ExpectsLabel.getText();
		return Text;
	}
	public String GetPromotersLabel()
	{
		String Text=PromotersLabel.getText();
		return Text;
	}
	public String GetSendMsgBtn()

	{
		String Text=SendMsgBtn.getText();
		return Text;
	}
	
	//Methods for Alert messeges
	
	public String GetAlertMsg()
	{   
		Alert alert = driver.switchTo().alert();
	    String alertMessage= alert.getText();
		return alertMessage;
	}
	
	//Methods for page scrolldown
	
	public void ScrollDown300()
    {   
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,300)");
	}
	public void ScrollDown500()
    {   
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,500)");
	}
	public void ScrollDown200()
    {   
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,200)");
	}
	
	//Method for form page Send message button clicking

	public void clickSendMsgBtn()
	{
		SendMsgBtn.click();
	}
	
	//Methods for form page entries data sending
	
	public void setFullName(String strFullName)
	{
		FullnameField.sendKeys(strFullName);
	}
	public void setEmail(String strEmail)
	{
		EmailField.sendKeys(strEmail);
	}
	public void setPhoneNum(String strPhoneNum)
	{
		PhoneNumField.sendKeys(strPhoneNum);
	}
	public void setFirm(String strfirm)
	{
		FirmField.sendKeys(strfirm);
	}
	public void setAddress(String strAddress)
	{
		AddressField.sendKeys(strAddress);
	}
	public void setDistrict(String strDistrict)
	{
		DistrictField.sendKeys(strDistrict);
	}
	public void setOffice(String strOffice)
	{
		OfficeField.sendKeys(strOffice);
	}
	public void setEmployee(String strEmployee)
	{
		EmployeeField.sendKeys(strEmployee);
	}
	public void setBriefReport(String strBriefReport)
	{
		BriefReportField.sendKeys(strBriefReport);
	}
	public void setExpects(String strExpects)
	{
		ExpectsField.sendKeys(strExpects);
	}
	public void setPromoters(String strPromoters)
	{
		PromotersField.sendKeys(strPromoters);
	}
	
	// Methods for checking whether form page entries enabled or not
	
	public boolean EnFullname()
	{
		return FullnameField.isEnabled();
	}
	public boolean EnEmail()
	{
		return EmailField.isEnabled();
	}
	public boolean EnPhoneNum()
	{
		return PhoneNumField.isEnabled();
	}
	public boolean EnFirm()
	{
		return FirmField.isEnabled();
	}
	public boolean EnAddress()
	{
		return AddressField.isEnabled();
	}
	public boolean EnDistrict()
	{
		return DistrictField.isEnabled();
	}
	public boolean EnOffice()
	{
		return OfficeField.isEnabled();
	}
	public boolean EnEmployee()
	{
		return EmployeeField.isEnabled();
	}
	public boolean EnBriefReport()
	{
		return BriefReportField.isEnabled();
	}
	public boolean EnExpects()
	{
		return ExpectsField.isEnabled();
	}
	public boolean EnPromoters()
	{
		return PromotersField.isEnabled();
	}
	public boolean EnSendMsgBtn()
	{
		return SendMsgBtn.isEnabled();
	}
	public boolean SelSendMsgBtn()
	{
		return SendMsgBtn.isSelected();
	}
}
