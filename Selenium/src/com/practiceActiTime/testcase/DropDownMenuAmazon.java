package com.practiceActiTime.testcase;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxBinary;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

/**
 * 
 * @author Namitha
 *
 */
public class DropDownMenuAmazon {

	public static void main(String[] args) throws InterruptedException {
		FirefoxDriver driver = new FirefoxDriver();
		
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	
		driver.manage().window().maximize();

		driver.get("https://www.amazon.in/");
				
		WebElement web = driver.findElement(By.id("nav-link-shopall"));
		
		Actions act = new Actions(driver);
		
		act.moveToElement(web);
		act.perform();
		
		//Thread.sleep(2000);
		
		String booksXpath = "//div[@id='nav-flyout-shopAll']/div[2]/span[@aria-label='Books']/span[text()='Books']";
		WebElement w = driver.findElement(By.xpath(booksXpath));
		act.click(w).perform();
		//driver.findElement(By.linkText("Full Store Directory")).click();
		
		/*WebElement men = driver.findElement(By.linkText("Men's Fashion"));
		
		act.moveToElement(men).perform();*/
		
		Thread.sleep(3000);
		
		driver.close();
	}

}
