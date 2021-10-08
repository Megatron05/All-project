package org.bank;

public class bankinfo extends Axisbank
{
public void savings() {
	int savings=10;
	System.out.println("The saving percentage is "+savings);
	
}
public void fixed(){
	int fixed=15;
	
System.out.println("The fixed percentage is "+fixed);
}
public static void main(String[] args) {
	bankinfo b=new bankinfo();	
	b.savings();
	b.fixed();
	b.deposit();
}
}
