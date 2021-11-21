package org.frame;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Selecthotel extends Framework {
	
	public Selecthotel() {
		PageFactory.initElements(driver, this);
	}

	@FindBy(id="radiobutton_0")
	private WebElement radiobtbn;
	
	@FindBy(id="continue")
	private WebElement continuebtn;

	public WebElement getRadiobtbn() {
		return radiobtbn;
	}

	public WebElement getContinuebtn() {
		return continuebtn;
	}
	
	public void selectthotel() {
		click(getRadiobtbn());
		click(getContinuebtn());
		

	}
	
	
	
}
