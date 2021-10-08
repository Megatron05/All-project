package org.snap;

import java.io.File;
import java.io.IOException;

import javax.swing.plaf.FileChooserUI;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Screen {
	public static void main(String[] args) throws IOException, InterruptedException {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\srini\\eclipse-workspace\\Selinium project\\driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");

		TakesScreenshot screenShot= (TakesScreenshot) driver;
		Thread.sleep(3000);
		File s = screenShot.getScreenshotAs(OutputType.FILE);
File d = new File("C:\\Users\\srini\\OneDrive\\Desktop\\JAVA Class\\Screenshot\\Nanda.png");
FileUtils.copyFile(s, d);


	}

}
