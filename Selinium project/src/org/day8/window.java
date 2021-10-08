package org.day8;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class window {
	public static void main(String[] args) throws InterruptedException, AWTException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\srini\\eclipse-workspace\\Selinium project\\driver\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.amazon.in/");
        WebElement searchBox = driver.findElement(By.id("twotabsearchtextbox"));
        searchBox.sendKeys("Iphone",Keys.ENTER);
        
        WebElement iphoneclk = driver.findElement(By.className("a-price-whole"));
        iphoneclk.click();
        
        String parentWindowId = driver.getWindowHandle();
        System.out.println(parentWindowId);
        
        Set<String> allWindowHandle = driver.getWindowHandles();
        System.out.println(allWindowHandle);
        int size = allWindowHandle.size();
        
        List<String> allwindows = new ArrayList<String>();
        
        allwindows.addAll(allWindowHandle);
        
        allwindows.get(1);
        
        
//        Robot robot = new Robot();
//        robot.keyPress(KeyEvent.VK_CONTROL);
//        robot.keyPress(KeyEvent.VK_TAB);
        	
        
        
//        
//        for (String x : allWindowHandle) {
//        	if (!parentWindowId.equals(x)) {
//    	driver.switchTo().window(x);
//			
//		}
//		
//	}   
        String string = allwindows.get(1);
        
        driver.switchTo().window(string);
        
       WebElement addCartclick = driver.findElement(By.id("add-to-cart-button"));
       addCartclick.click();
       Thread.sleep(3000);
       driver.switchTo().window(parentWindowId);
    
        for (int i = 0; i < 5 ; i++) {
    	WebElement iphoneclk1 = driver.findElement(By.className("a-price-whole"));
        iphoneclk1.click();
        
        driver.switchTo().window(parentWindowId);
		
	    }
       WebElement iphoneclk1 = driver.findElement(By.className("a-price-whole"));
       iphoneclk1.click();
       
       
       
       driver.switchTo().window(parentWindowId);
       
       Set<String> allWindowHandle1 = driver.getWindowHandles();
       List<String> allwindows1 = new ArrayList<String>();
       
       allwindows1.addAll(allWindowHandle1);
       
       String string2 = allwindows1.get(3);
       driver.switchTo().window(string2);
       int size2 = allwindows1.size();
       System.out.println(size2);
       
       System.out.println(allwindows1);
      
        
     Thread.sleep(6000);  
     driver.quit();

	  }
	
	

}
