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
import org.pom.SelectPage;

public class Select extends BaseClass{
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
	    public void select() throws IOException {
	    	SelectPage s = new SelectPage();
	    	
	    	WebElement radioButton = s.getRadioButton();
	    	String radiobutton2 = radioButton.getAttribute("id");
	    	Assert.assertEquals("radiobutton_0", radiobutton2);;
	    	click(radioButton);
	    	
	    	screen();
	    	
	    	WebElement clickcontinue = s.getClickcontinue();
	    	String clickcontinue2 = clickcontinue.getAttribute("id");
	    	Assert.assertEquals("continue", clickcontinue2);;
	    	click(clickcontinue);
	    	
	    	 }
	    //Screenshot Method
		 	public void screen() throws IOException {
		 		TakesScreenshot screenshot = (TakesScreenshot) driver;
		 		File screenshotAs = screenshot.getScreenshotAs(OutputType.FILE);
		 		FileHandler.copy(screenshotAs, new File("C:\\Users\\srini\\OneDrive\\Desktop\\JAVA Class\\Screenshot\\"+Test1.getMethodName() + ".png")); }
	    

}
