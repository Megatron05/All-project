package org.test;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Task10 {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\srini\\eclipse-workspace\\Selinium project\\driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://en-gb.facebook.com/");

		WebElement tamil = driver.findElement(By.xpath("(//a[@role='button'])[2]"));
		tamil.click();
		Thread.sleep(3000);
		
		WebElement monthText = driver.findElement(By.xpath("//select[@name='birthday_year']"));
		Select select = new Select(monthText);
		List<WebElement> allOptions = select.getOptions();
		Set<WebElement> s = new HashSet<>();
		s.addAll(allOptions);
		int size = allOptions.size();
		System.out.println(size);
		int size2 = s.size();
		System.out.println(size2);
		if (size ==size2) { 
			System.out.println("No duplicate value present");
			
		}
			else {
				System.out.println("Dupicate value present");
			}
	}}
