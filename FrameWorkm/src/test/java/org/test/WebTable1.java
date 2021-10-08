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

import io.github.bonigarcia.wdm.WebDriverManager;

public class WebTable1 {
	public static void main(String[] args) throws IOException {
	    	File file = new File("C:\\Users\\srini\\eclipse-workspace\\FrameWorkMaven\\Excel\\new.xlsx");
		
		Workbook workbook = new XSSFWorkbook();
		Sheet sheet = workbook.createSheet();
		
		
	
	WebDriverManager.chromedriver().setup();
	WebDriver driver = new ChromeDriver();
	
    driver.get("https://www.seleniumeasy.com/test/table-search-filter-demo.html");
	
	WebElement table = driver.findElement(By.tagName("table"));
	WebElement heading = table.findElement(By.tagName("thead"));
	WebElement headingrow = heading.findElement(By.tagName("tr"));
	List<WebElement> data = headingrow.findElements(By.tagName("th"));
	   Row row = sheet.createRow(0);

	for (int i = 0; i<data.size() ; i++) {
		Cell cell = row.createCell(i);
     	WebElement webElement = data.get(data.size()-(i+1));
     	String text = webElement.getText();
     	System.out.print(text + "         ");
	    cell.setCellValue(text);}

		    
	   
	 WebElement body = table.findElement(By.tagName("tbody"));
	    List<WebElement> bodyrows = body.findElements(By.tagName("tr"));
  	for (int i = 0; i < bodyrows.size(); i++) {
		WebElement rows = bodyrows.get((bodyrows.size())-(i+1));
		List<WebElement> rowsData = rows.findElements(By.tagName("td"));
		Row rowbody = sheet.createRow(i+1);
		System.out.println("\t");
		System.out.println("---------------------------------------------------");
		
		for (int j = 0; j < rowsData.size(); j++) {
			Cell cell = rowbody.createCell(j);
			WebElement webElement = rowsData.get(rowsData.size()-(j+1));
			String text = webElement.getText();
			System.out.print(text+"\t");
			cell.setCellValue(text);
		}}
  	FileOutputStream stream = new FileOutputStream(file);
	workbook.write(stream);
	driver.quit();
	
	
	
}}
