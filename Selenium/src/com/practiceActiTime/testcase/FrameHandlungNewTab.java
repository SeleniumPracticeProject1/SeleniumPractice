package com.practiceActiTime.testcase;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

/**
 * 
 * @author Namitha
 *
 */
public class FrameHandlungNewTab {

	public static void main(String[] args) {
		WebDriver driver = new FirefoxDriver();
		
		driver.get("https://in.yahoo.com/?p=us");
		
		//Passing driver control parentFrame to childFrame
		driver.switchTo().frame("my-adsMAST-iframe");
		driver.switchTo().frame("aswift_0");
		driver.switchTo().frame("google_ads_frame1");
		driver.switchTo().frame("4_30412");
		driver.switchTo().frame("myObjID");
		
		//Clicking on Button inside the frame
		driver.findElement(By.id("canvas")).click();
		//driver.findElement(By.xpath("//div[@id='image1']/img")).click();
		
		
		//Passing driver control to New Window
		Set<String> set = driver.getWindowHandles();
		Iterator<String> it = set.iterator();
		String parentId=it.next();
		String childId=it.next();
		
		driver.switchTo().window(childId);
		
		//Entering data into element present in New Window-child window
		driver.findElement(By.id("fullname")).sendKeys("Namitha");
		
		//closing child-window
		driver.close();
		
		//Passing driver control back to parent-window
		driver.switchTo().window(parentId);
		
		//Closing parent-window
		driver.close();
	}

}
