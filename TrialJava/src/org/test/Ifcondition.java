package org.test;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class Ifcondition {
	static int value1;
	public static void main(String[] args) {
//		Scanner s =  new Scanner(System.in);
//		System.out.println("Enter the Passenger age below :");
//		String infoage = s.nextLine();
//		System.out.println("Passenger age given :  " + infoage);
//	
//			byte[] bytes = infoage.getBytes();
		
		Date date = new Date();
			SimpleDateFormat dateformat = new SimpleDateFormat("dd-MM-YYYY");
			String format = dateformat.format(date);
	
		System.out.println(format);
		int b=23;
		int c=25;
		int a = b+c;
		
		switch (a=50) {
		
		case 1 :System.out.println("tamil");
		case 2 : System.out.println();
			
			break;

		default:System.out.println("english");
			break;
		}
		
		
		
		
		
		
		
		
		
		
	}

}
