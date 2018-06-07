package com.actiTime.genericLibs;

import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Listeners;

import com.actiTime.objectRepository.Home;
import com.actiTime.objectRepository.Login;

@Listeners(com.actiTime.genericLibs.SampleListener.class)
public class BaseClass {
	
	public static WebDriver driver;
	FileDataUtils lib = new FileDataUtils();
	
	@BeforeClass
	public void configBC() throws Throwable
	{

		Properties pObj = lib.getPropertiesFileObject();
		String url = pObj.getProperty("url");
		String browserName = pObj.getProperty("browser");
		
		if(browserName.equals("firefox")) {
			driver = new FirefoxDriver();
		}
		else if(browserName.equals("chrome")) {
			System.setProperty("webdriver.chrome.driver", "./Resources-Servers/chromedriver.exe");
			driver = new ChromeDriver();
		}
		else if(browserName.equals("internet explorer")) {
			System.setProperty("webdriver.ie.driver", "./Resources-Servers/IEDriver.exe");
			driver = new ChromeDriver();
		}
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.get(url);
	
	}
	
	@BeforeMethod
	public void configLogin() throws Throwable
	{
		Properties pObj = lib.getPropertiesFileObject();
		String username = pObj.getProperty("username");
		String password = pObj.getProperty("password");
		
		Login lp = PageFactory.initElements(driver, Login.class);
		lp.login(username, password);
	}
	
	@AfterMethod
	public void configLogout()
	{
		Home hp =PageFactory.initElements(driver, Home.class);
		hp.logout();
	}
	
	
	@AfterClass
	public void configAC()
	{
		driver.close();
	}

}
