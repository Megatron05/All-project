package org.day7;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class RedBus {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\srini\\eclipse-workspace\\Selinium project\\driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.redbus.in/");
		
		

		WebElement findElement = driver.findElement(By.xpath("//div[@class='icon-down icon ich dib icon-down_WO_BAL']"));
		JavascriptExecutor executor = (JavascriptExecutor) driver;
		executor.executeScript("arguments[0].click()", findElement);
		
		WebElement btnSignUp = driver.findElement(By.xpath("//li[@id='signInLink']"));
		btnSignUp.click();
		Thread.sleep(300);
		WebElement iframe = driver.findElement(By.xpath("//iframe[@class='modalIframe']"));
		driver.switchTo().frame(iframe);
		
		WebElement phoneNumber = driver.findElement(By.xpath("//input[@id='mobileNoInp']"));
		phoneNumber.sendKeys("9176997874");
		Thread.sleep(300);
		
	//	WebElement robot = driver.findElement(By.xpath("//span[@id='recaptcha-anchor']"));
   //   executor.executeScript("arguments[0].click()",robot);
		
	}
		

}
