package org.day5;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Sample1 {
	
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\srini\\eclipse-workspace\\Selinium project\\driver\\chromedriver.exe");
			WebDriver driver = new  ChromeDriver();
		driver.get("http://www.amazon.in");
			
			
			driver.manage().window().maximize();
			
		WebElement prime = driver.findElement(By.xpath("//span[text()='Prime']"));
		Actions actions = new Actions(driver);
			actions.moveToElement(prime).perform();
			
			
			
		WebElement clickprime = driver.findElement(By.xpath("//img[@id='multiasins-img-link']"));
		clickprime.click();
			
			
	}
	
	
	
	
	
	
	
	
	
	
	

}
