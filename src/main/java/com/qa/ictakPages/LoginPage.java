package com.qa.ictakPages;

import org.openqa.selenium.Alert;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.qa.ictakBase.Base;

public class LoginPage extends Base{

	
	@FindBy (xpath="//i[text()='fingerprint']")
	private WebElement Login;	


	@FindBy(xpath="//input[@placeholder='Enter Your Email']")
	private WebElement username;


	@FindBy (name="password")
	private WebElement password;

	@FindBy (xpath="//button[text()= ' Sign in ']")
    private WebElement Signin;
	
	@FindBy(xpath="//button[text()='OK']")
	private WebElement ok;
	
	//@FindBy(xpath="//a[@data-bs-toggle='collapse']")
	//private WebElement admin;
	//@FindBy(xpath="//span[text()=' Logout ']//parent::a")
	//private WebElement logout;

	@FindBy(xpath="//h4[text()='Dashboard']")
	private WebElement dashboard;
	@FindBy(xpath="//img[@class='avatar']//parent::a")
	private WebElement logout;
	@FindBy(xpath="//span[text()=' Logout ']//parent::a")
	private WebElement logout1;
	
	@FindBy(xpath="//h2[text()='Warning!!']")
	private WebElement message;
	
	public LoginPage(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);

	}
		
	public void LogIn()
	{
		Login.click();
		

	}



	public void setusername(String strName) 
	{
		
		
		username.sendKeys(strName);
	}


	public void setpassword(String Password)
	{
		
		password.sendKeys(Password);
	}
	public void signin()
	{
    	
    Signin.click();
	    
    		
   }
	
	
	
	
	public void Alertok()
	{
		ok.click();
		
	}
	public String Message()
	{
		return message.getText();
	}
	
	
	
	public void Logout()
	{
	//logout.click();	
	
	         try
	         {
		           logout.click();
	         }
	         catch(StaleElementReferenceException e) {
	        	 logout.click();
	         }
	         logout1.click();
	//driver.findElement(By.xpath("//span[text()=' Logout ']//parent::a")).click();
	
	}
	
	
	
public String alert()
{
Alert alert=driver.switchTo().alert();

String alertMessage=driver.switchTo().alert().getText();

System.out.println("Alert message : "+alertMessage);
alert.accept();
return alertMessage;
}


public String GetText() throws InterruptedException
{
String text=dashboard.getText();
System.out.println(text);
Thread.sleep(3000);
return text;

}

	
	
	
	
}
