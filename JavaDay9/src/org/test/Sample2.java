package org.test;

import java.util.Collection;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

public class Sample2 {
	
	public static void main(String[] args) {
		  //	Description : Create a TreeHashMap with the below key and values
	      //  key    : !,@,#,$,%,^,&,*,(,
	     //   Values : 10,20,30,40,50,60,10,50,40
			
			Map<String,Integer> m2 = new TreeMap<>();	
			m2.put(null, 10);
			m2.put(null, 20);
			m2.put(null, 30);
			m2.put("$", 40);
			m2.put("%", 50);
			m2.put("^", 60);
			m2.put("&", 10);
			m2.put("*", 50);
			m2.put("(", 40);
			
			System.out.println(m2);
		
			//print only "key" then we go for keyset
			Set<String> keySet1 = m2.keySet();
			System.out.println(keySet1);
			
			//print only "value" then we go for keyset
			Collection<Integer> values = m2.values();
			System.out.println(values);
			
			
			for (Integer string : values) {
				
				System.out.println(string);
				
			}
			for (String key : keySet1) {
				System.out.println(key);
				
				
			}
			
			
			
			
			
			
			
			
			
			
	}
	

}
