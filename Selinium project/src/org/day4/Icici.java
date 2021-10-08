package org.day4;

import java.util.List;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Icici {
	
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\srini\\eclipse-workspace\\Selinium project\\driver\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://retail.onlinesbi.com/retail/login.htm");
		
		
//		Thread.sleep(3000);
//	;
		
		WebElement findElement = driver.findElement(By.xpath("(//a[@class='login_button'])[1]"));
		findElement.click();
//		
		
		WebElement findElement1 = driver.findElement(By.xpath("(//input[@class='form-control'])[1]"));
		findElement1.sendKeys("nanda");
		
//		Alert alert = driver.switchTo().alert();
//		alert.accept();
		
		//driver.quit();
		
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
