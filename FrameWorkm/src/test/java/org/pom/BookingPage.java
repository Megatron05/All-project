package org.pom;

import org.base.BaseClass;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class BookingPage extends BaseClass {

	public BookingPage() {
		PageFactory.initElements(driver, this);
	}

	@FindBy(id = "first_name")
	private WebElement firstname;
	@FindBy(id = "last_name")
	private WebElement lastname;
	@FindBy(id = "address")
	private WebElement Address;
	@FindBy(id = "cc_num")
	private WebElement ccnumber;
	@FindBy(id = "cc_exp_year")
	private WebElement ccYear;
	@FindBy(id = "cc_exp_month")
	private WebElement ccMonth;
	@FindBy(id = "cc_cvv")
	private WebElement ccCVV;
	@FindBy(id = "cc_type")
	private WebElement ccType;

	public WebElement getFirstname() {
		return firstname;
	}

	public WebElement getLastname() {
		return lastname;
	}

	public WebElement getAddress() {
		return Address;
	}

	public WebElement getCcnumber() {
		return ccnumber;
	}

	public WebElement getCcYear() {
		return ccYear;
	}

	public WebElement getCcMonth() {
		return ccMonth;
	}

	public WebElement getCcCVV() {
		return ccCVV;
	}

	public WebElement getCcType() {
		return ccType;
	}

}
