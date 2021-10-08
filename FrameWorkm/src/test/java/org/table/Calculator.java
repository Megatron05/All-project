package org.table;

import java.util.Scanner;

public class Calculator {
	
	static int C;
		
        Scanner s = new Scanner(System.in);
	    public int calculator() {

	
		System.out.println("Select the any one Options: sum , sub, multiply, divide ; ");
		String text = s.nextLine();
		System.out.println("Enter the value 1: ");
		int value1 = s.nextInt();
		
		System.out.println("Enter the value 2: ");
		int value2 = s.nextInt();
		
		if (text.equals("sum")) {
			
			int C = value1 + value2 ;
			System.out.println(C);
			return C;
			
			
		} else if (text.equals("sub")) {
			
			int C = value1 - value2 ;
			System.out.println(C);
			}
           else if (text.equals("multiply")) {
			
			int C = value1 * value2 ;
			System.out.println(C);
			}
           else if (text.equals("divide")) {
   			
   			int C = value1 / value2 ;
   			System.out.println(C);
		}
           else {
			System.out.println("Select the valid options");
		}
		return value1;
	
	}
	}
	
		
		
		
		
		
		
		
		
	



