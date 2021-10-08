package org.test;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Task1 {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\srini\\eclipse-workspace\\Selinium project\\driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");

		WebElement tamil = driver.findElement(By.xpath("(//a[@role='button'])[2]"));
		tamil.click();
		Thread.sleep(3000);
		
		WebElement year = driver.findElement(By.id("year"));
		Select select = new Select(year);
		List<WebElement> allOptions = select.getOptions();
		
		for (int i = 0; i < allOptions.size(); i++) {
			WebElement webElement = allOptions.get(i);
			String text = webElement.getText();
			System.out.println(text);
	}
		
		
		Thread.sleep(500);
		driver.quit();
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

}}