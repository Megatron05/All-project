package org.snap;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class JavaScript {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\srini\\eclipse-workspace\\Selinium project\\driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
		
		WebElement txtUserName = driver.findElement(By.id("email"));	JavascriptExecutor executor = (JavascriptExecutor) driver;
		executor.executeScript("arguments[0].setAttribute('value','nandamechen@gmail.com')", txtUserName);
		Object getname = executor.executeScript("return arguments[0].getAttribute('value')", txtUserName);
		System.out.println(getname);
		
		WebElement txtpassword = driver.findElement(By.id("pass"));
	executor.executeScript("arguments[0].setAttribute('value','nanmechen')", txtpassword);
		Object getpass = executor.executeScript("return arguments[1,0,0,0].getAttribute('value')", txtpassword,txtUserName);

		System.out.println(getpass);
		
		
		
		driver.quit();
	
	

}}
