package com.qa.ictakPages;

import org.openqa.selenium.Alert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.qa.ictakBase.Base;

public class Courses extends Base{
	WebDriver driver;
	
	@FindBy(xpath="//a[@id=\'dropdownMenuBlocks\']")
	private WebElement courseDD;
	
	//elements for FullStack
	@FindBy(xpath="//span[text()='FULL STACK' and @class='text-sm']")
	private WebElement fullstack;
	
	@FindBy(xpath="//button[text()=' Apply Now ']")
	private WebElement FSapply;
	
	@FindBy(xpath="//h2[text()='CERTIFIED SPECIALIST IN FULL STACK DEVELOPMENT using MEAN']")
	private WebElement FSTitle;
	
	//common elements
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
	
	//elements for JAVA
	@FindBy(xpath="//li[@class='nav-item dropdown dropdown-hover dropdown-subitem ng-star-inserted'][3]")
	private WebElement java;
	
	@FindBy(xpath="//button[text()=\' Apply Now \']")
	private WebElement Javaapply;
	
	@FindBy(xpath="//h2[text()='Advanced Java Programming']")
	private WebElement JavaTitle;
		
	public Courses(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
		
	}
	
	public void clickCourseDD() throws InterruptedException
	{
		courseDD.click();
		Thread.sleep(3000);
	}
	
	public void clickFullStackDD() throws InterruptedException
	{
		fullstack.click();
		Thread.sleep(3000);
	}
	
	public void clickFSapply() throws InterruptedException
	{
		FSapply.click();
		Thread.sleep(3000);
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
	
	public void clickFSregister() throws InterruptedException
	{
		register.click();
		Thread.sleep(3000);
	} 
	
	public void OK() throws InterruptedException
	{
		ok.click();
	}
	
	public void clickjava() throws InterruptedException
	{
		java.click();
	}
	
	public void applyjava() throws InterruptedException
	{
		Javaapply.click();
	}
	
	public String FSGetText()
	{
		String Text=FSTitle.getText();
		return Text;
	} 
	public String JavaGetText()
	{
		String Text=JavaTitle.getText();
		return Text;
	} 
	public String GetAlertMsg()
	{
		Alert alert=driver.switchTo().alert();
		String alertMessage=alert.getText();
		return alertMessage;
	}
	public void AcceptAlertMsg()
	{
		Alert alert=driver.switchTo().alert();
		alert.accept();
	}
}

