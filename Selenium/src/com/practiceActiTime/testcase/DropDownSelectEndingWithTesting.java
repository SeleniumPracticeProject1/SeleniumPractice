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
public class DropDownSelectEndingWithTesting {

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
			if(actualValue.endsWith("testing"))
			{
				sel.selectByVisibleText(actualValue);
			}
		}
		
		/*for(WebElement w :lst)
		{
			String actValue = w.getText();
			if(actValue.contains("testing"))
			{
				sel.selectByVisibleText(actValue);
			}
		}*/
		
	}

}
