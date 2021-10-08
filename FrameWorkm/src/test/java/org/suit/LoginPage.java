package org.suit;

import java.io.File;
import java.io.IOException;
import java.util.Date;


import org.base.BaseClass;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.TestName;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.io.FileHandler;
import org.pom.Loginpage;



public class LoginPage extends BaseClass {
	static String path = "C:\\Users\\srini\\eclipse-workspace\\FrameWorkMaven\\Excel\\Adactinhotel.xlsx";
	static String sheet = "Sheet1";
	
		@Rule
	 	public TestName Test1 = new TestName();
	
	    @BeforeClass
		public static void driver() {
			getDriver("http://adactinhotelapp.com/");
			maximise();
			}
	
	    @Before
	    public void time() {
	    	Date d = new Date();
	    	System.out.println(d);}
	
	    @Test
	    public void Loginpage() throws IOException {
			Loginpage l = new Loginpage();
			
			String user1 = getCellvalue(path, sheet, 1, 0);
			String pass = getCellvalue(path, sheet, 1, 1);
			
			WebElement username = l.getUsername();
			String useId = username.getAttribute("id");
			boolean equals = useId.equals("username");
			Assert.assertTrue(equals);
			Sendtext(username, user1);
			
			WebElement password = l.getPassword();
			String pass1 = password.getAttribute("id");
			boolean equals2 = pass1.equals("password");
			Assert.assertTrue(equals2);
			Sendtext(password, pass);
			
			screen();
			
			WebElement login = l.getLogin();
			String attribute = login.getAttribute("id");
			Assert.assertEquals("login", attribute);
			click(login);}
	    
	    @After
        public void timeout() throws IOException {
	    	Date date = new Date(); 
	    	System.out.println(date);}
	    
	    //Screenshot Method
        public void screen() throws IOException {
    	  TakesScreenshot screenshot = (TakesScreenshot) driver;
	      File screenshotAs = screenshot.getScreenshotAs(OutputType.FILE);
	      FileHandler.copy(screenshotAs, new File("C:\\Users\\srini\\OneDrive\\Desktop\\JAVA Class\\Screenshot\\"+Test1.getMethodName() + ".png")); }
    	
    	
    	
    	
	
	
	
	

}
