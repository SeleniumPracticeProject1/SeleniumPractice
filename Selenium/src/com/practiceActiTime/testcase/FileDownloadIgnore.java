package com.practiceActiTime.testcase;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxProfile;

/**
 * 
 * @author Namitha
 *
 */
public class FileDownloadIgnore {

	public static void main(String[] args) {
		
		FirefoxProfile profile = new FirefoxProfile();
		profile.setPreference("browser.download.folderList", 0);
		profile.setPreference("browser.helperApps.neverAsk.openFile", "application/pdf");
		
		WebDriver driver = new FirefoxDriver(profile);
		
		driver.navigate().to("https://www.tutorialspoint.com/selenium/selenium_pdf_version.htm");
		
		driver.findElement(By.xpath("//a[@class='left']/img")).click();
		
		Set<String> s = driver.getWindowHandles();
		Iterator<String> it  = s.iterator();
		String parentId = it.next();
		String childId = it.next();
		
		driver.switchTo().window(childId);
		
		driver.findElement(By.xpath("//button[@id='download']")).click();
		
		//driver.quit();
		
	}

}
