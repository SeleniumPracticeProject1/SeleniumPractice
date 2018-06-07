package com.practiceActiTime.testcase;

import java.util.List;
import java.util.concurrent.TimeUnit;

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
public class MultipleDropDownCheck {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new FirefoxDriver();
		driver.get("file:///E:/Selenium/dropDown.html");
		
		WebElement wb = driver.findElement(By.name("sel"));
		
		Select s = new Select(wb);
		
		
		/*s.selectByVisibleText("selenium");
		
		driver.manage().timeouts().i	mplicitlyWait(5, TimeUnit.SECONDS);
		
		Thread.sleep(2000);
		
		for(int i=0;i<8;i++)
		{
			s.selectByIndex(i);
		}
		
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		
		Thread.sleep(2000);
		
		s.deselectAll();
		
		driver.close();*/
		
		List<WebElement> list = s.getOptions();
		System.out.println("Number of elements/values present in dropdown="+list.size());
		
		
		System.out.println();
	
		for(WebElement w:list)
		{
			System.out.println(w.getText());
		}
		
		System.out.println();
		
		boolean flag = false;
		String expectedOutput = "java";
		for(WebElement w:list)
		{
			System.out.println(w);
			String actualOutput=w.getText();
			if(actualOutput.equals(expectedOutput))
			{
				s.selectByVisibleText(expectedOutput);
				flag=true;
				break;
			}
		}
		if(flag)
		{
			System.out.println("Element is available in drop down == PASS");
		}
		else
		{
			System.out.println("Element is not available==FAIL");
		}
		
		
		driver.close();
		
		
		
	}

}
