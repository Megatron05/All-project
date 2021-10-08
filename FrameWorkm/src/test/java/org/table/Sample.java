package org.table;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Sample {
	
	public void tc1() {
		try {
			Scanner s = new Scanner(System.in);
			int a = s.nextInt();
			System.out.println(a);
		}
		
		catch(InputMismatchException e) {
			System.out.println("retype the correct input");
			tc1();
			
		}
		
		
	}
	
	
	
public static void main(String[] args) {
	
	Sample a = new Sample();
	a.tc1();
	
}
}
