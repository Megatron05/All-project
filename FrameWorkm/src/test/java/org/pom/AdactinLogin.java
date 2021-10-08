package org.pom;

import java.io.IOException;
import java.util.Date;

import org.base.BaseClass;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.WebElement;

public class AdactinLogin extends BaseClass {

	static String path = "C:\\Users\\srini\\eclipse-workspace\\FrameWorkMaven\\Excel\\Adactinhotel.xlsx";
	static String sheet = "Sheet1";

	@BeforeClass
	public static void Chrome() {
		getDriver("http://adactinhotelapp.com/");
	}

	@BeforeClass
	public static void time() {
		Date d = new Date();
		System.out.println(d);
	}

	@Before
	public void login() throws IOException {
		String user1 = getCellvalue(path, sheet, 1, 0);
		String pass = getCellvalue(path, sheet, 1, 1);
		Loginpage l = new Loginpage();
		WebElement username = l.getUsername();
		String attribute = username.getAttribute("class");
		System.out.println(attribute);
		Sendtext(username, user1);
		WebElement password = l.getPassword();
		Sendtext(password, pass);
		WebElement login = l.getLogin();
		click(login);
	}

	@Test
	public void options() throws IOException {
		String location = getCellvalue(path, sheet, 1, 2);
		int loc = Integer.parseInt(location);
		String hotels = getCellvalue(path, sheet, 1, 3);
		int hot = Integer.parseInt(hotels);
		String type = getCellvalue(path, sheet, 1, 4);
		int typ = Integer.parseInt(type);
		String noofroom = getCellvalue(path, sheet, 1, 5);
		int noromm = Integer.parseInt(noofroom);
		String checkin = getCellvalue(path, sheet, 1, 6);
		String checkout = getCellvalue(path, sheet, 1, 7);
		String adultroom = getCellvalue(path, sheet, 1, 8);
		int adult = Integer.parseInt(adultroom);
		String childroom = getCellvalue(path, sheet, 1, 9);
		int child = Integer.parseInt(childroom);
		PreOptions p = new PreOptions();
		WebElement location2 = p.getLocation();
		selectbyIndex(location2, loc);
		WebElement hotels2 = p.getHotels();
		selectbyIndex(hotels2, hot);
		WebElement type2 = p.getType();
		selectbyIndex(type2, typ);
		WebElement noofroom2 = p.getNoofroom();
		selectbyIndex(noofroom2, noromm);
		WebElement checkin2 = p.getCheckin();
		Sendtext(checkin2, checkin);
		WebElement checkout2 = p.getCheckout();
		Sendtext(checkout2, checkout);
		WebElement adultroom2 = p.getAdultroom();
		selectbyIndex(adultroom2, adult);
		WebElement childroom2 = p.getChildroom();
		selectbyIndex(childroom2, child);
		WebElement submit = p.getSubmit();
		click(submit);
	}

	@After
	public void select() {
		SelectPage sp = new SelectPage();
		WebElement radioButton = sp.getRadioButton();
		click(radioButton);
		WebElement clickcontinue = sp.getClickcontinue();
		click(clickcontinue);
	}

	@AfterClass
	public static void booking() throws IOException {

		String firstname = getCellvalue(path, sheet, 1, 10);
		String lastname = getCellvalue(path, sheet, 1, 11);
		String address = getCellvalue(path, sheet, 1, 12);
		String cardno = getCellvalue(path, sheet, 1, 13);
		String cardtype = getCellvalue(path, sheet, 1, 14);
		int cardty = Integer.parseInt(cardtype);
		String expmonth = getCellvalue(path, sheet, 1, 15);
		int month = Integer.parseInt(expmonth);
		String expyear = getCellvalue(path, sheet, 1, 16);
		int year = Integer.parseInt(expyear);
		String cvv = getCellvalue(path, sheet, 1, 17);

		BookingPage bp = new BookingPage();
		WebElement firstname2 = bp.getFirstname();
		Sendtext(firstname2, firstname);
		WebElement lastname2 = bp.getLastname();
		Sendtext(lastname2, lastname);
		WebElement address2 = bp.getAddress();
		Sendtext(address2, address);
		WebElement ccnumber = bp.getCcnumber();
		Sendtext(ccnumber, cardno);
		WebElement ccMonth = bp.getCcMonth();
		selectbyIndex(ccMonth, month);
		WebElement ccYear = bp.getCcYear();
		selectbyIndex(ccYear, year);
		WebElement ccType = bp.getCcType();
		selectbyIndex(ccType, cardty);
		WebElement ccCVV = bp.getCcCVV();
		Sendtext(ccCVV, cvv);
	}

	@AfterClass
	public static void timeout() {
		Date d = new Date();
		System.out.println(d);
	}

}
