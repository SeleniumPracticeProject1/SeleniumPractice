package com.actiTime.objectRepository;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

/**
 * 
 * @author Namitha
 *
 */
public class Home {

	@FindBy(xpath="//div[text()='Tasks']")
	private WebElement taskLink;
	
	@FindBy(xpath="//div[text()='Reports']")
	private WebElement reportLink;
	
	@FindBy(xpath="//div[text()='Users']")
	private WebElement usersLink;
	
	@FindBy(xpath="//div[text()='Work Schedule']")
	private WebElement workScheduleLink;
	
	@FindBy(xpath="//div[contains(text(),'Settings')]")
	private WebElement settingsLink;
	
	@FindBy(linkText="Logout")
	private WebElement logoutLink;
	
	
	public void naviateToTask()
	{
		taskLink.click();
	}
	
	public void naviateToReports()
	{
		reportLink.click();
	}
	
	public void naviateToUsers()
	{
		usersLink.click();
	}
	
	public void naviateToWorkSchedule()
	{
		workScheduleLink.click();
	}
	
	public void naviateToSettings()
	{
		settingsLink.click();
	}
	
	public void logout()
	{
		logoutLink.click();
	}
}
