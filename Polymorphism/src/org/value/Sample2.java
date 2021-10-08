package org.value;

//Based on Data types

public class Sample2 {
	public void studentDetails(String name) {
		System.out.println("Student name is " +name);
	}

	public void studentDetails(int age) {
		System.out.println("Student age is " +age);

	}
	public void studentDetails(float height ) {
System.out.println( "Height is " +height);
	}
	public void studentDetails(char gender) {
		System.out.println("Gender is " + gender);
	}

		public void studentDetails(boolean martial) {
			System.out.println("Martial status is " +martial);
		}
public static void main(String[] args) {
	Sample2 a = new Sample2();
	a.studentDetails("Nandakumar V");
	a.studentDetails(25);
	a.studentDetails(165.1f);
	a.studentDetails('M');
	a.studentDetails(false);
	a.studentDetails(true);
}
}
