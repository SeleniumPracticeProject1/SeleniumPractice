package com.actiTime.objectRepository;
/**
 * 
 * @author Namitha
 *
 */

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class CreateNewCustomer {

	@FindBy(name="name")
	private WebElement customerName;
	
	@FindBy(name="description")
	private WebElement customerDescription;
	
	@FindBy(name="createCustomerSubmit")
	private WebElement createCustomerButton;
	
	public void createCutomer(String cName)
	{
		customerName.sendKeys(cName);
		createCustomerButton.click();
	}
	
	public void createCutomer(String cName, String cDescripton)
	{
		customerName.sendKeys(cName);
		customerDescription.sendKeys(cDescripton);
		createCustomerButton.click();
	}
	
}
