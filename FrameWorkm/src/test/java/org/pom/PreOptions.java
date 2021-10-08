package org.pom;

import org.base.BaseClass;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PreOptions extends BaseClass {
	public PreOptions() {
		PageFactory.initElements(driver, this);
	}

	@FindBy(id = "location")
	private WebElement location;
	@FindBy(id = "hotels")
	private WebElement hotels;
	@FindBy(id = "room_type")
	private WebElement type;
	@FindBy(id = "room_nos")
	private WebElement noofroom;
	@FindBy(id = "datepick_in")
	private WebElement checkin;
	@FindBy(id = "datepick_out")
	private WebElement checkout;
	@FindBy(id = "adult_room")
	private WebElement adultroom;
	@FindBy(id = "child_room")
	private WebElement childroom;
	@FindBy(id = "Submit")
	private WebElement submit;

	public WebElement getSubmit() {
		return submit;
	}

	public WebElement getLocation() {
		return location;
	}

	public WebElement getHotels() {
		return hotels;
	}

	public WebElement getType() {
		return type;
	}

	public WebElement getNoofroom() {
		return noofroom;
	}

	public WebElement getCheckin() {
		return checkin;
	}

	public WebElement getCheckout() {
		return checkout;
	}

	public WebElement getAdultroom() {
		return adultroom;
	}

	public WebElement getChildroom() {
		return childroom;
	}

}
