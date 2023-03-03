package com.qa.ictakPages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.qa.ictakBase.Base;

public class STCourse extends Base{

	
	@FindBy(xpath="//a[@id=\'dropdownMenuBlocks\']")
	private WebElement courseDD;
	
	@FindBy (xpath="//span[text()='TESTING']//preceding-sibling::h6")
	private WebElement softwareTesting;
	
	@FindBy(xpath="//button[text()=' Apply Now ']")
	private WebElement apply;
	
@FindBy (xpath="//h1[text()='Software Testing']")
private WebElement text;

	@FindBy(xpath="//input[@name='name']")
	private WebElement name;
	

	@FindBy(xpath="//input[@placeholder='Email']")
	private WebElement email;
	
	@FindBy(xpath="//input[@name='phoneno']")
	private WebElement phnumber;
	
	
	@FindBy(xpath="//button[text()='Register']//parent::div")
	private WebElement register;
	
	
	@FindBy(xpath="//button[text()='OK']")
	private WebElement ok;
	
	public STCourse(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
		
	}
	
	public void DropDown()
	{
		courseDD.click();
		
	}
	
	public void SoftwareTesting()
	{
		softwareTesting.click();
		
		
	}
	public void Apply()
	{
		apply.click();
	}
	
	public void setName(String strName)
	{
		name.sendKeys(strName);
	}
	
	public void setEmail(String strEmail)
	{
		email.sendKeys(strEmail);
	}

	public void setNumber(String strNumber)
	{
		phnumber.sendKeys(strNumber);
	}
	
	public void Register()
	{
		register.click();
	}
	
	public void OK()
	{
		ok.click();
		
	}
	public String GetText() {
		
		return text.getText();
	}
	
	/*
	public String alert()
	{
		Alert alert=driver.switchTo().alert();
		
		String alertMessage=driver.switchTo().alert().getText();
		
		System.out.println("Alert message : "+alertMessage);
		alert.accept();
		return alertMessage;
	}
	*/
	
	
}
