package com.qa.ictakPages;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.qa.ictakBase.Base;

public class AdminDashboard extends Base{

	
	@FindBy(xpath="//a[@href='/adminpage/registered-users']")
	private WebElement courseRegestration;
	
	
	@FindBy(xpath="//i[text()='arrow_downward']")
	private WebElement download;
	
	@FindBy(xpath="//span[text()='Academic Membership']//parent::a")
	private WebElement academicMembership;
	
	@FindBy(xpath="//span[text()='Partnership']//parent::a")
	private WebElement partnership;
	
	@FindBy(xpath="//span[text()='Corporate Membership']//parent::a")
	private WebElement corporate;
	
	@FindBy(xpath="//h3[text()='User Registration List']")
	private WebElement UserRegistration;
	
	@FindBy(xpath="//h5[text()='Partnership Application']")
	private WebElement partnershipApplication;
	
	@FindBy(xpath="//h3[text()='Academic Membership']")
	private WebElement academicText;
	
	@FindBy(xpath="//h5[text()='Corporate Membership']")
	
	private WebElement corporateText;
	public AdminDashboard(WebDriver driver)
	{
	      this.driver=driver;
		PageFactory.initElements(driver, this);
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	}
	
	
public void CourseRegistration()
{
	courseRegestration.click();
	 try
     {
		 courseRegestration.click();
     }
     catch(StaleElementReferenceException e) {
    	 courseRegestration.click();
     }
	
}

public void PartnershipRegistration()
{
	partnership.click();
	
	
}

public void CorporateMembership()
{
	corporate.click();
	
	
}
	
public void Download()
	{
		download.click();
	}
	
	public void AcademicMembership()
	{
		academicMembership.click();
	}
	public String UserRegistration()
	{
		return UserRegistration.getText();
		
	}
	public String PartnershipApplication()
	{
		return partnershipApplication.getText();
	}
	public String AcademicText() {
		return academicText.getText();
		
	}
	
	public String CorporateText()
	{
		return corporateText.getText();
		
		
	}
	
	
	
}
