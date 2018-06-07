package com.actiTime.objectRepository;
/**
 * 
 * @author Namitha
 *
 */

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Tasks {

	@FindBy(xpath="//a[text()='Completed Tasks']")
	private WebElement completedTaskLink;
	
	@FindBy(linkText="Projects & Customers")
	private WebElement projectAndCustomerLink;
	
	@FindBy(linkText="Archives")
	private WebElement archivesLink;
	
	public void navigateToCompletedTask()
	{
		completedTaskLink.click();
	}
	
	public void navigateToProjectAndCustomer()
	{
		projectAndCustomerLink.click();
	}
	
	public void navigateToArchives()
	{
		archivesLink.click();
	}
}
