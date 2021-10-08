package org.excel;

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
import org.jsoup.helper.DataUtil;
import org.table.MainClass;

public class Excel {
	public static String exceldata(int rownum, int columnum) throws IOException {
		String data= null;
		try { 
		File file = new File("C:\\Users\\srini\\eclipse-workspace\\FrameWorkMaven\\Excel\\data.xlsx");
		FileInputStream stream = new FileInputStream(file);
		Workbook workbook = new XSSFWorkbook(stream);
		Sheet sheet = workbook.getSheet("sheet0");
		Row row = sheet.getRow(rownum);
		Cell cell = row.getCell(columnum);
		int cellType = cell.getCellType();
		if (cellType==1) {
			data = cell.getStringCellValue();
			System.out.println(data);	
		}
		if(cellType==0) {
			if (DateUtil.isCellDateFormatted(cell)) {
		
			
		Date date = cell.getDateCellValue();
		SimpleDateFormat dateFormat = new SimpleDateFormat("dd-MM-yy");
		data = dateFormat.format(date);
			
		}
		else {
			double d = cell.getNumericCellValue();
			long l = (long) d;
			data = String.valueOf(l);
		}}
		
		}
		catch (NullPointerException e) {
			System.out.println("Entered the empty cell location");
		
		}
		return data;}
	
	public static void main(String[] args) throws IOException {
		exceldata(4, 4);
		
		
	}
	
	

}
