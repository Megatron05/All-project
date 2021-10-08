package org.abst;

public class Sample2 extends Sample1 {


		
	
	public void tamilnadu() {
System.out.println("tamilnadu");
	}
	public static void main(String[] args) {
		Sample2 a = new Sample2();
		a.partial();
		a.partial1();
		a.partial2();
		a.tamilnadu();
		
		
	}
	@Override
	public void partial1() {
System.out.println("chennai");		
	}
	@Override
	public void partial2() {
System.out.println("omr");		
	}
	

}

