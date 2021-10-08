package org.cons;

public class ClassB extends Sample {
	public ClassB() {
		System.out.println("classB");
	}
	public ClassB(int t) {
		System.out.println(t);
		
	}
	@Override
	public void name() {
		System.out.println("CR7");
	}
	
	public static void main(String[] args) {
		ClassB a =new ClassB();
		a.name();
		      
	} 
	

}
