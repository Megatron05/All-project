package org.day6;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Sample {
	
	public static void main(String[] args) throws InterruptedException, AWTException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\srini\\eclipse-workspace\\Selinium project\\driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
	
	Robot robot = new Robot();
	
	robot.keyPress(KeyEvent.VK_CONTROL);
	robot.keyPress(KeyEvent.VK_T);
	
	
	robot.keyRelease(KeyEvent.VK_CONTROL);
	robot.keyRelease(KeyEvent.VK_T);
	
	robot.keyPress(KeyEvent.VK_SHIFT);
	robot.keyPress(KeyEvent.VK_F);
	robot.keyRelease(KeyEvent.VK_F);
    robot.keyPress(KeyEvent.VK_A);
	robot.keyRelease(KeyEvent.VK_A);
	robot.keyPress(KeyEvent.VK_C);
	robot.keyRelease(KeyEvent.VK_C);
	robot.keyPress(KeyEvent.VK_E);
	robot.keyRelease(KeyEvent.VK_E);
	robot.keyPress(KeyEvent.VK_B);
	robot.keyRelease(KeyEvent.VK_B);
	robot.keyPress(KeyEvent.VK_O);
	robot.keyRelease(KeyEvent.VK_O);
	robot.keyPress(KeyEvent.VK_O);
	robot.keyRelease(KeyEvent.VK_O);
	robot.keyPress(KeyEvent.VK_K);
	robot.keyRelease(KeyEvent.VK_K);
	robot.keyRelease(KeyEvent.VK_SHIFT);

	robot.keyPress(KeyEvent.VK_ENTER);
	robot.keyRelease(KeyEvent.VK_ENTER);
	
	
	Thread.sleep(300);
	WebElement click = driver.findElement(By.xpath("//cite[@class='iUh30 Zu0yb tjvcx']"));
	String text = click.getText();
	System.out.println(text);
	


	

	

	
	
	
	
	
	
	
	
	//Thread.sleep(9000);
		
	//driver.quit();
	
	
	}
	

}
