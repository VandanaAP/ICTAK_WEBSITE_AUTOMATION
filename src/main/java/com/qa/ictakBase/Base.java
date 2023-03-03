package com.qa.ictakBase;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

public class Base {
	public	WebDriver driver;
	public static Properties prop=null;
		
	@BeforeTest
	
	public void settingup() throws IOException
	{
		
		prop=new Properties();
	FileInputStream pFile=new FileInputStream(System.getProperty("user.dir")+"\\src\\test\\resources\\CONFIGURE.PROPERTIES");
	prop.load(pFile);
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\dell\\Downloads\\chromedriver.exe");
	driver=new ChromeDriver();

	driver.get(prop.getProperty("url"));
	driver.manage().window().maximize();
	
	
}
	@AfterTest
	public void tearDown()
	{
		driver.quit();
	}
	
	
}
