package org.test;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Sample2 {
public static void main(String[] args) {
	WebDriverManager.chromedriver().setup();
	WebDriver driver = new ChromeDriver();
	
	driver.get("https://www.seleniumeasy.com/test/table-search-filter-demo.html");
	
	WebElement table = driver.findElement(By.tagName("table"));
	WebElement heading = table.findElement(By.tagName("thead"));
	WebElement headingrow = heading.findElement(By.tagName("tr"));
	List<WebElement> data = headingrow.findElements(By.tagName("th"));

	for (int i = 0; i < data.size(); i++) {
		WebElement head = data.get(i);
		String text = head.getText();
       System.out.print(text+"          ");
	}    
	 WebElement body = table.findElement(By.tagName("tbody"));
	    List<WebElement> bodyrows = body.findElements(By.tagName("tr"));
  	for (int i = 0; i < bodyrows.size(); i=i+2) {
		WebElement rows = bodyrows.get(i);
		List<WebElement> rowsData = rows.findElements(By.tagName("td"));
		System.out.println("\t");
		System.out.println("---------------------------------------------------");
		for (int j = 0; j < rowsData.size(); j++) {
			WebElement head = rowsData.get(j);
			String text = head.getText();
            System.out.print(text);
            System.out.print("\t");
        
        
        
		}
  	}
        
        
        
        driver.quit();
        
        
}

}
