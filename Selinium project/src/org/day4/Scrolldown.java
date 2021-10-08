package org.day4;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Scrolldown {
	
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\srini\\eclipse-workspace\\Selinium project\\driver\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.amazon.in/");
		driver.manage().window().maximize();
		JavascriptExecutor	 executor = (JavascriptExecutor) driver;
		
		WebElement scrollDown = driver.findElement(By.xpath("//a[text()='Conditions of Use & Sale']"));
	    executor.executeScript("arguments[0].scrollIntoView(true)", scrollDown);
		
		
	    WebElement scrollup = driver.findElement(By.xpath("//h2[text()='Festive latest launches']"));
	    executor.executeScript("arguments[0].scrollIntoView(false)", scrollup);
		
	
	
	


}}