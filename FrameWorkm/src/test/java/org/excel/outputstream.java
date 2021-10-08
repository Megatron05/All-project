package org.excel;

import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;
import java.util.stream.IntStream;

import org.apache.poi.util.SystemOutLogger;
import org.base.BaseClass;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class outputstream extends BaseClass{
	
	public static void main(String[] args) {
		String path = "C:\\Users\\srini\\eclipse-workspace\\FrameWorkMaven\\Excel\\sample.xlsx";
		
		getDriver("https://www.seleniumeasy.com/test/table-search-filter-demo.html");
		
		
		WebtablePOM o = new WebtablePOM();
		List<WebElement> data2 = o.getData();
		int size = data2.size();
	    List<WebElement> data = o.getRowsData();
	    int size1 = data.size();
	    System.out.println("Size of List--- "+size1);
	    Set<WebElement> s = new LinkedHashSet<>();
	    s.addAll(data);
	    int size2 = s.size();
	    System.out.println("Size of Set--- "+size2);
	    
	    System.out.println("\n"+ "Duplicate words in Table");
	    System.out.println("--------------------------");
	    
	    //For loop for checking Duplicate words in Table and print
	 
	    for (int i = 0; i < data.size(); i++) {
	    	 WebElement webElement = data.get(i);
	    	 String text = webElement.getText();
	    	for (int j = 0; j < data.size(); j++) {
	    		if (i==j) {
					break;}
	    		else {
				WebElement webElement2 = data.get(j);
				String text2 = webElement2.getText();
				boolean equals1 = text2.equals(text);
				if (equals1) {
					System.out.println("index no: "+ i + "---" + text + "-------is equal to index no: "+ j + "---- " +text2);
					break;
				}}	}	}
	    
	    //For loop for Reverse Printing
	    System.out.println("\n"+ "Reverse Printing the Table");
	    System.out.println("--------------------------");
	    
	     for (int i = 0; i < size; i++) {
	    	WebElement webElement = data2.get(i);
	    	String text = webElement.getText();
	    	System.out.print(text+"         ");
			
		}
	    for (int i = 0; i <size1; i=i+(size)) {
	    	System.out.println("\t");
	    	System.out.println("--------------------------------------------------------");
	    	for (int j = size1-(size+i); j <size1-i; j++) {
	    		WebElement webElement = data.get(j);
	    		String text = webElement.getText();
	    		System.out.print(text+"\t");
			}}			    
	    System.out.println("\n"+"\n"+"******Task completed******");
}
}
	
	
	
	
	
	


