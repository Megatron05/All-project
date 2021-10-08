package org.table;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class WebTable {
	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.seleniumeasy.com/test/table-data-download-demo.html");
		
		WebElement table = driver.findElement(By.tagName("table"));
		WebElement headingrow = table.findElement(By.tagName("thead"));
		WebElement headrow = headingrow.findElement(By.tagName("tr"));
		List<WebElement> heading = headrow.findElements(By.tagName("th"));
		for (int i = 0; i < heading.size(); i++) {
			WebElement webElement = heading.get(i);
			String text = webElement.getText();
			System.out.print(text + "\t"+"\t" );
			
		}
		driver.quit();
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
