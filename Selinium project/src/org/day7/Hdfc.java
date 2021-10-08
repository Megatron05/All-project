package org.day7;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Hdfc {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\srini\\eclipse-workspace\\Selinium project\\driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://netbanking.hdfcbank.com/netbanking/");
		
		Thread.sleep(3000);

		//WebElement frame2 = driver.findElement(By.xpath("//frame[@name='login_page']"));	
		driver.switchTo().frame("login_page");

		WebElement findElement = driver.findElement(By.xpath("//input[@type='text']"));
		findElement.sendKeys("Nandakumar");
		
		WebElement findElement2 = driver.findElement(By.xpath("//a[@class='btn btn-primary login-btn']"));
		findElement2.click();
		
		WebElement findElement3 = driver.findElement(By.xpath("(//input[@autocomplete='off'])[3]"));
		findElement3.sendKeys("123456");
		
        WebElement findElement4 = driver.findElement(By.xpath("//input[@name='chkrsastu']"));
		findElement4.click();
		WebElement findElement5 = driver.findElement(By.xpath("//a[@onclick='return fLogon();']"));
		findElement5.click();
		
		
		
		}
		
			
		}
		

		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	
	
	


