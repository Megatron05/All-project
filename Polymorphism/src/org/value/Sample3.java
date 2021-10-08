package org.value;

//Based on order of argument

public class Sample3 {
public void studentDetails(String name, String name1) {
System.out.println("Student name " + name +" Father name "+ name1);
}
public void studentDetails(float fees , String month) {
System.out.println("Fees RS "+fees+" for month of "+month);
}
public void studentDetails(int Class, String group) {
System.out.println("Class "+Class+", "+ "Group "+ group);
}
public void studentDetails(long Contact , float percentage) {
System.out.println("Contact number "+ ", "+Contact+" Percentage "+percentage);
}
public void studentDetails(char gender , String Location ) {
System.out.println("Gender "+gender+", "+" Location "+ Location);
}
public void studentDetails(boolean pass , int year) {
System.out.println("Exam result "
+pass+" Year "+year);
}
public void studentDetails(char section , boolean qualified) {
System.out.println("Section "+section+" Qualified "+ qualified);
}
public static void main(String[] args) {
	Sample3 a = new Sample3();
	a.studentDetails("Nanda kumar", "Vasudevan");
	a.studentDetails(5000.3f, "August");
	a.studentDetails(12, "Biology");
	a.studentDetails(9176997874l, 98.2f);
	a.studentDetails('M', "Chennai");
	a.studentDetails(true, 2021);
	a.studentDetails('A', true);
}
}
