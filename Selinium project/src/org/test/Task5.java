package org.test;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Task5 {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\srini\\eclipse-workspace\\Selinium project\\driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://en-gb.facebook.com/");

		WebElement tamil = driver.findElement(By.xpath("(//a[@role='button'])[2]"));
		tamil.click();
		Thread.sleep(3000);

		WebElement monthText = driver.findElement(By.xpath("//select[@name='birthday_month']"));
    	Select select = new Select(monthText);
	    List<WebElement> allOptions = select.getOptions();
	    int size = allOptions.size();
	    		
	    WebElement middle = allOptions.get(size/2);
	    String text = middle.getText();
	    System.out.println(text);
	    
	    
	
}
}