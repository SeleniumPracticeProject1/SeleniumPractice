package com.practiceActiTime.testcase;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

/**
 * 
 * @author Namitha
 *
 */
public class ReadDataFromPropertiesFile {

	public static void main(String[] args) throws Throwable {
	
		//Create java object for physical file
		FileInputStream file = new FileInputStream("./commomData.properties");
		
		//Create object to properties class, load and get the data
		Properties prop = new Properties();
		prop.load(file);
		String user = prop.getProperty("username");
		String pwd = prop.getProperty("password");
		String url = prop.getProperty("url");
		
		System.out.println(user+"\n"+pwd+"\n"+url);
		
		
		WebDriver driver = new FirefoxDriver();
		driver.get(url);
		
		driver.close();

	}

}
