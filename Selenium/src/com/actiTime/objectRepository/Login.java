package com.actiTime.objectRepository;
/**
 * 
 * @author Namitha
 *
 */

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Login {
	
	/*All WebElements present in login page*/
	@FindBy(name="username")
	private WebElement usernameEditBox;
	
	@FindBy(name="pwd")
	private WebElement passwordEditBox;
	
	@FindBy(id="loginButton")
	private WebElement loginButton;
	
	/*Reusable business libraries*/
	public void login(String username, String password)
	{
		usernameEditBox.sendKeys(username);
		passwordEditBox.sendKeys(password);
		loginButton.click();
	}
}
