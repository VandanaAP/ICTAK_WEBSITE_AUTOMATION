package com.qa.ictakPages;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PartnershipPage 
{
	WebDriver driver;
	@FindBy(xpath="//h1[text()='PARTNERSHIP']")
	private WebElement PartnerPageTitle;
	@FindBy(xpath="//button[text()='Register Here']")
	private WebElement RegisterIcon;
	
	public PartnershipPage(WebDriver driver) 
	{
		this.driver=driver;
		PageFactory.initElements(driver,this);
	}
	
	
	public String GetTitle()
	{
		String Text=PartnerPageTitle.getText();
		return Text;
	}
	
	public String RegIcon()
	{
		String Text=RegisterIcon.getText();
		return Text;
	}
	public void clickRegIcon()
	{
		RegisterIcon.click();
	}
}
