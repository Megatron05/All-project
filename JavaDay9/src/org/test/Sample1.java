package org.test;

import java.util.Collection;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class Sample1 {

//Description : Create a LinkedHashMap with the below key and values
    //    key    : 10,20,30,40,50,60,10,50,40
    //   Values : 10,20,30,40,50,60,10,50,40
	public static void main(String[] args) {
		
	
		
		Map<Integer,Integer> m1 = new LinkedHashMap<>();
		
		m1.put(10,10);
		m1.put(20, 20);
		m1.put(30, 30);
		m1.put(40, 40);
		m1.put(50, 50);
		m1.put(60, 60);
		m1.put(10, 10);
		m1.put(50, 50);
		m1.put(40, 40);

		System.out.println(m1);////Printing in insertion order..If Duplicate key enter, first entered value elimenated and replace with new value in same place
	
		        //print only "key" then we go for keyset
				Set<Integer> keySet = m1.keySet();
				System.out.println(keySet);
				
				//print only "value" then we go for keyset
				Collection<Integer> values = m1.values();
				System.out.println(values);
				
				for (Integer string : values) {
					
					System.out.println(string);
					
				}
				for (Integer key : keySet) {
					System.out.println(key);
					
					
				}
				Set<Entry<Integer, Integer>> entrySet = m1.entrySet();
	
				for (Entry<Integer, Integer> entry : entrySet) {
					System.out.println(entry);
				}
				
				for (Entry<Integer, Integer> entry : entrySet) {
					System.out.println(entry.getKey());
					System.out.println(entry.getValue());
	
	
	
	
	
	
	
	}}}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
