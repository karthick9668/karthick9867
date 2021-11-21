package org.frame;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Logindetails extends Framework{
	
	public Logindetails() {
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(id="username")
	private WebElement txtusername;
	
	@FindBy(id="password")
	private WebElement passwordname;
	
	@FindBy(id="login")
	private WebElement loginbtn;

	public WebElement getTxtusername() {
		return txtusername;
	}

	public WebElement getPasswordname() {
		return passwordname;
	}

	public WebElement getLoginbtn() {
		return loginbtn;
	}
	
	
	public void login(String username,String password) {
	sendkeys(getTxtusername(), username);
	sendkeys(getPasswordname(), password);
	click(loginbtn);

	}
	

}
