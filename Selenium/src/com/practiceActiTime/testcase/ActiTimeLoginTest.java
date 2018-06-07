package com.practiceActiTime.testcase;

import java.util.Properties;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

import com.actiTime.genericLibs.FileDataUtils;

/**
 * 
 * @author Namitha
 *
 */
public class ActiTimeLoginTest {

	@Test
	public static void LoginTest() throws Throwable
	{
		
		FileDataUtils lib = new FileDataUtils();
		
		Properties pObj = lib.getPropertiesFileObject();
		String url = pObj.getProperty("url");
		String username = pObj.getProperty("username");
		String password = pObj.getProperty("password");
		
		WebDriver driver =new FirefoxDriver();
		driver.get(url);
		
		driver.findElement(By.name("username")).sendKeys(username);
		driver.findElement(By.name("pwd")).sendKeys(password);
		driver.findElement(By.id("loginButton")).click();
		
		Thread.sleep(2000); 
		
		//Xpath for logout link====> a[@id='logoutLink']
		
		driver.findElement(By.id("logoutLink")).click();
		
		driver.close();
	}

}
