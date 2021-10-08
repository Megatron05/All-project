package org.test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Task7 {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\srini\\eclipse-workspace\\Selinium project\\driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://en-gb.facebook.com/");

		WebElement tamil = driver.findElement(By.xpath("(//a[@role='button'])[2]"));
		tamil.click();
		Thread.sleep(3000);

		WebElement monthText = driver.findElement(By.xpath("//select[@name='birthday_month']"));
		String text = monthText.getText();
		System.out.println(text);
}}
