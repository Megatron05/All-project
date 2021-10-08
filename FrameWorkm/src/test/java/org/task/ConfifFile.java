package org.task;

import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;

public class ConfifFile {
	public static void main(String[] args) throws IOException {
		FileReader fileReader = new FileReader("C:\\Users\\srini\\eclipse-workspace\\FrameWorkMaven\\src\\test\\resources\\Config\\config.properties");
		
		Properties properties = new Properties();
		properties.load(fileReader);
		String string = properties.get("url").toString();
		System.out.println(string);
		String string2 = properties.get("username").toString();
		System.out.println(string2);
		
		
		
		
		
		
		
	}
	

}
