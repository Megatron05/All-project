package org.snap;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Automation {
	
	public static void main(String[] args) throws InterruptedException, AWTException {
	
		System.setProperty("webdriver.chrome.driver","C:\\Users\\srini\\eclipse-workspace\\Selinium project\\driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://demo.automationtesting.in/Register.html");
		
		Thread.sleep(3000);
		
		WebElement moveSwitch = driver.findElement(By.xpath("(//a[@class='dropdown-toggle'])[1]"));
		Actions actions = new Actions(driver);
		actions.moveToElement(moveSwitch).perform();
		
		WebElement clickAlert = driver.findElement(By.xpath("(//a[@style='color: white'])[1]"));
		clickAlert.click();
		
		Thread.sleep(300);
		Robot robot = new Robot();
		robot.keyPress(KeyEvent.VK_ENTER);
		
		
		WebElement clickbtn = driver.findElement(By.xpath("//button[@class='btn btn-danger']"));
		clickbtn.click();
		
		
	    Thread.sleep(300);
		Alert alert = driver.switchTo().alert();
		alert.accept();
		
		driver.quit();
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
