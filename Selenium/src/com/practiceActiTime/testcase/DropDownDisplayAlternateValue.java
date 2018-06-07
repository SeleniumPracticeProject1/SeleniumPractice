package com.practiceActiTime.testcase;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

/**
 * 
 * @author Namitha
 *
 */

public class DropDownDisplayAlternateValue {

	public static void main(String[] args) {
		WebDriver driver = new FirefoxDriver();
		driver.get("file:///E:/Selenium/dropDown.html");
		
		WebElement web = driver.findElement(By.name("sel"));
		
		Select sel = new Select(web);
		
		List<WebElement> lst = sel.getOptions();
		
		for(int i=0;i<lst.size();i++)
		{
			WebElement w = lst.get(i);
			String actualValue = w.getText();
			if(i%2==0)
			{
				sel.selectByVisibleText(actualValue);
			}
		}
		
		sel.deselectAll();
		
		for(int i=0;i<lst.size();i++)
		{
			WebElement w = lst.get(i);
			String actValue = w.getText();
			if(i%2!=0)
			{
				sel.selectByVisibleText(actValue);
			}
		}
		
	}

}
