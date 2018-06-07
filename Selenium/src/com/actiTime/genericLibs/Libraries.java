package com.actiTime.genericLibs;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

/**
 * 
 * @author Namitha
 *
 */
public class Libraries {
	/**
	 * Overloaded method
	 * @param dElement
	 * Object of WebElement
	 * @param data
	 * Based on String data, select the value from drop down
	 */
	public void select(WebElement dElement, String data)
	{
		Select sel = new Select(dElement);
		sel.selectByVisibleText(data);
	}
	
	/**
	 * Overloaded method
	 * @param dElement
	 * Object of WebElement
	 * @param index
	 * Based on index, select the value from drop down
	 */
	public void select(WebElement dElement, int index)
	{
		Select sel = new Select(dElement);
		sel.selectByIndex(index);
	}
}
