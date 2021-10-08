package org.test;

import java.util.InputMismatchException;
import java.util.Scanner;


public class Sample {
	private static void tamil() {
Sample s = new Sample();

	}

   public static void main(String[] args) {
	   
	   try {
			  Scanner s = new Scanner (System.in);
		  
		  System.out.println("Select the options :" +"\n" + "1.Sum"+"\n"+"2.Subtract"+"\n" +"3.Multiply"+"\n"+ "4.Divide"+"\n");
		  int input = s.nextInt();
		  
	       Calculator c = new Calculator();
	 
	       if (input==1) {
	    	   int add = c.add();
	    	   if (add==50) {
				System.out.println("Valid");
	    	   }else {
		    		   System.out.println("InValid");
				}
			}
	       else if (input==2) {
	    	   int sub = c.sub();
	    	   if (sub==50) {
				System.out.println("Valid");
	    	   }else {
		    		   System.out.println("InValid");
				}
			}
	       else if (input==3) {
	    	   int multiply = c.multiply();
	    	   if (multiply==50) {
				System.out.println("Valid");
	    	   }else {
		    		   System.out.println("InValid");
				}
			}
	       else if (input==4) {
	    	  int divide = c.divide();
	    	   if (divide==50) {
				System.out.println("Valid");
	    	   }}
	       else {
			System.out.println("Select Valid Option");
			System.out.println();
		}
	       }
	    	   catch (Exception e) {
	    		   System.out.println("Select Valid Option");
	    		  tamil();
	    		   
			}

	    		  
	    		
	    		   
			
		
       
       
}}






