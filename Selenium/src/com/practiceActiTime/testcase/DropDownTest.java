package com.practiceActiTime.testcase;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

import com.actiTime.genericLibs.Libraries;

/**
 * 
 * @author Namitha
 *
 */
public class DropDownTest {
	
	public static void main(String[] args) {
		/*Launch the Browser and navigate to facebook.com*/
		WebDriver driver = new FirefoxDriver();
		driver.get("https://www.facebook.com");
		driver.manage().window().maximize();
		
		WebElement dayElement = driver.findElement(By.id("day"));
		/*Select sel = new Select(dw);
		sel.selectByVisibleText("28");*/
		
		Libraries lib = new Libraries();
		
		lib.select(dayElement, "28");
		
		WebElement monthElement = driver.findElement(By.id("month"));
		lib.select(monthElement, 5);
		
		WebElement yearElement = driver.findElement(By.id("year"));
		lib.select(yearElement, "1996");
		
		
	}

}
