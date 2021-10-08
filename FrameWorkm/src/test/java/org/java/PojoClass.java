package org.java;

import java.util.ArrayList;
import java.util.List;

public class PojoClass {
	private String username;
	private int id;
	private char gender;
	public static PojoClass name;
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public char getGender() {
		return gender;
	}
	public void setGender(char gender) {
		this.gender = gender;
	}
	public static PojoClass  singletonmethod() {
		if (name==null) {
			name= new PojoClass();
			}	
		return name;
		
		
		
		
	}
public static void main(String[] args) {
	singletonmethod();
	PojoClass s = name;
	s.setUsername("Nandakumar");
	s.setGender('M');
	s.setId(10);
	PojoClass s1 = name;
	s1.setGender('M');
	s1.setId(20);
	s1.setUsername("Srinivasan");
	System.out.println(System.identityHashCode(s1));
	System.out.println(System.identityHashCode(s));
	List<PojoClass> li = new ArrayList<>();
	li.add(s);
	li.add(s1);
	PojoClass pojoClass2 = li.get(0);
	System.out.println(pojoClass2.getGender());
	System.out.println(pojoClass2.getUsername());
	System.out.println(pojoClass2.getId());
	
	for (int i = 0; i < li.size(); i++) {
		PojoClass pojoClass = li.get(i);
		System.out.println(pojoClass.getGender());
		System.out.println(pojoClass.getUsername());
		System.out.println(pojoClass.getId());
		
	}
	
	
	
	
	
}	
	
	
	
	

}
