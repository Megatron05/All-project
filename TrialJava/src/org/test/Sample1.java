package org.test;

public class Sample1 {
	public int sum1;
	public int method1(int a,int b) {
		System.out.println(sum1);
		   sum1 = a+b;
		return sum1;

	}
	public void method2(int c) {
        int d = c+ sum1;
        System.out.println(d);
	}
	public static void main(String[] args) {
		Sample1 s = new Sample1();
		s.method1(15, 30);
		s.method2(20);
	}

	
	
}
