package org.day6;

import java.awt.AWTException;
import java.awt.Desktop.Action;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Sample1 {
	
	public static void main(String[] args) throws AWTException {
		
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\srini\\eclipse-workspace\\Selinium project\\driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		
		driver.get("https://www.google.com/");
		
	
		
		Robot robot = new Robot();
		robot.keyPress(KeyEvent.VK_F);
		robot.keyPress(KeyEvent.VK_D);
		
		
		
	}
	

}
