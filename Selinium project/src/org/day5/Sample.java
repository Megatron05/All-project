package org.day5;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Sample {
	
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\srini\\eclipse-workspace\\Selinium project\\driver\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		driver.get("http://demo.guru99.com/test/drag_drop.html");
		
		
		driver.manage().window().maximize();
		
		WebElement s = driver.findElement(By.xpath("(//a[@class='button button-orange'])[5]"));
		WebElement d = driver.findElement(By.xpath("//ol[@id='bank']"));
		
		Actions actions = new Actions(driver);
		actions.dragAndDrop(s, d).perform();
		
		WebElement s1 = driver.findElement(By.xpath("(//a[@class='button button-orange'])[2]"));
		WebElement d1 = driver.findElement(By.xpath("(//ol[@align='center'])[2]"));
		
		actions.dragAndDrop(s1, d1).perform();
		
		WebElement s2 = driver.findElement(By.xpath("(//a[@class='button button-orange'])[6]"));
		WebElement d2 = driver.findElement(By.xpath("(//ol[@align='center'])[3]"));
		
		actions.dragAndDrop(s2, d2).perform();
		
		WebElement s3 = driver.findElement(By.xpath("(//a[@class='button button-orange'])[4]"));
		WebElement d3 = driver.findElement(By.xpath("(//ol[@align='center'])[4]"));
		
		actions.dragAndDrop(s3, d3).perform();
		
		
		
		
		
		
		
		
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	

}
