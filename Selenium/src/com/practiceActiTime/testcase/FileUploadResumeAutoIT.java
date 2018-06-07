package com.practiceActiTime.testcase;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

/**
 * 
 * @author Namitha
 *
 */
public class FileUploadResumeAutoIT {

	public static void main(String[] args) throws Throwable {
		WebDriver driver = new FirefoxDriver();
		
		driver.get("https://my.naukri.com/account/createaccount?othersrcp=16201&err=1");
		
		driver.findElement(By.name("userType")).click();
		
		driver.findElement(By.name("uploadCV")).click();
		
		Thread.sleep(3000);
		
		Runtime.getRuntime().exec("C:\\Users\\Namitha\\Documents\\AutoITPrograms\\ResumeUpload.exe");
		
		driver.close();
		

	}

}
