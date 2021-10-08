package org.abst;

public class Sample4 {
	public static void main(String[] args) {
		// it can store on same memory location if the enter string same
		String s = "Java";
		String s1 = "Java";
		System.out.println(System.identityHashCode(s)); //2018699554
		System.out.println(System.identityHashCode(s1));//2018699554
		
		//if concat use then it store in different memory allocation even if it same string
		s=s1.concat(s1);
		System.out.println(s);
		
		System.out.println(System.identityHashCode(s1)); //1311053135
		
		s1=s.concat(s);
		System.out.println(System.identityHashCode(s1)); //118352462
		
		System.out.println("***************");
		
		// it can store on different memory location if the enter string same
		String s2 = new String ("Java");
		String s3 = new String ("Java");
		System.out.println(System.identityHashCode(s2)); //1550089733
		System.out.println(System.identityHashCode(s3));//865113938
		
		
		
	System.out.println("***********");	
		
		
		
	
	
	StringBuilder s6 = new StringBuilder("Java");
	System.out.println(System.identityHashCode(s6)); //1442407170
	StringBuilder s7 = new StringBuilder("Program");
	System.out.println(System.identityHashCode(s7)); //1028566121
	s6= s6.append(s7);
	System.out.println(s6); //JavaProgram
	System.out.println(System.identityHashCode(s6)); //1442407170
		
	}
	

}
