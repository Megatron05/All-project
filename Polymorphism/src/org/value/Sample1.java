package org.value;

//Based on Number of Argument

public class Sample1 {
	
public void employeeDetails(int id) {
	
	System.out.println("Employee Id is "+ id);
	
}
public void employeeDetails(int year,float salary) {
	
	System.out.println("Employee salary for the year " + year+ " is " + salary);

	}
public void employeeDetails(float weight, String height , char gender ) {
	System.out.println("Employee details "+ "Height = " + height + ", " + "Weight = "+ weight + " , " + "Gender = "+ gender);

}
public void employeeDetails(boolean Marrital, int age , long contact, String location) {
	System.out.println("Personal details "+"Marital status= "+ Marrital+ ","+"Age = "+ age +","+ "Contact number = "+contact+","+"Location ="+location);

}
public static void main(String[] args) {
	Sample1 a = new Sample1();
	a.employeeDetails(23456);
	a.employeeDetails(2021,900000.09f);
    a.employeeDetails(75.5f,"165cm",'M');
    a.employeeDetails(false, 25, 9176997874l, "chennai");
}
}