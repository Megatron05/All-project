package org.task;

import java.util.Scanner;

public class Sample {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int a,i=0,j=0;
		System.out.println("Enter the number :");
		a = s.nextInt();
		while(a>0) {
			i=a%10;
			j= i*10 + i;
			a=a/10;
		
			
		}
		
	
		System.out.println(j);
		
	
		
		
		
	}
	
}