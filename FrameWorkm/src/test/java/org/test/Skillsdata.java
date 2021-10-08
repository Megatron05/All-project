package org.test;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.List;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Skillsdata {
	public static void main(String[] args) throws IOException {
		File file = new File("C:\\Users\\srini\\eclipse-workspace\\FrameWorkMaven\\Excel\\Skills.xlsx");
	
		Workbook workbook = new XSSFWorkbook();
		Sheet sheet = workbook.createSheet();
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new  ChromeDriver();
		driver.get("http://demo.automationtesting.in/Register.html");
		WebElement data = driver.findElement(By.xpath("//select[@id='Skills']"));
		Select select = new Select(data);
		List<WebElement> options = select.getOptions();
		int size = options.size();		
        for (int i = 0; i < size; i++) {
	     Row row = sheet.createRow(i);
	       	Cell cell = row.createCell(0);
	     	WebElement webElement = options.get(i);
	     	String text = webElement.getText();
		    cell.setCellValue(text);
	     }
		FileOutputStream stream = new FileOutputStream(file);
		workbook.write(stream);
		
		
		
		System.out.println("Task completed");
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
}
