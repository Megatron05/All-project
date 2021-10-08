package org.snap;

import org.openqa.selenium.By;
import org.openqa.selenium.By.ById;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Adactin{
	
	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\srini\\eclipse-workspace\\Selinium project\\driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get(" http://adactinhotelapp.com/");
		
	    String currentUrl = driver.getCurrentUrl();
	    System.out.println(currentUrl);
		
		String title = driver.getTitle();
		System.out.println(title);
		
		WebElement txtusername = driver.findElement(By.id("username"));
		txtusername.sendKeys("Nandakumar");
		
		WebElement txtpassword = driver.findElement(By.id("password"));
		txtpassword.sendKeys("Nandakumar");
		
	
		
		
		
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}