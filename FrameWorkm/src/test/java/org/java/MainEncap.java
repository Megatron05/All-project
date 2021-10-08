package org.java;

import java.util.ArrayList;
import java.util.List;


public class MainEncap {
	
	public static void main(String[] args) {
		
		Encapsulation a = new Encapsulation();
		
		a.setPassword("kumar");
		a.setUsername("Nanda");
		a.setId(123);
		
		Encapsulation b = new Encapsulation();
		b.setPassword("kumar");
		b.setUsername("Nanda");
		b.setId(123);
		
		Encapsulation c = new Encapsulation();
		c.setPassword("kumar");
		c.setUsername("Nanda");
		c.setId(123);
   
	List<Encapsulation> li = new ArrayList<>();
	
	li.add(a);
	li.add(b);
	li.add(c);
	
	for (int i = 0; i < li.size(); i++) {
		Encapsulation cap = li.get(i);
		  System.out.println(cap.getUsername());
			System.out.println(cap.getId());
			System.out.println(cap.getPassword());
		
		
	}
	
	
	
	
	
	
		
		
	}

}
