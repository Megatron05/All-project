package org.suit;

import java.io.File;
import java.io.IOException;
import java.util.Date;

import org.base.BaseClass;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.TestName;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.io.FileHandler;
import org.pom.BookingPage;

public class Booking extends BaseClass {
	static String path = "C:\\Users\\srini\\eclipse-workspace\\FrameWorkMaven\\Excel\\Adactinhotel.xlsx";
	static String sheet = "Sheet1";
	
	@Rule
 	public TestName Test1 = new TestName();
	
	@After
	public void timeout() throws IOException {
		Date date = new Date(); 
		System.out.println(date);}

	@Before
	public void time() {
		Date d = new Date();
		System.out.println(d);}

	
	
	@Test
    public void booking() throws IOException {
    	BookingPage b = new BookingPage();
    	
    	String firstname = getCellvalue(path, sheet, 1, 10);
		String lastname = getCellvalue(path, sheet, 1, 11);
		String address = getCellvalue(path, sheet, 1, 12);
		String cardno = getCellvalue(path, sheet, 1, 13);
		String cardtype = getCellvalue(path, sheet, 1, 14);int cardty = Integer.parseInt(cardtype);
		String expmonth = getCellvalue(path, sheet, 1, 15);int month = Integer.parseInt(expmonth);
		String expyear = getCellvalue(path, sheet, 1, 16);int year = Integer.parseInt(expyear);
		String cvv = getCellvalue(path, sheet, 1, 17);

		WebElement firstname2 = b.getFirstname();
		String first = firstname2.getAttribute("id");
		Assert.assertEquals("first_name", first);
		Sendtext(firstname2, firstname);
		
		WebElement lastname2 = b.getLastname();
		String last = lastname2.getAttribute("id");
		Assert.assertEquals("last_name", last);
		Sendtext(lastname2, lastname);
		
		WebElement address2 = b.getAddress();
		String add = address2.getAttribute("id");
		Assert.assertEquals("address", add);
		Sendtext(address2, address);
		
		WebElement ccnumber = b.getCcnumber();
		String ccnum = ccnumber.getAttribute("id");
		Assert.assertEquals("cc_num", ccnum);
		Sendtext(ccnumber, cardno);
		
		WebElement ccType = b.getCcType();
		String ccty = ccType.getAttribute("id");
		Assert.assertEquals("cc_type", ccty);
		selectbyIndex(ccType, cardty);
		
		WebElement ccMonth = b.getCcMonth();
		String ccmo = ccMonth.getAttribute("id");
		Assert.assertEquals("cc_exp_month", ccmo);
		selectbyIndex(ccMonth, month);
		
		WebElement ccYear = b.getCcYear();
		String ccy = ccYear.getAttribute("id");
		Assert.assertEquals("cc_exp_year", ccy);
		selectbyIndex(ccYear, year);
		
		WebElement ccCVV = b.getCcCVV();
		String cccvv = ccCVV.getAttribute("id");
		Assert.assertEquals("cc_cvv", cccvv);
		Sendtext(ccCVV, cvv);
		
		screen();
		
		}
    //Screenshot Method
	 	public void screen() throws IOException {
	 		TakesScreenshot screenshot = (TakesScreenshot) driver;
	 		File screenshotAs = screenshot.getScreenshotAs(OutputType.FILE);
	 		FileHandler.copy(screenshotAs, new File("C:\\Users\\srini\\OneDrive\\Desktop\\JAVA Class\\Screenshot\\"+Test1.getMethodName() + ".png")); }

}
