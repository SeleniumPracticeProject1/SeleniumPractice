package com.practiceActiTime.testcase;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxProfile;

/**
 * 
 * @author Namitha
 *
 */
public class FileDownloadIgnoreZipFile {

	public static void main(String[] args) {
		FirefoxProfile profile = new FirefoxProfile();
		profile.setPreference("browser.download.folderList", 2);
		profile.setPreference("browser.helperApps.neverAsk.openFile", "application/zip");
		profile.setPreference("browser.download.dir", "E:\\");
		
		WebDriver driver = new FirefoxDriver(profile);
		
		//driver.manage().window().maximize();
		
		driver.get("https://github.com/mozilla/geckodriver/releases");
		
		driver.findElement(By.xpath("//strong[text()='geckodriver-v0.20.1-win64.zip']")).click();

	}

}
