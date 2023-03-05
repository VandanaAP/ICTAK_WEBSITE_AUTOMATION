package com.qa.ictakPages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.qa.ictakBase.Base;

public class ContactUs_Page extends Base {

	
	WebDriver driver;
@FindBy	(xpath="//a[@href='/LandingPage/contactus']")
WebElement contact;

@FindBy(xpath="//input[@name='name']")
WebElement name;
	
	@FindBy(xpath="//input[@placeholder='Email id']")
	WebElement email;
	
@FindBy(xpath="//input[@placeholder='What you love']")
WebElement coursename;

@FindBy(xpath="//input[@id='message']")
WebElement message;


//@FindBy(xpath="//div[@class='col-md-6 text-end ms-auto']//child::button")

@FindBy(xpath="//button[text()='Send Message']")
WebElement sendmessage;


@FindBy(xpath="//h2[text()='Say Hi!']")
private WebElement contactForm;

@FindBy(xpath="//span[text()='G1 Ground Floor Thejaswini Building Technopark Thiruvananthapuram Kerala India']")
private WebElement address;

@FindBy(xpath="//h3[text()='Contact Information']")
private WebElement contact_information;

public ContactUs_Page(WebDriver driver)
{
	this.driver=driver;
	PageFactory.initElements(driver, this);

}



public void ContactUs()
{
	contact.click();
	
}

public void setusername(String strName) 
{
	
	
	name.sendKeys(strName);
}
public void setemail(String strName) 
{
	
	
	email.sendKeys(strName);
}

public void CourseName(String strName) 
{
	
	
	coursename.sendKeys(strName);
}
public void Message(String strName) 
{
	
	
	message.sendKeys(strName);
}


public void SendMessage()
{
	
	
	sendmessage.click();
}

public String ContactForm()
{
	return contactForm.getText();
	
}
public String Address()
{
	return address.getText();
	
}
public String ContactDetails()
{
	return contact_information.getText();
}
}
