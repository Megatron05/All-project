package org.test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Sample1 {
	
		
		public static void main(String[] args) {
			System.setProperty("webdriver.gecko.driver","C:\\Users\\srini\\eclipse-workspace\\Selinium project1\\driver\\geckodriver.exe");
			WebDriver driver = new FirefoxDriver();
			driver.get("https://www.facebook.com/");
			
			
			
}
}
