package org.frame;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Bookahotel extends Framework {
	
	public Bookahotel() {
		PageFactory.initElements(driver, this);
	}
	@FindBy(id="first_name")
	private WebElement firstnamedata;
	
	@FindBy(id="last_name")
	private WebElement lastnamedata;
	
	@FindBy(id="address")
	private WebElement addressdata;
	
	@FindBy(id="cc_num")
	private WebElement ccnumdata;
	
	@FindBy(id="cc_type")
	private WebElement cctypedata;
	
	@FindBy(id="cc_exp_month")
	private WebElement expirymonth;
	
	@FindBy(id="exp_year")
	private WebElement expiryyear;
	
	@FindBy(id="cc_cvv")
	private WebElement cvvdata;
	
	@FindBy(id="book-now")
	private WebElement booknamebtn;
	
	@FindBy(id="my_itinerary")
	private WebElement iternarybtn;

	public WebElement getFirstnamedata() {
		return firstnamedata;
	}

	public void setFirstnamedata(WebElement firstnamedata) {
		this.firstnamedata = firstnamedata;
	}

	public WebElement getLastnamedata() {
		return lastnamedata;
	}

	public void setLastnamedata(WebElement lastnamedata) {
		this.lastnamedata = lastnamedata;
	}

	public WebElement getAddressdata() {
		return addressdata;
	}

	public void setAddressdata(WebElement addressdata) {
		this.addressdata = addressdata;
	}

	public WebElement getCcnumdata() {
		return ccnumdata;
	}

	public void setCcnumdata(WebElement ccnumdata) {
		this.ccnumdata = ccnumdata;
	}

	public WebElement getCctypedata() {
		return cctypedata;
	}

	public void setCctypedata(WebElement cctypedata) {
		this.cctypedata = cctypedata;
	}

	public WebElement getExpirymonth() {
		return expirymonth;
	}

	public void setExpirymonth(WebElement expirymonth) {
		this.expirymonth = expirymonth;
	}

	public WebElement getExpiryyear() {
		return expiryyear;
	}

	public void setExpiryyear(WebElement expiryyear) {
		this.expiryyear = expiryyear;
	}

	public WebElement getCvvdata() {
		return cvvdata;
	}

	public void setCvvdata(WebElement cvvdata) {
		this.cvvdata = cvvdata;
	}

	public WebElement getBooknamebtn() {
		return booknamebtn;
	}

	public void setBooknamebtn(WebElement booknamebtn) {
		this.booknamebtn = booknamebtn;
	}

	public WebElement getIternarybtn() {
		return iternarybtn;
	}

	public void setIternarybtn(WebElement iternarybtn) {
		this.iternarybtn = iternarybtn;
	}
	
	
	public void bookahotel(String address,String firstname,String lastname,String creditcardnumber,String cctype,String expmonth,String expyear,String cvvdata) {
		sendkeys(getAddressdata(), address);
		sendkeys(getFirstnamedata(), firstname);
		sendkeys(getLastnamedata(), lastname);
		click(getBooknamebtn());
		sendkeys(getCcnumdata(), creditcardnumber);
		sendkeys(getCctypedata(), cctype);
		sendkeys(getExpirymonth(), expmonth);
		sendkeys(getExpiryyear(), expyear);
		sendkeys(getCvvdata(), cvvdata);
		click(getIternarybtn());
	

	}
	
	
	
	
	
	
	

}
