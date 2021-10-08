package org.trial;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.apache.commons.io.FileUtils;
import org.day8.window;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import net.bytebuddy.asm.Advice.Enter;

public class Hdfc {
	public static void main(String[] args) throws InterruptedException, IOException, AWTException {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\srini\\eclipse-workspace\\Selinium project\\driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get(" http://www.greenstechnologys.com/");
		
		WebElement moveCourse = driver.findElement(By.xpath("//a[text()='COURSES']"));
		Actions actions = new Actions(driver);
		actions.moveToElement(moveCourse).perform();
		
		
		WebElement clkPhython = driver.findElement(By.xpath("(//span[text()='Python'])[1]"));
		clkPhython.click();
		
		
		
		WebElement moveCurriculum = driver.findElement(By.xpath("(//a[@href='#Curriculum'])[1]"));
		JavascriptExecutor executor = (JavascriptExecutor) driver;
		executor.executeScript("arguments[0].scrollIntoView(true)", moveCurriculum);
		
		actions.moveToElement(moveCurriculum).perform();
		actions.contextClick().perform();
		
     	Robot robot = new Robot();
    	robot.keyPress(KeyEvent.VK_ENTER);
    	robot.keyRelease(KeyEvent.VK_ENTER);
    	robot.keyPress(KeyEvent.VK_ENTER);
		
		
		
		
//		Thread.sleep(3000);
//		actions.contextClick().perform();
//		
		
		
		
//		Thread.sleep(1000);
//		
//		
//		WebElement clkOptions = driver.findElement(By.xpath("(//a[@class='s1Q9rs'])[1]"));
//		clkOptions.click();
//		
//		
//		Set<String> windowHandles = driver.getWindowHandles();
//		List<String> li = new ArrayList<>();
//		li.addAll(windowHandles);
//		
//		String string = li.get(1);
//		driver.switchTo().window(string);
//		
//		WebElement pincode = driver.findElement(By.xpath("//input[@placeholder='Enter Delivery Pincode']"));
//		pincode.sendKeys("600100");
//	
		
		//driver.quit();
		
		
		
		
		
		
		
		
		
	}

}
