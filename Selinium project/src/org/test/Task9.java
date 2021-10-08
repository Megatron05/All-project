package org.test;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.ListIterator;
import java.util.Set;
import java.util.TreeSet;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Task9 {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\srini\\eclipse-workspace\\Selinium project\\driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://en-gb.facebook.com/");

		WebElement tamil = driver.findElement(By.xpath("(//a[@role='button'])[2]"));
		tamil.click();
		Thread.sleep(1100);
		
		WebElement monthText = driver.findElement(By.xpath("//select[@name='birthday_month']"));
		Select select = new Select(monthText);
		List<WebElement> allOptions = select.getOptions();
//		int size2 = allOptions.size();
//		System.out.println(size2);
		Set< WebElement> s = new HashSet<>();
		s.addAll(allOptions);
		int size = s.size();
		//1System.out.println(size);
		

		for (ListIterator<WebElement> iter = allOptions.listIterator(); iter.hasNext(); ) {
		    WebElement element = iter.next();
		    String text = element.getText();
		//  System.out.println(text);
		  Set<WebElement> e = (Set<WebElement>) select.getOptions();
		  System.out.println(e);
		}
		
		driver.quit();
		
		

		
		
		
		
		
		
		
		
		
		
		
		
		
		
		


}}
