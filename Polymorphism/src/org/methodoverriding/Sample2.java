package org.methodoverriding;

public class Sample2 extends Sample1
{

	public void nandaKumar() {
		super.nandaKumar();
	}{
	System.out.println("India");
}
public static void main(String[] args) {
	Sample2 a = new Sample2();
	a.nandaKumar();
	
			
}
}
