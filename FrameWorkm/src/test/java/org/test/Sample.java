package org.test;

import java.text.SimpleDateFormat;
import java.util.Collection;
import java.util.Date;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Sample {
	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver =new ChromeDriver();
		driver.get("https://www.facebook.com/");
		
		WebElement txtUserName = driver.findElement(By.id("email"));
		txtUserName.sendKeys("NandaKumar");
		
		WebElement txtPassword = driver.findElement(By.id("pass"));
		txtPassword.sendKeys("123456");
		
//		WebElement clkLogin = driver.findElement(By.name("login"));
//		clkLogin.click();
		
//		JavascriptExecutor executor = (JavascriptExecutor) driver;
//		executor.executeScript("arguments[0].setAtrribute('value','Nandakumar')", txtUserName);
//		
		Date date = new Date();
	
	SimpleDateFormat format = new SimpleDateFormat();
	String format2 = format.format(date);

	System.out.println(format2);
	
		driver.quit();
		
	}

}
