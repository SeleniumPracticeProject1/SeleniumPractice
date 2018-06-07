package com.practiceActiTime.testcase;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

/**
 * 
 * @author Namitha
 *
 */
public class FlipkartCaptureNoOfProducts {

	public static void main(String[] args) {
		
		WebDriver driver = new FirefoxDriver();
		
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
		driver.get("https://www.flipkart.com");
		
		driver.findElement(By.xpath("//button[text()='✕']")).click();
		
		driver.findElement(By.name("q")).sendKeys("apple mobile", Keys.ENTER);
		
		String res = driver.findElement(By.xpath("//span[contains(text(),'Showing ')]")).getText();
		
		driver.close();
		
		String[] arr = res.split(" ");
		String noOfProductsString = arr[5];
		System.out.println(noOfProductsString);

		int noOfProductsInt = Integer.parseInt(noOfProductsString);
		
		System.out.println(noOfProductsInt-5);
	}

}
