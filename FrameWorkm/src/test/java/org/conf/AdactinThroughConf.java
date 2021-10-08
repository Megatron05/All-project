package org.conf;

import java.io.IOException;
import java.util.Date;

import org.base.BaseClass;
import org.junit.Assert;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.WebElement;
import org.pom.Loginpage;



public class AdactinThroughConf extends BaseClass {
 public static String pathofConfigFile = "C:\\Users\\srini\\eclipse-workspace\\FrameWorkMaven\\src\\test\\resources\\Config\\adactinData.properties";
	
	
    @BeforeClass
	public static void brwserlaunch() throws IOException {
    String url = getConfigData(pathofConfigFile, "url");
    getDriver(url);
	}
    
    @Before 
    public void timingin() {
    	Date d = new Date();
    	System.out.println(d);		

    }
    @Test
    public void LoginPage() throws IOException {
    	Loginpage l = new Loginpage();
    	
    	WebElement username = l.getUsername();
    	String user1 = username.getAttribute("id");
    	Assert.assertEquals("username", user1);
    	String user = getConfigData(pathofConfigFile, "username");
    	Sendtext(username, user);
    	
    	WebElement password = l.getPassword();
    	String passwo = password.getAttribute("id");
    	Assert.assertEquals("password", passwo);
    	String pass = getConfigData(pathofConfigFile, "password");
    	Sendtext(password, pass);
    	
    	WebElement login = l.getLogin();
    	String log = login.getAttribute("id");
    	Assert.assertEquals("login", log);
    	click(login);
    	
    	
    }
	


}
