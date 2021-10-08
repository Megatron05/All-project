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

public class DateTask {
	public static void main(String[] args) throws IOException {
		File file = new File("C:\\Users\\srini\\eclipse-workspace\\FrameWorkMaven\\Excel\\Data.xlsx");
	FileInputStream stream = new FileInputStream(file);
	Workbook workbook = new XSSFWorkbook(stream);
	Sheet sheet = workbook.getSheet("Sheet1");
	int rowSize = sheet.getPhysicalNumberOfRows();
	
	Row rowHead = sheet.getRow(0);
	int columnSize = rowHead.getPhysicalNumberOfCells();
	
	System.out.println("Row Size : " + rowSize);
	System.out.println("Column Size : " + columnSize);
	
	
	
for (int i = 0; i <rowSize; i++) {
	
	System.out.println(""+"\n"+"Data - "+i+"\n" );
	Row row = sheet.getRow(i);
	for (int j = 0; j < row.getPhysicalNumberOfCells(); j++) {
		Cell cell = row.getCell(j);
		int type = cell.getCellType();
		
		if (type==1) {
			String stringData = cell.getStringCellValue();
			System.out.println(stringData);
			
			
		}
		else if (type==0) {
			if (DateUtil.isCellDateFormatted(cell)) {
				Date getDate = cell.getDateCellValue();
				SimpleDateFormat dateFormat = new SimpleDateFormat("dd-MMM-yyyy");
				String date = dateFormat.format(getDate);
		System.out.println(date);
			
			}
			else  {
				
			
			double numberData = cell.getNumericCellValue();
			long longConv = (long) numberData;
			String stringnum = String.valueOf(longConv);
			System.out.println(stringnum);
			
		}}
		

		
	}
	
}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	}

}
