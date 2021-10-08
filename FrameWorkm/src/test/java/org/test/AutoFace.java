package org.test;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.DateUtil;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class AutoFace {
	public static void main(String[] args) throws IOException, InterruptedException {
		WebDriverManager.chromedriver().setup();
		WebDriver driver =new ChromeDriver();
		driver.get("https://www.facebook.com/");
		File file = new File("C:\\Users\\srini\\eclipse-workspace\\FrameWorkMaven\\Excel\\Data.xlsx");
		FileInputStream stream = new FileInputStream(file);
		Workbook workbook = new XSSFWorkbook(stream);
		
		Sheet sheet = workbook.getSheet("Sheet1");
		int rowSize = sheet.getPhysicalNumberOfRows();
		System.out.println("Row Size : " + rowSize);

		Row rowHead = sheet.getRow(0);
		int columnSize = rowHead.getPhysicalNumberOfCells();
		System.out.println("Column Size : " + columnSize);
				
	for (int i = 2; i <rowSize; i++) {
		Row row = sheet.getRow(i);
		Thread.sleep(3000);
		WebElement clkLogin = driver.findElement(By.name("login"));
		clkLogin.click();
		driver.get("https://www.facebook.com/");
	   for (int j = 2; j < row.getPhysicalNumberOfCells(); j++) {
			Cell cell = row.getCell(j);
			int type = cell.getCellType();
			if (type==0) {}
			if (type==1) {
			String string = cell.getStringCellValue();		
			if (j==1) {
				WebElement txtUserName = driver.findElement(By.id("email"));
				txtUserName.sendKeys(string);}
			else if (j==6) {
				WebElement txtPassword = driver.findElement(By.id("pass"));
				txtPassword.sendKeys(string);}}}}}}
	
	


