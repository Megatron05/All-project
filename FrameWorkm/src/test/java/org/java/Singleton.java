package org.java;

public class Singleton {
	public static Singleton name;
	
	public static Singleton sample() {
   
	if(name==null)	{
		name = new Singleton();
		
		System.out.println("A");
	}
		System.out.println("B");
		
		return name;
		
		
		
	}
	
	public static void main(String[] args) {
		
		Singleton sample = sample();
		System.out.println(System.identityHashCode(sample));
		Singleton sample1 =sample();
		System.out.println(System.identityHashCode(sample1));
	}

}
