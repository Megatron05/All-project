package org.test;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Webtable {
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
            int length = text.length();
			
			if (length==1) {
				System.out.print(text+"       ");
				
			}
			else if(length==8) {
				System.out.print(text+"          ");
				
			}
			else if (length==6) {
				System.out.print(text+"           ");
				}
			else if (length==4) {
			System.out.print(text+"             ");
			}
			
		}
		
	    WebElement body = table.findElement(By.tagName("tbody"));
	    List<WebElement> bodyrows = body.findElements(By.tagName("tr"));
     	for (int i = 0; i < bodyrows.size(); i++) {
		WebElement rows = bodyrows.get(i);
		List<WebElement> rowsData = rows.findElements(By.tagName("td"));
		System.out.println(""+"\n");
		for (int j = 0; j < rowsData.size(); j= j+1) {
			WebElement datas = rowsData.get(j);
			String text = datas.getText();
			int length = text.length();
			
			if (length==1) {
				System.out.print(text+"     ");
				
			}
			else if(length==8) {
				System.out.print(text+"          ");
				
			}
			else if (length==10) {
				System.out.print(text+"        ");
				
			}
			else if (length==9) {
				System.out.print(text+"         ");
				
			}
			else if (length==11) {
				System.out.print(text+"       ");
				
			}
			else if (length==14) {
				System.out.print(text+"    ");
				
			}
			else if (length==13) {
				System.out.print(text+"     ");
				
			}
			else if (length==12) {
				System.out.print(text+"      ");
				
			}
			
		}
		
	}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		driver.quit();
		
		
	}
}
