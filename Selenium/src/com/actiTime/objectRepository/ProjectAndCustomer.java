package com.actiTime.objectRepository;
/**
 * 
 * @author Namitha
 *
 */

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ProjectAndCustomer {

	@FindBy(xpath="//input[@value='Create New Customer']")
	private WebElement createNewCustomerLink;
	
	@FindBy(xpath="//input[@value='Create New Project']")
	private WebElement createNewProjectLink;
	
	@FindBy(xpath="//span[@class='successmsg']")
	private WebElement actCustVerifyMsg;
	
	public WebElement getCreateNewCustomerLink() {
		return createNewCustomerLink;
	}

	public WebElement getCreateNewProjectLink() {
		return createNewProjectLink;
	}

	public WebElement getActCustVerifyMsg() {
		return actCustVerifyMsg;
	}

	public void createNewCustomer()
	{
		createNewCustomerLink.click();
	}
	
	public void createNewProject()
	{
		createNewProjectLink.click();
	}
}
