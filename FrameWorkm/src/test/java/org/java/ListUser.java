package org.java;

import java.util.ArrayList;
import java.util.List;

public class ListUser extends PojoClass {
	
public static void main(String[] args) {
	PojoClass singletonmethod = PojoClass.singletonmethod();
	PojoClass s = singletonmethod;
	s.setUsername("Nandakumar");
	s.setGender('M');
	s.setId(10);
	PojoClass s1 = singletonmethod;
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
