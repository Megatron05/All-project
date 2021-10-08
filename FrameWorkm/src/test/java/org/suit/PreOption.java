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
import org.pom.PreOptions;

public class PreOption  extends BaseClass{
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
	    public void preOptions() throws IOException {
	    	PreOptions p = new PreOptions();
	    	
	    	String location = getCellvalue(path, sheet, 1, 2);int loc = Integer.parseInt(location);
			String hotels = getCellvalue(path, sheet, 1, 3);int hot = Integer.parseInt(hotels);
			String type = getCellvalue(path, sheet, 1, 4);int typ = Integer.parseInt(type);
			String noofroom = getCellvalue(path, sheet, 1, 5);int noromm = Integer.parseInt(noofroom);
			String checkin = getCellvalue(path, sheet, 1, 6);
			String checkout = getCellvalue(path, sheet, 1, 7);
			String adultroom = getCellvalue(path, sheet, 1, 8);int adult = Integer.parseInt(adultroom);
			String childroom = getCellvalue(path, sheet, 1, 9);int child = Integer.parseInt(childroom);
			
			WebElement location2 = p.getLocation();
			String location3 = location2.getAttribute("id");
			Assert.assertEquals("location", location3);
			selectbyIndex(location2, loc);
			
			WebElement hotels2 = p.getHotels();
			String hotels3 = hotels2.getAttribute("id");
			Assert.assertEquals("hotels", hotels3);
			selectbyIndex(hotels2, hot);
			
			WebElement type2 = p.getType();
			String type3 = type2.getAttribute("id");
			Assert.assertEquals("room_type", type3);
			selectbyIndex(type2, typ);
			
			WebElement noofroom2 = p.getNoofroom();
			String noofroom3 = noofroom2.getAttribute("id");
			Assert.assertEquals("room_nos", noofroom3);
			selectbyIndex(noofroom2, noromm);
			
			WebElement checkin2 = p.getCheckin();
			checkin2.clear();
			String checkin3 = checkin2.getAttribute("id");
			Assert.assertEquals("datepick_in", checkin3);
			Sendtext(checkin2, checkin);
			
			WebElement checkout2 = p.getCheckout();
			checkout2.clear();
			String checkout3 = checkout2.getAttribute("id");
			Assert.assertEquals("datepick_out", checkout3);
			Sendtext(checkout2, checkout);
			
			WebElement adultroom2 = p.getAdultroom();
			String adultroom3 = adultroom2.getAttribute("id");
			Assert.assertEquals("adult_room", adultroom3);
			selectbyIndex(adultroom2, adult);
			
			WebElement childroom2 = p.getChildroom();
			String childroom3 = childroom2.getAttribute("id");
			Assert.assertEquals("child_room", childroom3);
			selectbyIndex(childroom2, child);
			
			screen();
			
			WebElement submit = p.getSubmit();
			String submit2 = submit.getAttribute("id");
			Assert.assertEquals("Submit", submit2);
			click(submit); 
			}
	      //Screenshot Method
	 	public void screen() throws IOException {
	 		TakesScreenshot screenshot = (TakesScreenshot) driver;
	 		File screenshotAs = screenshot.getScreenshotAs(OutputType.FILE);
	 		FileHandler.copy(screenshotAs, new File("C:\\Users\\srini\\OneDrive\\Desktop\\JAVA Class\\Screenshot\\"+Test1.getMethodName() + ".png")); }
}
