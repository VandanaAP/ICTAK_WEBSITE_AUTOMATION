package com.qa.ictakPages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage {
	
	WebDriver driver;
	
	@FindBy(xpath="(//a[@id='dropdownMenuDocs'])[1]")
	private WebElement membership;
	@FindBy(xpath="//a[@href='/LandingPage/partnership']")
	private WebElement partnership;
	@FindBy(xpath="//h6[text()=' Partnership ']")
	private WebElement PartnershipIcon;
	
	public HomePage(WebDriver driver) 
	{
		this.driver=driver;
		PageFactory.initElements(driver,this);
	}
	public void clickMembership()
	{
		membership.click();
	}
	public String GetIcon()
	{
		String Text=PartnershipIcon.getText();
		return Text;
	}
	public void clickPartnership()
	{
		partnership.click();
	}
	

}
