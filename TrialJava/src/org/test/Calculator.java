package org.test;

import java.util.Scanner;

public class Calculator {
	
	Scanner s = new Scanner(System.in);
	static int C;
	
    public int add() {
		System.out.println(C);
    	System.out.println("Enter the value1:");
    	int a = s.nextInt();
    	System.out.println("Enter the value2:");
    	int b = s.nextInt();
    	int C = a+b;
    	System.out.println(C);
		 return C;
}
    public int sub() {
    	System.out.println("Enter the value1:");
    	int a = s.nextInt();
    	System.out.println("Enter the value2:");
    	int b = s.nextInt();
    	int C = a-b;
    	System.out.println(C);
		return C;
}  public int multiply() {
	System.out.println("Enter the value1:");
	int a = s.nextInt();
	System.out.println("Enter the value2:");
	int b = s.nextInt();
	int C = a*b;
	System.out.println(C);
	return C;
}  public int divide() {
	System.out.println("Enter the value1:");
	int a = s.nextInt();
	System.out.println("Enter the value2:");
	int b = s.nextInt();
	int C = a/b;
	System.out.println(C);
	return C;
}
	
	
	
	
}
	
	
	

