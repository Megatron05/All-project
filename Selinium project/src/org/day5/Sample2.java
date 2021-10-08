package org.day5;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Sample2 {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\srini\\eclipse-workspace\\Selinium project\\driver\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		driver.get("http://www.flipkart.com");
		
		
		driver.manage().window().maximize();
		
		WebElement clickclose = driver.findElement(By.xpath("//button[@class='_2KpZ6l _2doB4z']"));
		clickclose.click();
		
		WebElement home = driver.findElement(By.xpath("(//div[@class='xtXmba'])[6]"));
		
		Actions actions = new Actions(driver);
		actions.moveToElement(home).perform();
		
		WebElement furniture = driver.findElement(By.xpath("//a[@class='_6WOcW9 _2-k99T']"));
		furniture.click();
		
		Thread.sleep(200);
		
		WebElement homeFurniture = driver.findElement(By.xpath("(//span[@class='_2I9KP_'])[6]"));
		actions.moveToElement(homeFurniture).perform();
		
		Thread.sleep(200);
		
		WebElement bathTowels = driver.findElement(By.xpath("(//a[@class='_3QN6WI'])[30]"));
		bathTowels.click();
		
		Thread.sleep(3000);
		
		WebElement print = driver.findElement(By.xpath("(//a[@class='s1Q9rs'])[1]"));
		String text = print.getText();
		System.out.println(text);
		
		
		
		
		
		
		
	}

}
