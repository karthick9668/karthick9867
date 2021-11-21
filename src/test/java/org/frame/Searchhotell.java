package org.frame;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Searchhotell extends Framework{
	
	public Searchhotell() {
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(id="location")
	private WebElement locationbox;
	
	@FindBy(id="hotels")
	private WebElement hotelsearch;
	
	@FindBy(id="room_type")
	private WebElement typeofroom;
	
	@FindBy(id="roomnos")
	private WebElement noofrooms;
	
	@FindBy(id="adult_room")
	private WebElement adultsroom;
	
	@FindBy(id="child_room")
	private WebElement childsroom;
	
	@FindBy(id="Submit")
	private WebElement submitbtn;

	public WebElement getLocationbox() {
		return locationbox;
	}

	public WebElement getHotelsearch() {
		return hotelsearch;
	}

	public WebElement getTypeofroom() {
		return typeofroom;
	}

	public WebElement getNoofrooms() {
		return noofrooms;
	}

	public WebElement getAdultsroom() {
		return adultsroom;
	}

	public WebElement getChildsroom() {
		return childsroom;
	}

	public WebElement getSubmitbtn() {
		return submitbtn;
	}
	
	public void searchhotel(String adultsroom,String childroom,String searchhotel,String noofrooms,String location,String roomtype) {
		sendkeys(getAdultsroom(), adultsroom);
		sendkeys(getChildsroom(), childroom);
		sendkeys(getHotelsearch(), searchhotel);
		sendkeys(getNoofrooms(), noofrooms);
		click(getSubmitbtn());
		sendkeys(getLocationbox(), location);
		sendkeys(getTypeofroom(), roomtype);
		
	}
	
	
}


