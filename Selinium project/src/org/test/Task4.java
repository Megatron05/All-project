package org.test;



	import java.util.List;

	import org.openqa.selenium.By;
	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.WebElement;
	import org.openqa.selenium.chrome.ChromeDriver;
	import org.openqa.selenium.support.ui.Select;

	public class Task4 {
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
		
		
		    for (int i = 0; i < 6; i++) {
		    WebElement webElement2 = allOptions.get(i);
		    String text = webElement2.getText();
		    System.out.println(text);
		
			
			
					
		}
		
		Thread.sleep(200);
		driver.quit();


		}}
